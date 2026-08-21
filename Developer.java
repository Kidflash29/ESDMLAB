class Developer extends employee {
    private String skill;
    private long bonus;

    public Developer(String empName, int empId, long salary, long bonus) {
        super(empName, empId, salary);
        this.bonus = bonus;
    }

    public void addSkill(String skill) {
        this.skill = skill;
        System.out.println(super.getEmpName() + " knows_ " + skill);
    }

    public void addSkill(String skill, String level) {
        this.skill = skill;
        System.out.println(super.getEmpName() + " is_ " + level + " in skill " + skill);
    }

    public void addSkill(String skill, int exp) {
        this.skill = skill;
        System.out.println(super.getEmpName() + " has_ " + exp + " years of experience in " + skill);
    }

    public void display_data() {
        super.display_data();
        System.out.println("Bonus: " + bonus);
        System.out.println("Skill: " + skill);
    }
}