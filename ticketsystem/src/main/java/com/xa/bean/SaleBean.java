package com.xa.bean;

import java.io.Serializable;

/**
 * 售出
 * @author try hard
 *
 */
public class SaleBean implements Serializable{
    private Integer saleId;//售出主键id

    private Integer userId;//购买人主键id

    private Integer movieId;//购买的电影主键id

    private Integer seatNum;//座位号数主键id

    private Integer showId;//放映主键id

    private Integer hallId;

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getHallId() {
        return hallId;
    }

    public void setHallId(Integer hallId) {
        this.hallId = hallId;
    }
}