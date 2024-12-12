package createobjects;

public class Reading {
                                                                                String bookTitle;
    int totalPages;
    int currentPage;
    Boolean isOpen;

    void openBook() {
        isOpen = true;
        currentPage = (int)(Math.random() * (totalPages));
        System.out.println("Opening book " + bookTitle + " to reading page " + currentPage);
    }

    void closeBook() {
        isOpen = false;
        System.out.println("Closing book");
    }
    void changecurrentPage(int newCurrentPage) {
        currentPage = newCurrentPage;
        System.out.println("Changing page to page " + currentPage);
    }

    void readBook() {
        if (!isOpen) {
            openBook();
            System.out.println("Opening book " + bookTitle + " to reading page" + currentPage);
        }
        else
        {
            System.out.println("Reading page " + currentPage);
        }
    }
    void nextPage() {
        currentPage++;
        System.out.println("Next page " + currentPage);
    }
}
