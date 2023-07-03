// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    public class QueryFaceshieldWebResponse : TeaModel {
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

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 请求码，200成功，其他失败，具体见错误码
        // 
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 错误时的返回信息
        // 
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 请求时传入的，若没有传，则系统自动生成
        // 
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public FaceShieldResult Data { get; set; }

    }

}
