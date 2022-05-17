// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像健康分趋势查询结构体
    public class AppPortraitAppHealthScoreTrendQuery : TeaModel {
        // 日期
        [NameInMap("day")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Day { get; set; }

        // 健康分分值
        [NameInMap("health_score")]
        [Validation(Required=false)]
        public long? HealthScore { get; set; }

    }

}
