// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 保险产品类
    public class InsureProductInfo : TeaModel {
        // 产品名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 险种编码: 
        // ACCIDENT: 意外险
        // EMPLOYER: 雇主险
        [NameInMap("insurance_type_code")]
        [Validation(Required=true)]
        public string InsuranceTypeCode { get; set; }

        // 推荐编码
        [NameInMap("recom_flow_no")]
        [Validation(Required=false)]
        public string RecomFlowNo { get; set; }

        // 最低价格（分）
        [NameInMap("premium")]
        [Validation(Required=false)]
        public long? Premium { get; set; }

        // 保额（分）
        [NameInMap("sum_insured")]
        [Validation(Required=false)]
        public long? SumInsured { get; set; }

    }

}
