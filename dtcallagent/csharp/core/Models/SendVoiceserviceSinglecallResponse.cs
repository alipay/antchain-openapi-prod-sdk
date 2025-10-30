// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTCALLAGENT.Models
{
    public class SendVoiceserviceSinglecallResponse : TeaModel {
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
        // 返回 OK 代表请求成功。
        // 其他错误码，请参考API错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 状态码的描述。
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 请求 ID
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 此次通话的唯一回执 ID。
        // 可以使用此 CallId，调用查询通话详情接口查询呼叫详情。
        [NameInMap("call_id")]
        [Validation(Required=false)]
        public string CallId { get; set; }

    }

}
