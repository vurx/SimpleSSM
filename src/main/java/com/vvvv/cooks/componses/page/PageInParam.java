package com.vvvv.cooks.componses.page;

/**
 * 分页组建实体类
 */
public class PageInParam {
    /**
     * 当前页数
     */
    private int currentPage = 1;
    /**
     * 每页显示条数
     */
    private int pageSize = 5;
    /**
     * 查询条件
     */
    private String conds = "";

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getConds() {
        return conds;
    }

    public void setConds(String conds) {
        this.conds = conds;
    }
}
