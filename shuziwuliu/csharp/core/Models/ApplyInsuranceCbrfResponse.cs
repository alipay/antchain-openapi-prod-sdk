// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceCbrfResponse : TeaModel {
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

        // 投保响应编码
        [NameInMap("insured_receipt_no")]
        [Validation(Required=false)]
        public string InsuredReceiptNo { get; set; }

        // 投保时的标的订单号
        [NameInMap("related_order_no")]
        [Validation(Required=false)]
        public string RelatedOrderNo { get; set; }

        // 保司出具的保单编号
        [NameInMap("policy_no")]
        [Validation(Required=false)]
        public string PolicyNo { get; set; }

        // 返回时间
        [NameInMap("response_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string ResponseTime { get; set; }

        // 幂等标识；true:幂等结果；false: 非幂等结果
        [NameInMap("idem_flag")]
        [Validation(Required=false)]
        public bool? IdemFlag { get; set; }

    }

}
