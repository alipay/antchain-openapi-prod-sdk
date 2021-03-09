// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 技术栈运行时属性
    public class BuildpackInstances : TeaModel {
        // ecs个数
        [NameInMap("ecses")]
        [Validation(Required=false)]
        public long? Ecses { get; set; }

        // 绑定应用个数
        [NameInMap("app_binded")]
        [Validation(Required=false)]
        public long? AppBinded { get; set; }

    }

}
