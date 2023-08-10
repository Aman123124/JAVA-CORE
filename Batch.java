public class Batch {
    private String batchCode;
    private String course;
    private String name;
    private String startDate;
    private int studentCount;
    private String time;
    private String days;
    private static int totalBatches;

    public Batch(String batchCode, String course, String name, String startDate,
                 int studentCount, String time, String days) {
        this.batchCode = batchCode;
        this.course = course;
        this.name = name;
        this.startDate = startDate;
        this.studentCount = studentCount;
        this.time = time;
        this.days = days;
        totalBatches++;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public String getCourse() {
        return course;
    }

    public String getName() {
        return name;
    }

    public String getStartDate() {
        return startDate;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public String getTime() {
        return time;
    }

    public String getDays() {
        return days;
    }

    public static int getTotalBatches() {
        return totalBatches;
    }

    public static void main(String[] args) {
        // Creating batch objects
        Batch batch1 = new Batch("B001", "Java Programming", "Java Beginners",
                "2023-08-15", 30, "10:00 AM - 12:00 PM", "Mon, Wed, Fri");

        Batch batch2 = new Batch("B002", "Python Programming", "Python Intermediate",
                "2023-08-20", 25, "02:00 PM - 04:00 PM", "Tue, Thu");

        // Getting properties
        System.out.println("Batch 1 Code: " + batch1.getBatchCode());
        System.out.println("Batch 1 Course: " + batch1.getCourse());
        System.out.println("Batch 1 Name: " + batch1.getName());
        System.out.println("Batch 1 Start Date: " + batch1.getStartDate());
        System.out.println("Batch 1 Student Count: " + batch1.getStudentCount());
        System.out.println("Batch 1 Time: " + batch1.getTime());
        System.out.println("Batch 1 Days: " + batch1.getDays());

        System.out.println("Batch 2 Code: " + batch2.getBatchCode());
        System.out.println("Batch 2 Course: " + batch2.getCourse());
        System.out.println("Batch 2 Name: " + batch2.getName());
        System.out.println("Batch 2 Start Date: " + batch2.getStartDate());
        System.out.println("Batch 2 Student Count: " + batch2.getStudentCount());
        System.out.println("Batch 2 Time: " + batch2.getTime());
        System.out.println("Batch 2 Days: " + batch2.getDays());

        System.out.println("Total Batches: " + Batch.getTotalBatches()); // Output: 2
    }
}
