/**
 * @author	bookingnet
 * @
 * @version	4.0.0
 */
package net.cbtltd.rest.flipkey;

import java.util.Collection;


public class Rates {
	public Rate Rate;

	public Rates(){}
	
	public Rates(Collection<Rate> rates) {
		super();
		this.Rate = new Rate();
		for(Rate rate: rates) {
			if (rate.getDailyMaxRate() != null) {
				this.Rate.setDailyMaxRate(rate.getDailyMaxRate());
			}
			if (rate.getDailyMinRate() != null) {
				this.Rate.setDailyMinRate(rate.getDailyMinRate());
			}
			if (!"".equals(rate.getEndDate())) {
				this.Rate.setEndDate(rate.getEndDate());
			}
			if (!"".equals(rate.getStartDate())) {
				this.Rate.setStartDate(rate.getStartDate());
			}
			if (!"".equals(rate.getLabel())) {
				this.Rate.setLabel(rate.getLabel());
			}
			if (rate.getMinimumStayLength() != null) {
				this.Rate.setMinimumStayLength(rate.getMinimumStayLength());
			}
			if (rate.getMonthlyMaxRate() != null) {
				this.Rate.setMonthlyMaxRate(rate.getMonthlyMaxRate());
			}
			if (rate.getMonthlyMinRate() != null) {
				this.Rate.setMonthlyMinRate(rate.getMonthlyMinRate());
			}
			if (rate.getTurnDay() != null) {
				this.Rate.setTurnDay(rate.getTurnDay());
			}
			if (rate.getWeekendMaxRate() != null) {
				this.Rate.setWeekendMaxRate(rate.getWeekendMaxRate());
			}
			if (rate.getWeekendMinRate() != null) {
				this.Rate.setWeekendMinRate(rate.getWeekendMinRate());
			}
			if (rate.getWeeklyMaxRate() != null) {
				this.Rate.setWeeklyMaxRate(rate.getWeeklyMaxRate());
			}
			if (rate.getWeeklyMinRate() != null) {
				this.Rate.setWeeklyMinRate(rate.getWeeklyMinRate());
			}
		}
	}
}
