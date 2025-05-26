import java.io.*;
import java.util.*;

class EmailService {
    private EmailDAO dao = new EmailDAO();

    public void sendEmail(String sender, String receiver, String subject, String body) {
        if (sender.isEmpty() || receiver.isEmpty() || subject.isEmpty()) {
            System.out.println("Sender, receiver, and subject cannot be empty.");
            return;
        }
        if (!sender.contains("@") || !receiver.contains("@")) {
            System.out.println("Invalid email format.");
            return;
        }
        Email email = new Email(sender, receiver, subject, body);
        dao.saveEmail(email);
        System.out.println("Email sent successfully.");
    }

    public void showEmails(String user) {
        List<Email> list = dao.getEmailsByUser(user);
        if (list.isEmpty()) {
            System.out.println("No emails found.");
        } else {
            for (Email email : list) {
                System.out.println("\n-----------------------------");
                System.out.println("From   : " + email.getSender());
                System.out.println("To     : " + email.getReceiver());
                System.out.println("Subject: " + email.getSubject());
                System.out.println("Body   : \n" + email.getBody());
            }
        }
    }

    public void showInbox(String receiver) {
        List<Email> list = dao.getEmailsReceivedByUser(receiver);
        if (list.isEmpty()) {
            System.out.println("Inbox is empty.");
        } else {
            for (Email email : list) {
                System.out.println("\n-----------------------------");
                System.out.println("From   : " + email.getSender());
                System.out.println("Subject: " + email.getSubject());
                System.out.println("Body   : \n" + email.getBody());
            }
        }
    }

    public void deleteByDetails(String sender, String receiver, String subject) {
        List<Email> list = dao.getEmailsByUser(sender);
        for (Email email : list) {
            if (email.getSender().equalsIgnoreCase(sender) &&
                email.getReceiver().equalsIgnoreCase(receiver) &&
                email.getSubject().equalsIgnoreCase(subject)) {
                dao.deleteEmail(email);
                System.out.println("Email deleted.");
                return;
            }
        }
        System.out.println("Email not found.");
    }
}
