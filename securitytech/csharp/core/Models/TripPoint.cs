// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 行程轨迹点
    public class TripPoint : TeaModel {
        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 维度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

    }

}
