// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class CancelDubbridgeInstallmentOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号：request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 1：现金贷、2：分期付
        // 
        [NameInMap("prod_type")]
        [Validation(Required=false)]
        public string ProdType { get; set; }

        // 待支付的购物订单编号
        [NameInMap("biz_order_no")]
        [Validation(Required=true)]
        public string BizOrderNo { get; set; }

        // 渠道方唯一标识
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 天枢客户号
        [NameInMap("customer_no")]
        [Validation(Required=false)]
        public string CustomerNo { get; set; }

    }

}
