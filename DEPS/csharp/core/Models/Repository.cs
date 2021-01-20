// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // 应用管理-应用代码库信息
    public class Repository : TeaModel {
        // 代码库名字
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 代码库类型，svn或者git
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 代码库地址
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 代码库负责人登录名称
        [NameInMap("owner_login_name")]
        [Validation(Required=false)]
        public string OwnerLoginName { get; set; }

        // 代码库负责人显示名称
        [NameInMap("owner_display_name")]
        [Validation(Required=false)]
        public string OwnerDisplayName { get; set; }

        // 创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string CreatedTime { get; set; }

    }

}
