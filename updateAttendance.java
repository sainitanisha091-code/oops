public static ArrayList<Integer> updateAttendance(
    ArrayList<Integer> students,
    int[] absent,
    int[] newStudents
) {
    for (int i = 0; i < absent.length; i++) {
        if (students.contains(absent[i])) {
            students.remove(Integer.valueOf(absent[i]));
        }
    }

    for (int i = 0; i < newStudents.length; i++) {
        if (!students.contains(newStudents[i])) {
            students.add(Integer.valueOf(newStudents[i]));
        }
    }

    return students;
}
