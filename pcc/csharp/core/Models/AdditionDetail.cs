// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // 基于竞品及加成市场逻辑明细
    public class AdditionDetail : TeaModel {
        // 友商名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 友商价格
        [NameInMap("profit")]
        [Validation(Required=false)]
        public string Profit { get; set; }

        // 技术分调整
        [NameInMap("technical_score")]
        [Validation(Required=false)]
        public string TechnicalScore { get; set; }

        // 品牌分调整
        [NameInMap("brand_score")]
        [Validation(Required=false)]
        public string BrandScore { get; set; }

        // BD权限价预估
        [NameInMap("bd_price_predict")]
        [Validation(Required=false)]
        public string BdPricePredict { get; set; }

    }

}
