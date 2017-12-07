package com.xa.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 放映
 * @author try hard
 *
 */
public class ShowBean implements Serializable{
    private Integer showId;//放映主键id

    private Integer hallId;//放映厅主键id

    private Integer movieId;//影片主键id

    private String showTimeStart;//影片放映时间

    private String showTimeEnd;//影片结束时间

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

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getShowTimeStart() {
        return showTimeStart;
    }

    public void setShowTimeStart(String showTimeStart) {
        this.showTimeStart = showTimeStart;
    }

    public String getShowTimeEnd() {
        return showTimeEnd;
    }

    public void setShowTimeEnd(String showTimeEnd) {
        this.showTimeEnd = showTimeEnd;
    }
}