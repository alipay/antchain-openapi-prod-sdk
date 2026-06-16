// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    public class CallbackOrderSettlementRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // ASYNC_SETTLE_RESULT ：异步分账结果
        [NameInMap("msg_type")]
        [Validation(Required=true)]
        public string MsgType { get; set; }

        // 支付交易号
        [NameInMap("trade_no")]
        [Validation(Required=true)]
        public string TradeNo { get; set; }

        // 分账金额，单位分
        [NameInMap("split_amount")]
        [Validation(Required=true)]
        public long? SplitAmount { get; set; }

        // 分账受理单号
        [NameInMap("settle_no")]
        [Validation(Required=true)]
        public string SettleNo { get; set; }

        // 分账受理时间
        [NameInMap("split_request_time")]
        [Validation(Required=true)]
        public string SplitRequestTime { get; set; }

        // 分账通知明细
        [NameInMap("split_detail_list")]
        [Validation(Required=true)]
        public List<SettleOrderRoyaltyDetail> SplitDetailList { get; set; }

        // 扩展参数
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 消息唯一性判断，重试msgId不变
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 外部订单号(同一个outProductId唯一)
        [NameInMap("out_order_no")]
        [Validation(Required=true)]
        public string OutOrderNo { get; set; }

        // 分账状态，SUCCESS成功，FAIL失败
        [NameInMap("split_status")]
        [Validation(Required=true)]
        public string SplitStatus { get; set; }

        // 分账失败原因，条件返回：splitStatus=FAIL 返回
        [NameInMap("split_fail_reason")]
        [Validation(Required=false)]
        public string SplitFailReason { get; set; }

    }

}
