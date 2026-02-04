package librarymanagement; // Lưu ý: Dòng này phải giống hệt dòng đầu tiên bên file LibraryManager.java

public class Book {
    // 1. Các thuộc tính (Properties)
    private String id;      // Mã sách
    private String title;   // Tên sách
    private String author;  // Tác giả

    // 2. Hàm khởi tạo (Constructor) - Giúp tạo nhanh một cuốn sách mới
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // 3. Các hàm Getter (Lấy dữ liệu ra)
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // 4. Các hàm Setter (Cập nhật dữ liệu)
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    // (Tùy chọn) Hàm toString để in thông tin sách đẹp hơn nếu cần
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title=" + title + ", author=" + author + '}';
    }
}