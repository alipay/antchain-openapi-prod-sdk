// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryAcctPayResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 签约单号
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单id
        [NameInMap("acct_trade_order_id")]
        [Validation(Required=false)]
        public string AcctTradeOrderId { get; set; }

        // 交易状态
        // ● INIT：待扣款
        // ● TOBE_PAY：扣款中
        // ● SUCCESS：扣款成功【终态】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 扣款金额、单位为分
        [NameInMap("amount")]
        [Validation(Required=false)]
        public long? Amount { get; set; }

        // 实付金额，单位为分，成功时存在
        [NameInMap("real_pay_amount")]
        [Validation(Required=false)]
        public long? RealPayAmount { get; set; }

        // 实收金额，单位为分，成功时存在
        [NameInMap("real_receipt_amount")]
        [Validation(Required=false)]
        public long? RealReceiptAmount { get; set; }

        // 代扣完成时间，成功时存在
        [NameInMap("pay_finish")]
        [Validation(Required=false)]
        public string PayFinish { get; set; }

        // 我方交易流水号，成功时存在
        [NameInMap("pay_order_no")]
        [Validation(Required=false)]
        public long? PayOrderNo { get; set; }

        // 支付宝交易流水号，成功时存在
        [NameInMap("pay_trade_no")]
        [Validation(Required=false)]
        public string PayTradeNo { get; set; }

        // 最新的扣款发起次数
        [NameInMap("cmd_try_num")]
        [Validation(Required=false)]
        public long? CmdTryNum { get; set; }

        // 最新的扣款状态
        [NameInMap("cmd_status")]
        [Validation(Required=false)]
        public string CmdStatus { get; set; }

        // 最新的扣款失败的失败原因
        [NameInMap("cmd_fail_reason")]
        [Validation(Required=false)]
        public string CmdFailReason { get; set; }

        // 最新的我方流水号
        [NameInMap("cmd_pay_order_no")]
        [Validation(Required=false)]
        public string CmdPayOrderNo { get; set; }

        // 最新的支付宝交易流水号
        [NameInMap("cmd_pay_trade_no")]
        [Validation(Required=false)]
        public string CmdPayTradeNo { get; set; }

    }

}
