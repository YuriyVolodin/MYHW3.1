public class BonusMilesService {
    public int calculate(int price) {
        int bonus;
        int rub = 20;
        bonus = (price / rub);
        return bonus;
    }
}

