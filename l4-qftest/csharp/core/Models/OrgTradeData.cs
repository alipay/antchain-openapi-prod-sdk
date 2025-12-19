// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QFTEST.Models
{
    // 机构订单交易记录对象
    public class OrgTradeData : TeaModel {
        // 平台优惠金额。单位：元。
        [NameInMap("discount_amount")]
        [Validation(Required=true)]
        public string DiscountAmount { get; set; }

        // 买家实付金额，单位为元，两位小数。
        [NameInMap("buyer_pay_amount")]
        [Validation(Required=true)]
        public string BuyerPayAmount { get; set; }

        // 买家在支付宝的用户id
        [NameInMap("buyer_user_id")]
        [Validation(Required=true)]
        public string BuyerUserId { get; set; }

        // 支付宝交易号，交易单主键id
        [NameInMap("out_trade_no")]
        [Validation(Required=true)]
        public string OutTradeNo { get; set; }

        // 支付宝订单号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 本次交易打款给卖家的时间
        [NameInMap("send_pay_date")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string SendPayDate { get; set; }

        // 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）、TRADE_FINISHED（交易结束，不可退款）
        [NameInMap("trade_status")]
        [Validation(Required=true)]
        public string TradeStatus { get; set; }

        // 实收金额，单位为元，两位小数。该金额为本笔交易，商户账户能够实际收到的金额
        [NameInMap("receipt_amount")]
        [Validation(Required=true)]
        public string ReceiptAmount { get; set; }

        // 交易的订单金额，单位为元，两位小数。该参数的值为支付时传入的total_amount
        [NameInMap("total_amount")]
        [Validation(Required=true)]
        public string TotalAmount { get; set; }

    }

}
