package desafio.itau.springboot.dto;

import java.util.DoubleSummaryStatistics;

public class StaticsResponse {

    private Long count;
    private double avg;
    private double sum;
    private double max;
    private double min;

    public StaticsResponse(DoubleSummaryStatistics doubleSummaryStatistics){
        if (doubleSummaryStatistics.getCount() == 0){
            this.count = 0L;
            this.avg = 0.0;
            this.sum = 0.0;
            this.max = 0.0;
            this.min = 0.0;
            return;
        }

        this.count = doubleSummaryStatistics.getCount();
        this.avg = doubleSummaryStatistics.getAverage();
        this.sum = doubleSummaryStatistics.getSum();
        this.max = doubleSummaryStatistics.getMax();
        this.min = doubleSummaryStatistics.getMin();
    }

    public Long getCount() {
        return count;
    }
    public double getAvg(){
        return avg;
    }
    public double getSum() {
        return sum;
    }
    public double getMax() {
        return max;
    }
    public double getMin() {
        return min;
    }

}
