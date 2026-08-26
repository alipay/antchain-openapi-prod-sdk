// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    public class GetAntcloudTradeOrderResponse : TeaModel {
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

        // 订单号
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 订单状态，示例：
        // ORDER_SUCCESS（成功）
        // ORDER_FAIL（失败）
        // ORDER_CANCEL（取消）
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 履约状态；INIT(待履约), DOING(履约中), DONE("履约完成"), FAILED(履约失败)
        [NameInMap("fulfill_status")]
        [Validation(Required=false)]
        public string FulfillStatus { get; set; }

    }

}
