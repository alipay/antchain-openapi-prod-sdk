// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PARTNER.Models
{
    // 商品及归属政策相关信息
    public class CommodityPolicyRelation : TeaModel {
        // 商品code
        [NameInMap("commodity_code")]
        [Validation(Required=true)]
        public string CommodityCode { get; set; }

        // 政策ID
        [NameInMap("policy_id")]
        [Validation(Required=true)]
        public string PolicyId { get; set; }

    }

}
