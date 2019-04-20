package club.inger.entity;

public class NewsModules {
    private Integer id;

    private String modulesName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModulesName() {
        return modulesName;
    }

    public void setModulesName(String modulesName) {
        this.modulesName = modulesName == null ? null : modulesName.trim();
    }

    @Override
    public String toString() {
        return "NewsModules{" +
                "id=" + id +
                ", modulesName='" + modulesName + '\'' +
                '}';
    }
}