package com.bookswipe;

import java.util.ArrayList;
import java.util.List;

public class TemplateManager {
    public static List<BookTemplate> allTemplates = new ArrayList<>();

    public static void printAllTemplates() {
        if (allTemplates.isEmpty()) {
            System.out.println("📭 No book templates found.");
            return;
        }

        System.out.println("📚 All com.bookswipe.Book Templates:");
        int templatecount = 0;
        for (BookTemplate template : allTemplates) {
            templatecount++;
            int count = template.getbook().size();
            System.out.println("- " + template.getTitle() + " by " + template.getAuthor()
                    + " | Genre: " + template.getGenre()
                    + " | Copies: " + count);
        }
        System.out.println("All template = "+templatecount);
    }

    public static BookTemplate getTemplate(String title, String author) {
        for (BookTemplate template : allTemplates) {
            if (template.getTitle().equalsIgnoreCase(title) &&
                    template.getAuthor().equalsIgnoreCase(author)) {
                return template;
            }
        }
        return null; // not found
    }
}