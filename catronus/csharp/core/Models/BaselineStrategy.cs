// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 基线策略
    public class BaselineStrategy : TeaModel {
        // 框架列表
        [NameInMap("frameworks")]
        [Validation(Required=false)]
        public List<Framework> Frameworks { get; set; }

        // cronjob
        [NameInMap("cronjob")]
        [Validation(Required=false)]
        public Cronjob Cronjob { get; set; }

        // 额外配置
        [NameInMap("extended")]
        [Validation(Required=false)]
        public string Extended { get; set; }

    }

}
