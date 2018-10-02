public enum Subject {
    ASTRONOMY,
    CHEMISTRY,
    MATH,
    GEOGRAPHY,
    PHYSICS;

    public static Subject getSubject(String name) {
        Subject[] values = values();
        for (Subject subject : values) {
            if (subject.name().toLowerCase().equals(name)) {
                return subject;
            }
        }
        return null;
    }


}