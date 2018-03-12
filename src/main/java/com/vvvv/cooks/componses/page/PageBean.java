package com.vvvv.cooks.componses.page;

import java.util.ArrayList;
import java.util.List;

public class PageBean<T> {
    private IPageDAO<T> pageDao;

    public PageBean(IPageDAO<T> pageDAO) {
        this.pageDao = pageDAO;
    }

    private PageInParam pip = new PageInParam();
    private int countPage = 0;
    private int prev = 0;
    private int next = 0;
    private List<T> data = new ArrayList();

    public PageBean<T> findBean() {
        countPage = pageDao.findCountPage(pip);
        data = pageDao.findCurrentPageData(pip);
        prev = pip.getCurrentPage() - 1 <= 1 ? 1 : pip.getCurrentPage() - 1;
        next = pip.getCurrentPage() + 1 <= countPage ? countPage : pip.getCurrentPage() + 1;
        return this;
    }

    public PageInParam getPip() {
        return pip;
    }

    public void setPip(PageInParam pip) {
        this.pip = pip;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getPrev() {
        return prev;
    }

    public void setPrev(int prev) {
        this.prev = prev;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }
}
