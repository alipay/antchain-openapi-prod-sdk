// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class ExecFundPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 长度不可超过50
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 资方社会统一信用代码
        [NameInMap("fund_id")]
        [Validation(Required=true)]
        public string FundId { get; set; }

        // 商户社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 商户履约的期数
        [NameInMap("term_index")]
        [Validation(Required=true)]
        public long? TermIndex { get; set; }

        // 签约串类型 
        // TRANSFER:转账代偿签约串 
        // WITHHOLD:代扣代偿签约串
        [NameInMap("retry_type")]
        [Validation(Required=true)]
        public string RetryType { get; set; }

        // 支付类型：
        // ● PERFORMANCE:正常履约
        // ● EXCESS：超额
        [NameInMap("pay_type")]
        [Validation(Required=true)]
        public string PayType { get; set; }

    }

}
