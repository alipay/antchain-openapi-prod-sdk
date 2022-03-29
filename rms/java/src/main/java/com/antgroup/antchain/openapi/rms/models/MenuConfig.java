// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class MenuConfig extends TeaModel {
    // 是否需要在顶部菜单展示各个入口
    @NameInMap("show_top_nav_pages")
    @Validation(required = true)
    public Boolean showTopNavPages;

    // 需要隐藏的菜单
    @NameInMap("hide_menus")
    @Validation(required = true)
    public java.util.List<Menu> hideMenus;

    public static MenuConfig build(java.util.Map<String, ?> map) throws Exception {
        MenuConfig self = new MenuConfig();
        return TeaModel.build(map, self);
    }

    public MenuConfig setShowTopNavPages(Boolean showTopNavPages) {
        this.showTopNavPages = showTopNavPages;
        return this;
    }
    public Boolean getShowTopNavPages() {
        return this.showTopNavPages;
    }

    public MenuConfig setHideMenus(java.util.List<Menu> hideMenus) {
        this.hideMenus = hideMenus;
        return this;
    }
    public java.util.List<Menu> getHideMenus() {
        return this.hideMenus;
    }

}
