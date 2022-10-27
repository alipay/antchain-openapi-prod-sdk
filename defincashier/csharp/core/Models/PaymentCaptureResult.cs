// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEFINCASHIER.Models
{
    // 支付请款结果
    public class PaymentCaptureResult : TeaModel {
        // 外部业务平台原始交易号
        [NameInMap("out_order_id")]
        [Validation(Required=true)]
        public string OutOrderId { get; set; }

        // 描述资金流的模型，通常资金流分为：SALE 销售模；AUTH_CAPTURE 预授权模式；
        // 
        [NameInMap("fund_mode")]
        [Validation(Required=false)]
        public string FundMode { get; set; }

        // 交易状态。PAYING(支付处理中);PAY_SUCCESS(支付成功);PAY_FAIL(支付失败); CAPTURING(请款中);CAPTURE_SUCCESS(请款成功);CAPTURE_FAIL(请款失败); REFUNDING(退款中);REFUND_SUCCESS(退款成功);REFUND_FAIL(退款失败); CLOSING(关单中);CLOSE_SUCCESS(关单成功);CLOSE_FAIL(关单失败);
        [NameInMap("order_state")]
        [Validation(Required=false)]
        public string OrderState { get; set; }

        // 可用金额，单位为元。可用金额=总金额-已请款金额-已撤销金额。精确到小数点后两位，取值范围[0.01,100000000]
        [NameInMap("available_amount")]
        [Validation(Required=false)]
        public long? AvailableAmount { get; set; }

        // 支付币种三位字母编码。（编码规则遵循https://zh.wikipedia.org/wiki/ISO_4217）
        [NameInMap("available_currency")]
        [Validation(Required=false)]
        public string AvailableCurrency { get; set; }

        // 资金操作状态。PROCESSING(处理中);SUCCESS(成功);FAIL(失败);
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 外部请求ID，需要支持部分请款/退款的平台必填
        // 
        [NameInMap("out_request_id")]
        [Validation(Required=false)]
        public string OutRequestId { get; set; }

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
