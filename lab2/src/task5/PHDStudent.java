package task5;

class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }

    @Override
    public String getOccupation() {
        return "PhD Student, major: " + getMajor() + ", research: " + researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            throw new IllegalArgumentException(
                getName() + " is a PhD student and is too busy for dogs!"
            );
        }
        super.assignPet(pet);
    }
}