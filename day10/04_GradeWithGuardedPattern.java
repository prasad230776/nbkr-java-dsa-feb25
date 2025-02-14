 class GradeWithGuardedPattern {
    public static void main(String[] args) {
        Integer marks = 89;
        String grade = switch (marks) {
            case Integer i when i >=80 -> "A";
            case Integer i when i>= 70 -> "B";
            case Integer i when i>= 60 -> "C";
            case Integer i when i>= 50 -> "D";
            default -> "Fail";
                
        };

        System.out.println("Marks :" + marks);
        System.out.println("Grade :" + grade);
    }
}
