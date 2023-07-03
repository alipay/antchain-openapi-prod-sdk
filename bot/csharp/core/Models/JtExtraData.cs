// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 部标数据查询接口中返回的聚合统计指标结构体
    public class JtExtraData : TeaModel {
        // 查询的时间范围内的行驶总里程
        [NameInMap("delta_mileage")]
        [Validation(Required=true)]
        public long? DeltaMileage { get; set; }

        // 最大车速
        [NameInMap("max_speed")]
        [Validation(Required=true)]
        public long? MaxSpeed { get; set; }

        // 平均车速
        [NameInMap("avg_speed")]
        [Validation(Required=true)]
        public long? AvgSpeed { get; set; }

    }

}
