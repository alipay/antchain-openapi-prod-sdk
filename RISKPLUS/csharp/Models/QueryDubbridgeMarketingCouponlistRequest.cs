// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeMarketingCouponlistRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户号
        [NameInMap("customer_no")]
        [Validation(Required=true)]
        public string CustomerNo { get; set; }

        // 优惠券状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 页码
        [NameInMap("page")]
        [Validation(Required=false)]
        public long? Page { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
