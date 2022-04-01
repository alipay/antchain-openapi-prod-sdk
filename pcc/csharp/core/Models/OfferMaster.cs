// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // l5数据
    public class OfferMaster : TeaModel {
        // 内部商品码
        [NameInMap("inner_code")]
        [Validation(Required=true)]
        public string InnerCode { get; set; }

        // 用于展示的格式化商品编码
        [NameInMap("format_code")]
        [Validation(Required=true)]
        public string FormatCode { get; set; }

        // 外部商品编码
        [NameInMap("outer_code")]
        [Validation(Required=true)]
        public string OuterCode { get; set; }

        // 商品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 商品描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 产品code
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 渠道产品编码
        [NameInMap("service_code")]
        [Validation(Required=true)]
        public string ServiceCode { get; set; }

        // l4编码
        [NameInMap("spu_code")]
        [Validation(Required=true)]
        public string SpuCode { get; set; }

    }

}
