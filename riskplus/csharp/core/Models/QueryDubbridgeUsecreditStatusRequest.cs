// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeUsecreditStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求网络流水号
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 1：现金贷（默认）
        // 2：分期付
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

        // prod_type=1时，用信申请的订单号
        [NameInMap("original_order_no")]
        [Validation(Required=true)]
        public string OriginalOrderNo { get; set; }

        // 资产方购物订单号
        [NameInMap("biz_order_no")]
        [Validation(Required=false)]
        public string BizOrderNo { get; set; }

    }

}
