package com.varsity.MessageApp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Gpt {

    static class MessageRecord {
        String id;
        String cellNumber;
        String message;
        String hash;
        String status;

        public MessageRecord(String id, String cellNumber, String message, String hash, String status) {
            this.id = id;
            this.cellNumber = cellNumber;
            this.message = message;
            this.hash = hash;
            this.status = status;
        }
    }

    private static final int MAX_WORDS = 250;
    private static final Set<String> usedIds = new HashSet<>();
    private static final List<MessageRecord> records = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many messages do you want to send? ");
        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {
            System.out.println("\nMessage #" + (i + 1));

            // Cell number
            System.out.print("Enter recipient cell number: ");
            String cellNumber = scanner.nextLine();

            // Message with validation
            String message = "";
            while (true) {
                System.out.println("Enter your message (max 250 words):");
                message = scanner.nextLine();
                int wordCount = message.trim().split("\\s+").length;
                if (wordCount > MAX_WORDS) {
                    System.out.println("⚠️ Message exceeds 250 words. Try again.");
                } else {
                    break;
                }
            }

            // Unique ID generation
            String id = generateUniqueId();

            // Message hash
            String hash = generateHash(id, i + 1, message);

            // Send or discard or archive
            String status = "";
            while (true) {
                System.out.print("Send, discard, or archive the message? (send/discard/archive): ");
                status = scanner.nextLine().trim().toLowerCase();
                if (status.equals("send") || status.equals("discard") || status.equals("archive")) {
                    break;
                } else {
                    System.out.println("Invalid option. Please type 'send', 'discard', or 'archive'.");
                }
            }

            // Save record
            records.add(new MessageRecord(id, cellNumber, message, hash, status));
            System.out.println("📨 Message processed. Total messages so far: " + (i + 1));
        }

        // Write to JSON file
        saveMessagesToJson();
        System.out.println("\n✅ All messages saved to messages.json");
    }

    private static String generateUniqueId() {
        String id;
        Random random = new Random();
        do {
            id = String.format("%010d", random.nextLong() % 1_000_000_0000L);
            if (id.startsWith("-")) id = id.substring(1); // remove negative sign if any
        } while (usedIds.contains(id));
        usedIds.add(id);
        return id;
    }

    private static String generateHash(String id, int messageNumber, String message) {
        String[] words = message.trim().split("\\s+");
        String firstWord = words.length > 0 ? words[0] : "";
        String lastWord = words.length > 1 ? words[words.length - 1] : firstWord;
        return id.substring(0, 2) + ":" + messageNumber + ":" + firstWord + ":" + lastWord;
    }

    private static void saveMessagesToJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("messages.json")) {
            gson.toJson(records, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
