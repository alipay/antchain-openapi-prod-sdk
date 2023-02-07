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
        [Validation(Required=false)]
        public string Day { get; set; }

        // 应用可用性
        [NameInMap("app_usability")]
        [Validation(Required=false)]
        public string AppUsability { get; set; }

    }

}
