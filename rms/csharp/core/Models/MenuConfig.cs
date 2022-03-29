// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 菜单配置
    public class MenuConfig : TeaModel {
        // 是否需要在顶部菜单展示各个入口
        [NameInMap("show_top_nav_pages")]
        [Validation(Required=true)]
        public bool? ShowTopNavPages { get; set; }

        // 需要隐藏的菜单
        [NameInMap("hide_menus")]
        [Validation(Required=true)]
        public List<Menu> HideMenus { get; set; }

    }

}
