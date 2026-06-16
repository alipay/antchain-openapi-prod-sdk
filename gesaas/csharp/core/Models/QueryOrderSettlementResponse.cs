// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS.Models
{
    public class QueryOrderSettlementResponse : TeaModel {
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

        // 分账受理时间，格式为yyyy-MM-dd HH:mm:ss
        [NameInMap("split_request_time")]
        [Validation(Required=false)]
        public string SplitRequestTime { get; set; }

        // 分账明细
        [NameInMap("split_detail_list")]
        [Validation(Required=false)]
        public List<SettleOrderRoyaltyDetail> SplitDetailList { get; set; }

        // 支付宝 平台订单号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 外部订单号(同一个outProductId唯一)
        [NameInMap("out_order_no")]
        [Validation(Required=false)]
        public string OutOrderNo { get; set; }

        // 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
        [NameInMap("split_status")]
        [Validation(Required=false)]
        public string SplitStatus { get; set; }

        // 分账失败原因
        [NameInMap("split_fail_reason")]
        [Validation(Required=false)]
        public string SplitFailReason { get; set; }

        // 分账单号
        [NameInMap("settle_no")]
        [Validation(Required=false)]
        public string SettleNo { get; set; }

    }

}
