package dark.leech.text.item;
/**
 * Code by Darkrai on 8/21/2016.
 */

import java.util.ArrayList;

public class Properties {
    private String name; //Tên truyện
    private String author; //Tác giả
    private String url; //Đường dẩn truyện
    private String cover; //Đường dẫn Cover
    private ArrayList<Chapter> chapList; //Danh sách chương
    private ArrayList<Pager> pageList; //Danh sách trang
    private boolean forum; //Trang get có phải forum hay không
    private int size; //Số chương
    private String savePath; //Thư mục lưu


    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setCover(String cover, String page) {
        if (cover == null) return;
        if (cover.startsWith("http"))
            this.cover = cover;
        else this.cover = page + cover;
    }

    public boolean isForum() {
        return forum;
    }

    public void setForum(boolean forum) {
        this.forum = forum;
    }

    public ArrayList<Chapter> getChapList() {
        return chapList;
    }

    public void setChapList(ArrayList<Chapter> chapList) {
        this.chapList = chapList;
    }

    public ArrayList<Pager> getPageList() {
        return pageList;
    }

    public void setPageList(ArrayList<Pager> pageList) {
        this.pageList = pageList;
    }

}
