package exercises.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {

    private int ID;

    public AbstractEntity() {
        this.ID = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    }

    public int getID() {
        return ID;
    }
}
