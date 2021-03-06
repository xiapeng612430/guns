package com.stylefeng.guns.api.film;

import com.stylefeng.guns.api.film.vo.ActorVO;
import com.stylefeng.guns.api.film.vo.BannerVO;
import com.stylefeng.guns.api.film.vo.CatVO;
import com.stylefeng.guns.api.film.vo.FilmDescVO;
import com.stylefeng.guns.api.film.vo.FilmDetailVO;
import com.stylefeng.guns.api.film.vo.FilmInfo;
import com.stylefeng.guns.api.film.vo.FilmVO;
import com.stylefeng.guns.api.film.vo.ImgVO;
import com.stylefeng.guns.api.film.vo.SourceVO;
import com.stylefeng.guns.api.film.vo.YearVO;
import java.util.List;

/**
 * Created by xianpeng.xia
 * on 2019/9/15 7:47 下午
 */
public interface FilmServiceApi {

    /**
     * @return banners
     */
    List<BannerVO> getBanners();

    /**
     * 热映电影
     */
    FilmVO getHotFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

    /**
     * 即将上映电影
     */
    FilmVO getSoonFilms(boolean isLimit, int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

    /**
     * 经典影片
     */
    FilmVO getClassicFilms(int nums, int nowPage, int sortId, int sourceId, int yearId, int catId);

    /**
     * @return 票房排行榜
     */
    List<FilmInfo> getBoxRanking();

    /**
     * @return 人气排行榜
     */
    List<FilmInfo> getExceptRanking();

    /**
     * @return top100
     */
    List<FilmInfo> getTop();

    /**
     * 分类条件
     */
    List<CatVO> getCats();

    /**
     * 片源条件
     */
    List<SourceVO> getSources();

    /**
     * 年代条件
     */
    List<YearVO> getYears();

    /**
     * 获取影片信息
     */
    FilmDetailVO getFilmDetail(int searchType, String searchParam);

    /**
     * 获取影片描述信息
     */
    FilmDescVO getFilmDesc(String filmId);

    ImgVO getImgs(String filmId);

    /**
     * 获取导演信息
     */
    ActorVO getDictInfo(String filmId);

    /**
     * 获取演员信息
     */
    List<ActorVO> getActors(String filmId);
}
