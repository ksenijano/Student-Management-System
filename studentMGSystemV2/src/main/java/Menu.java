import java.util.Scanner;

public class Menu {

    ManagementSystem managementSystem = new ManagementSystem();
    Scanner scannerString = new Scanner(System.in);

    private MenuType menuType;

    public Menu(MenuType menuType) {
        this.menuType = menuType;
    }

    public Menu() {}

    public void start() throws Exception {
        System.out.println("---- WELCOME TO STUDENT MANAGEMENT SYSTEM ----");
        System.out.println("");
        backToMainMenu();
    }

    public void backToMainMenu() throws Exception {
        System.out.println("CHOOSE WHICH MENU YOU WANT TO USE: \n\tSTUDENT \n\tTEACHER \n\tCOURSE \n\tEXAM \n\tEXIT");

        MenuType menuType = MenuType.valueOf(scannerString.nextLine().toUpperCase());
        switch (menuType) {
            case STUDENT:
                System.out.println(actionMenuForStudent());
                break;
            case TEACHER:
                System.out.println(actionMenuForTeacher());
                break;
            case COURSE:
                System.out.println(actionMenuForCourse());
                break;
            case EXAM:
                System.out.println(actionMenuForExam());
                break;
            case EXIT:
                handleExit();
                break;
        }
        System.out.println("CHOOSE OPTION: ");
        String userChoice = scannerString.nextLine();
        try {
            handleUserMenuChoice(menuType, userChoice);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void handleUserMenuChoice(MenuType menuType, String userChoice) throws Exception {
        switch (menuType) {
            case STUDENT:
                handleStudentMenu(userChoice);
                break;
            case TEACHER:
                handleTeacherMenu(userChoice);
                break;
            case COURSE:
                handleCourseMenu(userChoice);
                break;
            case EXAM:
                handleExamMenu(userChoice);
                break;
            default:
                backToMainMenu();
                break;
        }
    }

    private void handleExamMenu(String userChoice) throws Exception {
        switch (userChoice) {
            case "1":
                managementSystem.addExam();
                break;
            case "2":
                managementSystem.displayExamResults();
                break;
            case "3":
                managementSystem.editExamInfo();
                break;
            case "0":
                handleExit();
                break;
            default:
                break;
        }
        backToMainMenu();

    }

    private void handleCourseMenu(String userChoice) throws Exception {
        switch (userChoice) {
            case "1":
                managementSystem.addCourse();
                break;
            case "2":
                managementSystem.displayCourseById();
                break;
            case "3":
                managementSystem.searchCourseById();
                break;
            case "4":
                managementSystem.deleteCourseById();
                break;
            case "5":
                managementSystem.editCourseInfo();
                break;
            case "0":
                handleExit();
                break;
            default:
                break;
        }
        backToMainMenu();
    }

    private void handleTeacherMenu(String userChoice) throws Exception {
        switch (userChoice) {
            case "1":
                managementSystem.addTeacher();
                break;
            case "2":
                managementSystem.displayTeacherById();
                break;
            case "3":
                managementSystem.searchTeacherById();
                break;
            case "4":
                managementSystem.deleteTeacherById();
                break;
            case "5":
                managementSystem.editTeacherInfo();
                break;
            case "0":
                handleExit();
                break;
            default:
                break;
        }
        backToMainMenu();
    }

    private void handleStudentMenu(String userChoice) throws Exception {
        switch (userChoice) {
            case "1":
                managementSystem.addStudent();
                break;
            case "2":
                managementSystem.displayStudentById();
                break;
            case "3":
                managementSystem.searchStudentById();
                break;
            case "4":
                managementSystem.deleteStudentById();
                break;
            case "5":
                managementSystem.editStudentInfo();
                break;
            case "0":
                handleExit();
                break;
            default:
                break;
        }
        backToMainMenu();
    }

    private void handleExit() throws Exception {
        System.out.println("ENTER 1 TO EXIT or 2 TO SHOP MAIN MENU");
        if (scannerString.nextLine().equals("1")) {
            System.exit(0);
        }
        backToMainMenu();
    }

    private String actionMenuForStudent() {
        return "---- STUDENT MENU ----"
                + "\n1.ADD STUDENT"
                + "\n2.DISPLAY STUDENT INFO"
                + "\n3.SEARCH STUDENT BY ID"
                + "\n4.DELETE STUDENT"
                + "\n5.EDIT STUDENT INFO"
                + "\n0.EXIT MG SYSTEM";
    }

    private String actionMenuForTeacher() {
        return "---- TEACHER MENU ----"
                + "\n1.ADD TEACHER"
                + "\n2.DISPLAY TEACHER INFO"
                + "\n3.SEARCH TEACHER BY ID"
                + "\n4.DELETE TEACHER"
                + "\n5.EDIT TEACHER INFO"
                + "\n0.EXIT MG SYSTEM";
    }

    private String actionMenuForCourse() {
        return "---- COURSE MENU ----"
                + "\n1.ADD COURSE"
                + "\n2.DISPLAY COURSE INFO"
                + "\n3.SEARCH COURSE BY ID"
                + "\n4.DELETE COURSE"
                + "\n5.EDIT COURSE INFO"
                + "\n0.EXIT MG SYSTEM";
    }

    private String actionMenuForExam() {
        return "---- EXAM MENU ----"
                + "\n1.ADD EXAM RESULT"
                + "\n2.DISPLAY EXAM AND SCORE INFO"
                + "\n3.EDIT EXAM INFO"
                + "\n0.EXIT MG SYSTEM";
    }
}
