package desafio.itau.springboot.model;

import java.util.DoubleSummaryStatistics;

public class Statics {

    private Long count;
    private double avg;
    private double sum;
    private double max;
    private double min;

    public Statics(Long count, double avg, double sum, double max, double min){
        this.count = count;
        this.avg = avg;
        this.sum = sum;
        this.max = max;
        this.min = min;
    }

    public Long getCount(){
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
