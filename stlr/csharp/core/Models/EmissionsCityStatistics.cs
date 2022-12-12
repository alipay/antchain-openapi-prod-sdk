// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 碳排放分城市统计总量
    public class EmissionsCityStatistics : TeaModel {
        // 城市编码
        [NameInMap("city_no")]
        [Validation(Required=true)]
        public string CityNo { get; set; }

        // 城市名称
        [NameInMap("city_name")]
        [Validation(Required=true)]
        public string CityName { get; set; }

        // 累计排放量
        [NameInMap("emission_amount")]
        [Validation(Required=true)]
        public long? EmissionAmount { get; set; }

        // 今日新增碳排放量
        [NameInMap("emission_amount_today")]
        [Validation(Required=true)]
        public long? EmissionAmountToday { get; set; }

        // 总减碳量
        [NameInMap("reduction_amount")]
        [Validation(Required=true)]
        public long? ReductionAmount { get; set; }

        // 今日减碳量
        [NameInMap("reduction_amount_today")]
        [Validation(Required=true)]
        public long? ReductionAmountToday { get; set; }

        // 总抵消量
        [NameInMap("counteraction_amount")]
        [Validation(Required=true)]
        public long? CounteractionAmount { get; set; }

        // 今日抵消量
        [NameInMap("counteraction_amount_today")]
        [Validation(Required=true)]
        public long? CounteractionAmountToday { get; set; }

        // 排放量单位，默认为：
        [NameInMap("data_unit")]
        [Validation(Required=true)]
        public string DataUnit { get; set; }

    }

}
