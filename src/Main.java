import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        boolean[] chosenTopics = new boolean[4]; // Theo dõi các chủ đề đã chọn
        String[] topics = {"Aptitude", "English", "Mathematics", "General Knowledge"};

        while (true) {
            System.out.println("\nChọn chủ đề bài test IQ:");
            System.out.println("1) Aptitude");
            System.out.println("2) English");
            System.out.println("3) Mathematics");
            System.out.println("4) General Knowledge");
            System.out.println("5) Exit");

            System.out.print("Nhập lựa chọn của bạn (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                break; // Thoát nếu chọn Exit
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                continue;
            }

            // Kiểm tra nếu người dùng đã chọn chủ đề này
            if (chosenTopics[choice - 1]) {
                System.out.println("Bạn đã tham gia chủ đề này rồi, không thể tham gia lại.");
                continue;
            }

            // Đánh dấu chủ đề này đã được chọn
            chosenTopics[choice - 1] = true;

            // Hiển thị câu hỏi theo từng chủ đề
            switch (choice) {
                case 1: // Aptitude
                    System.out.println("Câu hỏi Aptitude: 2 + 2 = ?");
                    System.out.print("Nhập câu trả lời của bạn: ");
                    int ansAptitude = scanner.nextInt();
                    if (ansAptitude == 4) {
                        System.out.println("Chính xác!");
                        totalScore += 10;
                    } else {
                        System.out.println("Sai rồi.");
                    }
                    break;

                case 2: // English
                    System.out.println("Câu hỏi English: What is the synonym of 'Happy'?");
                    System.out.print("Nhập câu trả lời của bạn (1: Sad, 2: Glad, 3: Angry): ");
                    int ansEnglish = scanner.nextInt();
                    if (ansEnglish == 2) {
                        System.out.println("Chính xác!");
                        totalScore += 10;
                    } else {
                        System.out.println("Sai rồi.");
                    }
                    break;

                case 3: // Mathematics
                    System.out.println("Câu hỏi Mathematics: 5 * 6 = ?");
                    System.out.print("Nhập câu trả lời của bạn: ");
                    int ansMath = scanner.nextInt();
                    if (ansMath == 30) {
                        System.out.println("Chính xác!");
                        totalScore += 10;
                    } else {
                        System.out.println("Sai rồi.");
                    }
                    break;

                case 4: // General Knowledge
                    System.out.println("Câu hỏi General Knowledge: Thủ đô của Việt Nam là gì?");
                    System.out.print("Nhập câu trả lời của bạn: ");
                    scanner.nextLine(); // Đọc bỏ ký tự thừa
                    String ansGK = scanner.nextLine();
                    if (ansGK.equalsIgnoreCase("Hanoi")) {
                        System.out.println("Chính xác!");
                        totalScore += 10;
                    } else {
                        System.out.println("Sai rồi.");
                    }
                    break;
            }
        }

        // Tính điểm Bonus
        int bonusPoints = 0;
        switch (totalScore) {
            case 20:
                bonusPoints = 2;
                break;
            case 30:
                bonusPoints = 5;
                break;
            case 40:
                bonusPoints = 10;
                break;
        }

        // Tính tổng điểm
        int totalWithBonus = totalScore + bonusPoints;

        // Hiển thị kết quả
        System.out.println("\nBonus points earned: " + bonusPoints);
        System.out.println("Total score out of: 50");

        // Xác định mức IQ
        if (totalWithBonus == 0) {
            System.out.println("IQ level: You need reappear the test");
        } else if (totalWithBonus == 10) {
            System.out.println("IQ level: Your IQ level is below average");
        } else if (totalWithBonus == 22) {
            System.out.println("IQ level: Your IQ level is average");
        } else if (totalWithBonus == 35) {
            System.out.println("IQ level: You are Intelligent");
        } else if (totalWithBonus == 50) {
            System.out.println("IQ level: You are a Genius");
        }

        scanner.close();
    }
}
