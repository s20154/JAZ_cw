package pl.pjatk.DamKij;

public class CarModel {
    private Long id;
    private String name;
    private String productionYear;

    public CarModel(String x){
        id = 1L;
        name = x;
        productionYear = "1999";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }
}
