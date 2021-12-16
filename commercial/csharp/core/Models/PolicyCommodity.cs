// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 政策关联商品信息
    public class PolicyCommodity : TeaModel {
        // 政策id
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

        // 商品code
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 商品名称
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // 商品描述
        [NameInMap("commodity_desc")]
        [Validation(Required=false)]
        public string CommodityDesc { get; set; }

    }

}
