package entities;

public class Product {
  private String name;
  private Double unitaryValue;
  private int amount;

  public Product(String name, Double unitaryValue, int amount) {
    setName(name);
    setAmount(amount);
    setUnitaryValue(unitaryValue);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getUnitaryValue() {
    return unitaryValue;
  }

  public void setUnitaryValue(Double unitaryValue) {
    this.unitaryValue = unitaryValue;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public Double getTotal() {
    return unitaryValue * amount;
  }

  @Override
  public String toString() {
    return "Product [name=" + name + ", total=" + getTotal() + ", unitaryValue=" + unitaryValue + ", amount=" + amount + "]";
  }
}
