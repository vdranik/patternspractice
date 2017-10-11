package patterns.behavioral.memento;

import java.util.Date;

public class Game {

    private String level;
    private Date date;

    public void setState(String level, Date date){
        this.level = level;
        this.date = date;
    }

    public void load(Save save){
        level = save.getLevel();
        date = save.getDate();
    }

    public Save save(){
        return new Save(level, date);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Game{");
        sb.append("level='").append(level).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }
}
