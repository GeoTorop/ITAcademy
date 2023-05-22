package com.epam.array.entity;

import java.util.Objects;

public class CustomArrayStat {
    Integer min;
    Integer max;
    Integer sum;
    Double avg;
    Integer countPositive;
    Integer countNegative;

    public CustomArrayStat(){}

    public CustomArrayStat(Integer min, Integer max, Integer sum, Double avg, Integer countPositive, Integer countNegative){
        this.min = min;
        this.max = max;
        this.sum = sum;
        this.avg = avg;
        this.countPositive = countPositive;
        this.countNegative = countNegative;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Double getAverage() {
        return avg;
    }

    public void setAverage(Double avg) {
        this.avg = avg;
    }

    public Integer getCountPositive() {
        return countPositive;
    }

    public void setCountPositive(Integer countPositive) {
        this.countPositive = countPositive;
    }

    public Integer getCountNegative() {
        return countNegative;
    }

    public void setCountNegative(Integer countNegative) {
        this.countNegative = countNegative;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArrayStat{");
        sb.append("min=").append(min);
        sb.append(", max=").append(max);
        sb.append(", sum=").append(sum);
        sb.append(", avg=").append(avg);
        sb.append(", countPositive=").append(countPositive);
        sb.append(", countNegative=").append(countNegative);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArrayStat that = (CustomArrayStat) o;

        if (!(o instanceof CustomArrayStat)) return false;

        if (!Objects.equals(min, that.min)) return false;
        if (!Objects.equals(max, that.max)) return false;
        if (!Objects.equals(sum, that.sum)) return false;
        if (!Objects.equals(avg, that.avg)) return false;
        if (!Objects.equals(countPositive, that.countPositive)) return false;
        return Objects.equals(countNegative, that.countNegative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max, sum, avg, countPositive, countNegative);
    }
}
