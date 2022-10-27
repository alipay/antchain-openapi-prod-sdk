// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品数字指纹子鉴定项鉴定结果
    public class GoodsDigitalFingerprintPointIdentificationResult : TeaModel {
        // 子鉴定项
        [NameInMap("sub_point_name")]
        [Validation(Required=true)]
        public string SubPointName { get; set; }

        // 商品数字指纹鉴定子项鉴定结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 鉴定子项鉴定得分
        [NameInMap("grade")]
        [Validation(Required=true)]
        public string Grade { get; set; }

    }

}
