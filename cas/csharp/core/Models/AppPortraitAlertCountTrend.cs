// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用画像告警数趋势结构体
    public class AppPortraitAlertCountTrend : TeaModel {
        // 日期
        [NameInMap("day")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Day { get; set; }

        // 本周期
        [NameInMap("now_cycle")]
        [Validation(Required=true)]
        public string NowCycle { get; set; }

        // 上周期
        [NameInMap("last_cycle")]
        [Validation(Required=true)]
        public string LastCycle { get; set; }

    }

}
