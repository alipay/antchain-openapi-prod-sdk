// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 行程信息
    public class TravelInfo : TeaModel {
        // 行程码信息
        // 1:没去过疫情区，绿码;
        // 2:去过疫情区，红码;
        // 3:其他，黄码;
        // 0:行程信息不全;
        // -1:查询失败
        [NameInMap("travel_code")]
        [Validation(Required=false)]
        public string TravelCode { get; set; }

        // 行程码异常原因
        [NameInMap("travel_factor")]
        [Validation(Required=false)]
        public string TravelFactor { get; set; }

    }

}
