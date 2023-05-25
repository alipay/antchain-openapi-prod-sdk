// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 策略
    public class Strategy : TeaModel {
        // 策略id
        [NameInMap("strategy_id")]
        [Validation(Required=true)]
        public string StrategyId { get; set; }

        // 策略名
        [NameInMap("strategy_name")]
        [Validation(Required=false)]
        public string StrategyName { get; set; }

        // 镜像相关策略内容
        [NameInMap("image")]
        [Validation(Required=false)]
        public ImageStrategy Image { get; set; }

        // 基线相关策略
        [NameInMap("baseline")]
        [Validation(Required=false)]
        public BaselineStrategy Baseline { get; set; }

        // 运行时策略
        [NameInMap("runtime")]
        [Validation(Required=false)]
        public RuntimeStrategy Runtime { get; set; }

    }

}
