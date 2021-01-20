// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用管理-当前应用的依赖关系
    public class AppDepend : TeaModel {
        // 当前应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 该应用依赖的所有应用的 id 列表字符串
        [NameInMap("depend_app_names")]
        [Validation(Required=false)]
        public string DependAppNames { get; set; }

        // 应用显示名称
        [NameInMap("app_display_name")]
        [Validation(Required=false)]
        public string AppDisplayName { get; set; }

    }

}
