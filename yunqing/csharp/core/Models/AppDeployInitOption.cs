// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 应用发布配置
    public class AppDeployInitOption : TeaModel {
        // 应用name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品内应用的依赖关系，决定应用的执行顺序
        [NameInMap("release_order")]
        [Validation(Required=true)]
        public long? ReleaseOrder { get; set; }

        // 分组策略：
        //     TWO_GROUP("TWO_GROUP", "分两组"),
        //     ALL_ONE("ALL_ONE", "共分一组"),
        //     EACH_ONE("EACH_ONE", "每台一组"),
        //     SYSTEM_RECOMMENDATION("SYSTEM_RECOMMENDATION", "系统推荐")
        [NameInMap("group_strategy")]
        [Validation(Required=true)]
        public string GroupStrategy { get; set; }

        // 分组是否需要手动确认，默认false
        [NameInMap("need_confirm")]
        [Validation(Required=true)]
        public bool? NeedConfirm { get; set; }

    }

}
