// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryMerchantexpandMerchantResponse : TeaModel {
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

        // 商户入驻状态
        // INIT 入驻中
        // SUCCESS 入驻成功
        // FAIL 入驻失败
        // MERCHANT_CONFIRM 待商户B站确认
        // SUB_MERCHANT_CREDIT 二级户商户签约中
        [NameInMap("enrollment_status")]
        [Validation(Required=false)]
        public string EnrollmentStatus { get; set; }

        // 入驻失败原因
        [NameInMap("fail_reason")]
        [Validation(Required=false)]
        public string FailReason { get; set; }

        // 商户进件流程待办事件跳转链接
        [NameInMap("pending_event_link")]
        [Validation(Required=false)]
        public string PendingEventLink { get; set; }

        // 京东进件成功二级商户id
        [NameInMap("sub_merchant_id")]
        [Validation(Required=false)]
        public string SubMerchantId { get; set; }

    }

}
