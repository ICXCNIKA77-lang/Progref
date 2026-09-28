public abstract class Sales implements ISales {
    String ShoeBrand;
    int BrandSales;

    public Sales (SalesModel model) {
    this.BrandSales = model.BrandSales;
    this.ShoeBrand = model.ShoeBrand;

    }

    @Override
    public String getShoeBrand() {
        return ShoeBrand;
    }

    @Override
    public int getBrandSales() {
        return BrandSales;
    }

}

