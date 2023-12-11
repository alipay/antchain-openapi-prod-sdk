// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 地址详细信息
    public class DciUserAddressInfo : TeaModel {
        // 所在国家
        [NameInMap("country")]
        [Validation(Required=false)]
        public string Country { get; set; }

        // 所在省份
        [NameInMap("province")]
        [Validation(Required=false)]
        public string Province { get; set; }

        // 所在城市
        [NameInMap("city")]
        [Validation(Required=false)]
        public string City { get; set; }

        // 识别出的地区
        [NameInMap("district")]
        [Validation(Required=false)]
        public string District { get; set; }

        // 识别出的街道
        [NameInMap("town")]
        [Validation(Required=false)]
        public string Town { get; set; }

        // 识别出的路
        [NameInMap("road")]
        [Validation(Required=false)]
        public string Road { get; set; }

        // 识别出的路号牌
        [NameInMap("road_no")]
        [Validation(Required=false)]
        public string RoadNo { get; set; }

        // 地址详情
        [NameInMap("address_detail")]
        [Validation(Required=false)]
        public string AddressDetail { get; set; }

    }

}
