// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALLAGENT.Models
{
    public class QueryVoiceserviceQuerycalldetailResponse : TeaModel {
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

        // 请求状态码。
        // ● 返回 OK 代表请求成功。
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 状态码的描述。
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 返回的呼叫详情。JSON 格式。以下字段仅供参考，以具体返回详情为准。
        // ● caller：主叫号码。
        // ● startDate：通话开始时间。
        // ● stateDesc：通话状态描述。
        // ● duration：通话时长。单位：秒。0：用户未接通。
        // ● callerShowNumber：被叫显号。
        // ● gmtCreate：通话请求的接收时间。
        // ● state：通话状态。通话状态是运营商实时返回的，更多状态信息，请参见通话结果状态码。
        // ● endDate：通话结束时间。
        // ● calleeShowNumber：被叫显号。
        // ● callee：被叫号码。
        // ● aRingTime：a 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
        // ● aEndTime：a 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
        // （待确认）
        // ● bRingTime：b 路响铃开始时间。格式：yyyy-MM-dd HH:mm:ss。
        // ● bEndTime：b 路响铃结束时间。格式：yyyy-MM-dd HH:mm:ss。
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // 本次调用请求的 ID，是由阿里云为该请求生成的唯一标识符，可用于排查和定位问题。
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

    }

}
