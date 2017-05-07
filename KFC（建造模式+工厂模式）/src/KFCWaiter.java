public class KFCWaiter {
	private MealBuilder builder;
	public KFCWaiter(MealBuilder builder){
		this.builder=builder;
	}
	public void setMealBuilder(MealBuilder builder){
		this.builder=builder;
	}
	public Meal construct(){
		builder.bulidFood();
		builder.buildDrink();
		return builder.getMeal();
	}
}
