// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 商品数字指纹信息
    public class GoodsDigitalFingerprintInfo : TeaModel {
        // 品类
        [NameInMap("category")]
        [Validation(Required=true)]
        public string Category { get; set; }

        // 品牌
        [NameInMap("brand")]
        [Validation(Required=true)]
        public string Brand { get; set; }

        // 款式
        [NameInMap("style")]
        [Validation(Required=true)]
        public string Style { get; set; }

        // 商品数字指纹鉴定点列表
        [NameInMap("goods_points")]
        [Validation(Required=true)]
        public List<GoodsDigitalFingerprintPoint> GoodsPoints { get; set; }

    }

}
