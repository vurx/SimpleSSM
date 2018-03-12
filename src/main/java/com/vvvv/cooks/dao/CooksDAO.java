package com.vvvv.cooks.dao;

import com.vvvv.cooks.componses.page.IPageDAO;
import com.vvvv.cooks.componses.page.PageInParam;
import com.vvvv.cooks.vo.Cooks;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CooksDAO extends IPageDAO<Cooks> {

    /**
     * 查询所有菜品
     *
     * @return
     */
    @Select("select * from foods")
    public List<Cooks> findAllFood();

    /**
     * 查出当前页数的菜品
     *
     * @param pageInParam
     * @return
     */
    @Select("select c.*,caf.cafid,caf.makedate,f.* from cookers c " +
            "inner join cookandfood caf on c.cookid = caf.cookid " +
            "inner join foods f on caf.foodid= f.foodid " +
            "limit ${(currentPage-1)*pageSize},${pageSize}")
    public List<Cooks> findCurrentPageData(PageInParam pageInParam);

    @Select("select ceil(count(1)/#{pageSize}) from cookandfood")
    public int findCountPage(PageInParam PageInParam);
}
