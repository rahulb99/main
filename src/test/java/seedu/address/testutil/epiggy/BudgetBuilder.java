package seedu.address.testutil.epiggy;

import java.util.Date;

import seedu.address.model.epiggy.Budget;
import seedu.address.model.epiggy.item.Period;
import seedu.address.model.epiggy.item.Price;

/**
 * A utility class to help with building Budget objects.
 */
public class BudgetBuilder {

    public static final String DEFAULT_AMOUNT = "500";
    public static final String DEFAULT_PERIOD = "25";
    public static final String DEFAULT_STARTDATE = "03/02/2019";

    private Price amount;
    private Period days;
    private Date startDate;

    public BudgetBuilder() {
        amount = new Price(DEFAULT_AMOUNT);
        days = new Period(DEFAULT_PERIOD);
        startDate = new Date(DEFAULT_STARTDATE);
    }

    /**
     * Initializes the BudgetBuilder with the data of {@code budgetToCopy}.
     */
    public BudgetBuilder(Budget budgetToCopy) {
        amount = budgetToCopy.getPrice();
        days = budgetToCopy.getPeriod();
        startDate = budgetToCopy.getStartDate();
    }

    /**
     * Sets the {@code Price} of the {@code Budget} that we are building.
     */
    public BudgetBuilder withAmount(String amount) {
        this.amount = new Price(amount);
        return this;
    }

    /**
     * Sets the {@code Period} of the {@code Budget} that we are building.
     */
    public BudgetBuilder withPeriod(String days) {
        this.days = new Period(days);
        return this;
    }

    /**
     * Sets the {@code Date} of the {@code Budget} that we are building.
     */
    public BudgetBuilder withDate(String startDate) {
        this.startDate = new Date(startDate);
        return this;
    }

    public Budget build() {
        return new Budget(amount, days, startDate);
    }

}