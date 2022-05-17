// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 可用性趋势查询
    public class AppPortraitAppUsabilityTrendQuery : TeaModel {
        // 时间以天为单位
        [NameInMap("day")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string Day { get; set; }

        // 应用可用性
        [NameInMap("app_usability")]
        [Validation(Required=false)]
        public long? AppUsability { get; set; }

    }

}
