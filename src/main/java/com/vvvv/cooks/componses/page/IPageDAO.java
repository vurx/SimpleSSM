package com.vvvv.cooks.componses.page;

import java.util.List;

public interface IPageDAO<T> {
    /**
     * 查询符合条件的页面信息
     *
     * @param pageInParam
     * @return
     */
    public List<T> findCurrentPageData(PageInParam pageInParam);

    /**
     * 查询总页数
     *
     * @param PageInParam
     * @return
     */
    public int findCountPage(PageInParam PageInParam);
}