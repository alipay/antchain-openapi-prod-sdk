// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class RepayAntchainAtoFundPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantId { get; set; }

        // 融资单的资方社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true, MaxLength=64)]
        public string FundId { get; set; }

        // 商户履约的期数
        [NameInMap("term_index")]
        [Validation(Required=true)]
        public long? TermIndex { get; set; }

        // 还款金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 支付描述
        [NameInMap("payment_description")]
        [Validation(Required=true, MaxLength=64)]
        public string PaymentDescription { get; set; }

    }

}
