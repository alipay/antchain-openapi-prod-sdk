// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class InitFundAlipaysettletocardRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 统一社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 支付渠道: ALIPAY-支付宝支付 JDPAY-京东支付
        [NameInMap("pay_channel")]
        [Validation(Required=true)]
        public string PayChannel { get; set; }

        // 京东二级商户号,当pay_channel=JDPAY时，该字段必填
        [NameInMap("sub_merchant_id")]
        [Validation(Required=true)]
        public string SubMerchantId { get; set; }

        // 账单开始日期, 格式：YYYY-MM-DD
        [NameInMap("gmt_plan")]
        [Validation(Required=true)]
        public string GmtPlan { get; set; }

        // 账单结束日期；格式：YYYY-MM-DD
        [NameInMap("gmt_finish")]
        [Validation(Required=true)]
        public string GmtFinish { get; set; }

        // 交易流水
        [NameInMap("bill_type")]
        [Validation(Required=true)]
        public string BillType { get; set; }

    }

}
