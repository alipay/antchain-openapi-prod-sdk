// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 行程信息
    public class TravelInformation : TeaModel {
        // 1:没去过疫情区，绿码;
        // 2:去过疫情区，红码;
        // 3:其他，黄码;
        // 0:行程信息不全;
        // -1查询失败
        [NameInMap("travel_code")]
        [Validation(Required=true)]
        public string TravelCode { get; set; }

        // 行程途径地
        [NameInMap("travel_path")]
        [Validation(Required=true)]
        public string TravelPath { get; set; }

    }

}
