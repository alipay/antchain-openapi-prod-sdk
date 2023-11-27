// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 支付请求结果
    public class PayOrderOpenApiResult : TeaModel {
        // 会员所属业务平台在智能科技的会员ID
        [NameInMap("platform_member_id")]
        [Validation(Required=true)]
        public string PlatformMemberId { get; set; }

        // 外部订单号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 资金模式
        [NameInMap("fund_mode")]
        [Validation(Required=true)]
        public string FundMode { get; set; }

        // 支付提交状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 交易单状态
        [NameInMap("order_state")]
        [Validation(Required=true)]
        public string OrderState { get; set; }

        // 收款账户
        [NameInMap("payee_account")]
        [Validation(Required=true)]
        public AccountDTO PayeeAccount { get; set; }

        // 银行或其他支付服务提供方支付结果描述
        [NameInMap("payment_error_message")]
        [Validation(Required=true)]
        public string PaymentErrorMessage { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=true)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=true)]
        public string SubMsg { get; set; }

        // 蚂蚁交易单ID
        [NameInMap("trade_id")]
        [Validation(Required=true)]
        public string TradeId { get; set; }

        // 授权URL
        [NameInMap("auth_pay_url")]
        [Validation(Required=false)]
        public string AuthPayUrl { get; set; }

    }

}
