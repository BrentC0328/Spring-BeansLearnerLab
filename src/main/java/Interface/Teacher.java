package Interface;

public interface Teacher {

    public void teach(Learner learner, double numberOfHours);

    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours);


}
