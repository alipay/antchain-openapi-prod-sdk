// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 镜像相关策略
    public class ImageStrategy : TeaModel {
        // 准入
        [NameInMap("access")]
        [Validation(Required=false)]
        public bool? Access { get; set; }

        // 巡检
        [NameInMap("cronjob")]
        [Validation(Required=false)]
        public Cronjob Cronjob { get; set; }

    }

}
