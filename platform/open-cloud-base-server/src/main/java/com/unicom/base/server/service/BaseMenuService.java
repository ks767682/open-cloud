package com.unicom.base.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.unicom.base.client.model.entity.BaseMenu;
import com.unicom.common.model.PageParams;
import com.unicom.common.mybatis.base.service.IBaseService;

import java.util.List;

/**
 * 菜单资源管理
 * @author liuyadu
 */
public interface BaseMenuService extends IBaseService<BaseMenu> {
    /**
     * 分页查询
     *
     * @param pageParams
     * @return
     */
    IPage<BaseMenu> findListPage(PageParams pageParams);

    /**
     * 查询列表
     * @return
     */
    List<BaseMenu> findAllList();

    /**
     * 根据主键获取菜单
     *
     * @param menuId
     * @return
     */
    BaseMenu getMenu(Long menuId);

    /**
     * 检查菜单编码是否存在
     *
     * @param menuCode
     * @return
     */
    Boolean isExist(String menuCode);


    /**
     * 添加菜单资源
     *
     * @param menu
     * @return
     */
    BaseMenu addMenu(BaseMenu menu);

    /**
     * 修改菜单资源
     *
     * @param menu
     * @return
     */
    BaseMenu updateMenu(BaseMenu menu);

    /**
     * 移除菜单
     *
     * @param menuId
     * @return
     */
    void removeMenu(Long menuId);
}
