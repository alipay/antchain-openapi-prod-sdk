// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class CreateDigitalkeyPreauthpayRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求流水号，用于标示请求流水的唯一性。
        [NameInMap("out_request_no")]
        [Validation(Required=true)]
        public string OutRequestNo { get; set; }

        // 商户授权资金订单号。
        // 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 订单标题
        [NameInMap("order_title")]
        [Validation(Required=true)]
        public string OrderTitle { get; set; }

        // 需要冻结的金额，实际金额乘以100
        [NameInMap("amount")]
        [Validation(Required=true)]
        public long? Amount { get; set; }

        // 收款账户的支付宝登录号（email或手机号）
        [NameInMap("payee_logon_id")]
        [Validation(Required=true)]
        public string PayeeLogonId { get; set; }

        // 无特殊需要请勿传入；商户可用该参数指定支付渠道。
        // 传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。
        [NameInMap("enable_pay_channels")]
        [Validation(Required=false)]
        public string EnablePayChannels { get; set; }

        // 支付宝二级商户编号
        [NameInMap("sub_merchant_id")]
        [Validation(Required=false)]
        public string SubMerchantId { get; set; }

    }

}
