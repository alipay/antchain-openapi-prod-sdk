// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryEnterpriseProductResponse : TeaModel {
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

        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单状态 PAY_SUCCESS-支付成功 ACTIVATION_SUCCESS-产品开通成功 CLOSED-关单状态
        [NameInMap("event")]
        [Validation(Required=false)]
        public string Event { get; set; }

        // 支付串
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

        // 订单类型 NEW=新购 RENEW=续费
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 产品码
        [NameInMap("commodity_code")]
        [Validation(Required=false)]
        public string CommodityCode { get; set; }

        // 认购类型
        [NameInMap("duration_type")]
        [Validation(Required=false)]
        public string DurationType { get; set; }

        // 认购时长
        [NameInMap("duration_value")]
        [Validation(Required=false)]
        public string DurationValue { get; set; }

    }

}
