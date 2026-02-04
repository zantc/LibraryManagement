package librarymanagement; // Đảm bảo tên package trùng với project của bạn

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManager {
    // Danh sách lưu trữ các cuốn sách
    private List<Book> books;

    // Hàm khởi tạo (Constructor)
    public LibraryManager() {
        this.books = new ArrayList<>();
    }

    // 1. Chức năng Thêm sách mới
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Đã thêm sách: " + book.getTitle() + " thành công!");
    }

    // 2. Chức năng Xóa sách theo ID
    public void removeBook(String id) {
        boolean found = false;
        // Duyệt qua danh sách để tìm sách có ID trùng khớp
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId().equals(id)) {
                books.remove(i);
                System.out.println("Đã xóa sách có ID: " + id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sách với ID: " + id);
        }
    }

    // 3. Chức năng Cập nhật thông tin sách (Ví dụ cập nhật Tên sách)
    public void updateBook(String id, String newTitle) {
        for (Book b : books) {
            if (b.getId().equals(id)) {
                b.setTitle(newTitle);
                System.out.println("Đã cập nhật tên sách thành: " + newTitle);
                return;
            }
        }
        System.out.println("Không tìm thấy sách để cập nhật.");
    }

    // 4. Hiển thị tất cả sách trong thư viện
    public void showLibrary() {
        if (books.isEmpty()) {
            System.out.println("Thư viện hiện đang trống.");
        } else {
            System.out.println("--- Danh sách sách trong thư viện ---");
            for (Book b : books) {
                // Giả định class Book của bạn đã có các hàm get (getId, getTitle, getAuthor)
                System.out.println("ID: " + b.getId() + " | Tên: " + b.getTitle() + " | Tác giả: " + b.getAuthor());
            }
            System.out.println("-------------------------------------");
        }
    }
    
    // Hàm main để chạy thử chương trình ngay lập tức
    public static void main(String[] args) {
        LibraryManager lib = new LibraryManager();
        
        // Thêm vài cuốn sách mẫu
        lib.addBook(new Book("B01", "Lap trinh Java", "Nam Nguyen"));
        lib.addBook(new Book("B02", "Cau truc du lieu", "Tran Ha"));
        
        // Hiển thị danh sách
        lib.showLibrary();
        
        // Thử xóa 1 cuốn
        lib.removeBook("B01");
        
        // Hiển thị lại để kiểm tra
        lib.showLibrary();
    }
}