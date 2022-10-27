// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品数字指纹鉴定结果
    public class GoodsDigitalFingerprintIdentifyResultData : TeaModel {
        // 鉴定结果
        [NameInMap("identification_result")]
        [Validation(Required=true)]
        public string IdentificationResult { get; set; }

        // 鉴定结果描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 商品数字指纹鉴定点鉴定结果列表
        [NameInMap("point_identification_results")]
        [Validation(Required=true)]
        public List<GoodsDigitalFingerprintPointIdentificationResult> PointIdentificationResults { get; set; }

    }

}
