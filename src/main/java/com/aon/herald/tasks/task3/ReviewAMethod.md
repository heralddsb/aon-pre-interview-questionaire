# Task 3 - Review A Method

The original method **checkStudy**(Student student) has multiple issues that impact readability, maintainability, and correctness:
1. Deep Nesting: The method uses multiple nested if statements, which reduce readability and make the logic harder to follow. Flattening the conditions with a single return statement improves clarity.
2. String Comparison: It uses == to compare strings (student.getTeacherName() == "Lee"), which compares object references instead of string values. Using equals() ensures correct and reliable string comparison.
3. Null Safety: There is no null check for the student object. If null is passed, the method will throw a NullPointerException. Adding a null check makes the method more robust.
4. Hardcoding: The teacher’s name "Lee" is hardcoded, which reduces flexibility. Using a constant or configurable value would make it easier to update or extend.
5. Single Responsibility Principle: The method is checking multiple unrelated conditions sequentially. Breaking these checks into smaller helper methods improves modularity and reusability.

**Refactored Version:**

```java

boolean checkStudy(Student student) {
    if (student == null) return false;

    return student.isLoggedIn()
            && "Lee".equals(student.getTeacherName())
            && student.isEnrolledInMaths()
            && student.hasDistinction();
}

```