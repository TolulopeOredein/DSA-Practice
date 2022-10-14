package commlink;

public class Communication {
    private String message;
    private Integer id;
    private String date;
    private int listId;

    public Communication( Integer id, String message,  String date, int listId) {
        this.message = message;
        this.id = id;
        this.date = date;
        this.listId = listId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    @Override
    public String toString() {
        return "Communication{" +
                "message='" + message + '\'' +
                ", id=" + id +
                ", date='" + date + '\'' +
                ", listId=" + listId +
                '}';
    }
}
