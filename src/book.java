/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author canhv
 */
public class book {
    // Khai báo các thuộc tính
    private String id;
    private String title;
    private String author;

    // Constructor (Hàm khởi tạo) - Nên có để khởi tạo đối tượng dễ dàng
    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    // Getter và Setter (Tùy chọn, nhưng cần thiết để truy xuất dữ liệu)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
}
