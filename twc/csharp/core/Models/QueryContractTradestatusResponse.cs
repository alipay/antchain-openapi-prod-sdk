// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryContractTradestatusResponse : TeaModel {
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

        // 代扣计划的外部订单号
        [NameInMap("out_trade_no")]
        [Validation(Required=false)]
        public string OutTradeNo { get; set; }

        // 最近一次扣款触发时间戳（单位：ms）
        [NameInMap("deduct_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string DeductTime { get; set; }

        // 创建代扣计划时设置的扣款时间戳（单位：ms）
        [NameInMap("pay_date")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string PayDate { get; set; }

        // 计划扣款金额（单位：分）
        [NameInMap("pay_money")]
        [Validation(Required=false)]
        public long? PayMoney { get; set; }

        // 扣款状态
        // PAY_TOBE_TRIGGER 初始未扣款
        // TRADE_IN_PROGRESS 扣款中
        // TRADE_REFUNDED 已发生退款
        // TRADE_END 交易终止（未成功）
        // TRADE_SUCCESS 扣款成功
        // TRADE_FAIL 扣款失败
        // TRADE_FINISHED 交易终止（扣款成功，并且距离首次扣款超过180天）
        // TRADE_CANCEL 代扣取消
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
