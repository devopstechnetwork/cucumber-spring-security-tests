package roombook.appointment;

import java.util.Date;

public class Appointment
{
    private String name;
    private String room;
    private String owner;
    private String creator;
    private Date start;
    private Date end;

    public Appointment()
    {
        this.setName(null);
        this.setRoom(null);
        this.setOwner(null);
        this.setCreator(null);
        this.setStart(null);
        this.setEnd(null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}