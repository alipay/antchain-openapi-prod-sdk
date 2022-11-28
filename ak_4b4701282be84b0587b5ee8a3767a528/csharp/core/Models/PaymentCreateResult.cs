// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_4b4701282be84b0587b5ee8a3767a528.Models
{
    // 创建交易结果
    public class PaymentCreateResult : TeaModel {
        // 	
        // 会员所属业务平台在智能科技的会员ID
        [NameInMap("platform_member_id")]
        [Validation(Required=true)]
        public string PlatformMemberId { get; set; }

        // 付款方在外部业务平台的用户ID
        [NameInMap("out_payer_id")]
        [Validation(Required=true)]
        public string OutPayerId { get; set; }

        // 收款方外部业务平台会员ID，收单场景表示卖家，纯资金场景表示收款方
        [NameInMap("out_payee_id")]
        [Validation(Required=false)]
        public string OutPayeeId { get; set; }

        // 外部业务平台原始交易号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
        [NameInMap("order_state")]
        [Validation(Required=false)]
        public string OrderState { get; set; }

        // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 收款方账号
        [NameInMap("payee_account")]
        [Validation(Required=false)]
        public AccountDTO PayeeAccount { get; set; }

        // 业务错误码(为空表示成功，否则为业务错误码)
        [NameInMap("sub_code")]
        [Validation(Required=false)]
        public string SubCode { get; set; }

        // 业务错误描述
        [NameInMap("sub_msg")]
        [Validation(Required=false)]
        public string SubMsg { get; set; }

    }

}
