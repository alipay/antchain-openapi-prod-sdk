// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 逆变器发电量
    public class InverterGeneration : TeaModel {
        // 逆变器SN
        [NameInMap("inv_sn")]
        [Validation(Required=true)]
        public string InvSn { get; set; }

        // 生产商名称
        [NameInMap("manufacturer")]
        [Validation(Required=true)]
        public string Manufacturer { get; set; }

        // 当日发电量，最多3位小数
        [NameInMap("daily")]
        [Validation(Required=true)]
        public string Daily { get; set; }

        // 累计发电量，最多3位小数
        [NameInMap("total")]
        [Validation(Required=true)]
        public string Total { get; set; }

    }

}
