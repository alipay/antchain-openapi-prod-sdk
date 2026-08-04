// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GESAAS_SPI.Models
{
    public class CallbackGesaasOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // PAY_RESULT_MSG：支付结果通知
        // SETTLE_SPLIT_RESULT_MSG ：分账结果通知
        // REFUND_SPLIT_RESULT_MSG：退款退分账结果通知
        [NameInMap("msg_type")]
        [Validation(Required=true)]
        public string MsgType { get; set; }

        // 消息唯一性判断，失败重试msgId不变
        // 即使消息重投、该字段也不会变动
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // traceId， 每一次投递生成唯一id
        // 消息重投后、该字段会变化
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true)]
        public string MerchantId { get; set; }

        // 类型；JSONString字符串
        // 说明：根据不同的msgType类型，messageBody说明如下
        [NameInMap("message_body")]
        [Validation(Required=true)]
        public string MessageBody { get; set; }

    }

}
