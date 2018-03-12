package com.vvvv.cooks;

import com.vvvv.cooks.componses.page.PageBean;
import com.vvvv.cooks.dao.CooksDAO;
import com.vvvv.cooks.vo.Cooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CooksService {

    @Autowired
    private CooksDAO cooksDAO;

    /**
     * 查出当前页数的菜品
     * @param currentPage
     * @return
     */
    public PageBean<Cooks> findBean(int currentPage) {
        PageBean<Cooks> pageBean = new PageBean<Cooks>(cooksDAO);
        pageBean.getPip().setCurrentPage(currentPage);
        return pageBean.findBean();
    }

    /**
     * 查出饭店能做的所有食物
     * @return
     */
    public List<Cooks> findAllFood() {
        return cooksDAO.findAllFood();
    }
}
