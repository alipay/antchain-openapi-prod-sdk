// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryOrderRefundResponse : TeaModel {
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

        // 支付交易号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 外部系统传入的退款请求流水号
        [NameInMap("refund_request_no")]
        [Validation(Required=false)]
        public string RefundRequestNo { get; set; }

        // 退款请求状态
        // ● ACCEPT: 受理成功
        // ● PENDING: 需人工介入
        // ● SUCCESS: 成功
        // ● FAILED : 失败
        [NameInMap("refund_status")]
        [Validation(Required=false)]
        public string RefundStatus { get; set; }

        // 退款退分账申请金额
        [NameInMap("refund_amount")]
        [Validation(Required=false)]
        public long? RefundAmount { get; set; }

        // 退款退分账失败原因，条件返回：refundStatus=FAILED 返回
        [NameInMap("refund_failed_reason")]
        [Validation(Required=false)]
        public string RefundFailedReason { get; set; }

        // 退款退分账时间，格式为yyyy-MM-dd HH:mm:ss 
        // 条件返回：refundStatus=SUCCESS 返回
        [NameInMap("refund_time")]
        [Validation(Required=false)]
        public string RefundTime { get; set; }

        // 条件返回：refundStatus=SUCCESS 返回
        // 退分账明细
        [NameInMap("refund_detail_item_list")]
        [Validation(Required=false)]
        public List<RefundDetailItemList> RefundDetailItemList { get; set; }

    }

}
