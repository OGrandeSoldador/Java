package createobjects;

public class Reading {
   private String bookTitle;
   private int totalPages;
   private int currentPage;
   private Boolean isOpen;

    public Reading(String bookTitle, int totalPages) {
        this.setBookTitle(bookTitle);
        this.setTotalPages(totalPages);
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    public void setOpen(Boolean open) {
        isOpen = open;
    }
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public int getTotalPages() {
        return totalPages;
    }
    public Boolean getOpen() {
        return isOpen;
    }
    public int getCurrentPage() {
        return currentPage;
    }

    public void openBook() {
        setOpen(true);
        //getCurrentPage() = (int)(Math.random() * (getTotalPages()));
        System.out.println("Opening book " + getBookTitle() + " to reading page " + getCurrentPage());
    }
    public void closeBook() {
        setOpen(false);
        System.out.println("Closing book");
    }
    public void changecurrentPage(int newCurrentPage) {
        setCurrentPage(newCurrentPage);
        System.out.println("Changing page to page " + getCurrentPage());
    }
    public void readBook() {
        if (!getOpen()) {
            openBook();
            System.out.println("Opening book " + getBookTitle() + " to reading page" + getCurrentPage());
        }
        else
        {
            System.out.println("Reading page " + getCurrentPage());
        }
    }
    public void nextPage() {
        setCurrentPage(getCurrentPage()+ 1);
        System.out.println("Next page: " + getCurrentPage());
    }

    public void Read(Boolean niceSpot,int numPagesToRead, int currentPage) {
        openBook();
        changecurrentPage(currentPage);
        while (numPagesToRead > 0) {
            readBook();
            nextPage();
            numPagesToRead--;
        }
        closeBook();
    }
}
