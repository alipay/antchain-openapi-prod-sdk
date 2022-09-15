// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // AI商品鉴定请求信息
    public class BaiGoodsComparisonReqData : TeaModel {
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

        // 商品鉴定点列表
        [NameInMap("goods_points")]
        [Validation(Required=true)]
        public List<BaiGoodsPoint> GoodsPoints { get; set; }

        // 用户自定义字符串，系统不做处理，会在响应体中带回
        [NameInMap("out_state")]
        [Validation(Required=false)]
        public string OutState { get; set; }

    }

}
