// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用等级视图
    public class AppLevelView : TeaModel {
        // 应用等级基类
        [NameInMap("base_app_level")]
        [Validation(Required=false)]
        public AppLevel BaseAppLevel { get; set; }

        // 应用数量
        [NameInMap("app_count")]
        [Validation(Required=false)]
        public long? AppCount { get; set; }

        // 创建者名称
        [NameInMap("creator_name")]
        [Validation(Required=false)]
        public string CreatorName { get; set; }

    }

}
