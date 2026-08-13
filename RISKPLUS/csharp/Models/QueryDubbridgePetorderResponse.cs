// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgePetorderResponse : TeaModel {
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

        // 内部交易单号	String
        [NameInMap("trade_no_inner")]
        [Validation(Required=false)]
        public string TradeNoInner { get; set; }

        // 支付宝订单号	String
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 交易状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 交易的订单金额	String
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 买家在支付宝的用户id
        [NameInMap("buyer_user_id")]
        [Validation(Required=false)]
        public string BuyerUserId { get; set; }

        // 本次交易打款给卖家的时间
        [NameInMap("send_pay_date")]
        [Validation(Required=false)]
        public string SendPayDate { get; set; }

        // 实收金额
        [NameInMap("receipt_amount")]
        [Validation(Required=false)]
        public string ReceiptAmount { get; set; }

        // 支付渠道编码
        [NameInMap("payment_channel_code")]
        [Validation(Required=false)]
        public string PaymentChannelCode { get; set; }

        // 支付机构编码	String
        [NameInMap("pay_institution_code")]
        [Validation(Required=false)]
        public string PayInstitutionCode { get; set; }

        // 分期期数
        [NameInMap("install_num")]
        [Validation(Required=false)]
        public string InstallNum { get; set; }

    }

}
