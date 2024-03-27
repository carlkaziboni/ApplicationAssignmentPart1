package todo02_assignments;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Assignment {
    /* Compulsory information */
    private final ZonedDateTime endDate;
    private final ZonedDateTime startDate;
    private final BigDecimal    hoursRequired; // use a primitive type if you want

    /* Optional information */
    // The name of the assignment, but it can have no name
    private final String name; // TODO The initialisation of name needs altering

    /* TODO (Much) later, try adding at least one more piece of optional
            information to test your design's flexibility, and how simple you
            can keep the constructor's parameters.
     */
    private final String course;


    /* TODO Optional: check how you can stop other classes manipulating this
            private field. You don't need this exact field for the application,
            though you might want something similar to hold a grouping of some
            data. This exaple is here just to prove a point.
     */
    private final List<String> toProveAPoint = new ArrayList<>();

    public Assignment(ZonedDateTime endDate,
    ZonedDateTime startDate,
    BigDecimal hoursRequired, String name, String course) {
        // Separate parameters per item works but is not a neat technique

        this.endDate       = endDate;
        this.startDate     = startDate;
        this.hoursRequired = hoursRequired;
        this.name          = name;
        this.course        = course;
}

    public Assignment(ZonedDateTime endDate,
                      ZonedDateTime startDate,
                      BigDecimal hoursRequired, String name) {
        // Separate parameters per item works but is not a neat technique

        this.endDate       = endDate;
        this.startDate     = startDate;
        this.hoursRequired = hoursRequired;
        this.name          = name;
        this.course        = "Course Name";
    }

   public Assignment(ZonedDateTime endDate,
                      ZonedDateTime startDate,
                      BigDecimal hoursRequired) {
        // Separate parameters per item works but is not a neat technique

        this.endDate       = endDate;
        this.startDate     = startDate;
        this.hoursRequired = hoursRequired;
        this.name          = "Assignment";
        this.course        = "Course Name";
    }
     
    // getters for immutable objects can safely return the original object

    public ZonedDateTime getStartDate() {return startDate;}
    public String getName() {return name;}
    public ZonedDateTime getEndDate() {return endDate;}
    public String getCourse() {return course;}

    /* TODO This getter is potentially unsafe,
            though BigDecimal has no public methods for altering its state,
            so don't worry about it. Getters for primitive types are safe.
     */
    public long getHoursRequired() {return hoursRequired.longValueExact();}


    // TODO This getter is definitely unsafe: can you make it safe?
    public List<String> getToProveAPoint() {return Collections.unmodifiableList(toProveAPoint);}

    public Duration getDuration(){
        Duration duration = Duration.between(startDate, endDate);
        return duration; // 7 days left: loads of time!
    }
}
