// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class ListLeaseNotaryRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户订单号，需要同twc.notary.lease.order.create接口的传参一致
        [NameInMap("merchant_order_no")]
        [Validation(Required=false)]
        public string MerchantOrderNo { get; set; }

        // 接口订单号，需要同twc.notary.lease.order.create接口的传参一致
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 支付渠道，默认支持Alipay|ThirdParty|CreditCard|BankTransfer|WeChatPay|Other，需要同twc.notary.lease.order.create接口的传参一致
        [NameInMap("payment_channel")]
        [Validation(Required=false)]
        public string PaymentChannel { get; set; }

    }

}
