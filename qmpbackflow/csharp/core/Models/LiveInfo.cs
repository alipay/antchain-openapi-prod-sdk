// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 天枢系统居住信息结构体
    public class LiveInfo : TeaModel {
        // 居住省份
        [NameInMap("live_province")]
        [Validation(Required=false)]
        public string LiveProvince { get; set; }

        // 居住城市
        [NameInMap("live_city")]
        [Validation(Required=false)]
        public string LiveCity { get; set; }

        // 居住区域
        [NameInMap("live_area")]
        [Validation(Required=false)]
        public string LiveArea { get; set; }

        // 居住街道
        [NameInMap("live_street")]
        [Validation(Required=false)]
        public string LiveStreet { get; set; }

        // 居住详细地址
        [NameInMap("live_address")]
        [Validation(Required=false)]
        public string LiveAddress { get; set; }

        // 居住年限
        [NameInMap("live_years")]
        [Validation(Required=false)]
        public long? LiveYears { get; set; }

    }

}
