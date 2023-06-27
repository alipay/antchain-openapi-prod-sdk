// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 国内商标对应商品信息
    public class DomesticTmGoodsInfo : TeaModel {
        // 商品中文名称
        [NameInMap("goods_cn_name")]
        [Validation(Required=false)]
        public string GoodsCnName { get; set; }

        // 类似群编码
        [NameInMap("similar_code")]
        [Validation(Required=false)]
        public string SimilarCode { get; set; }

    }

}
