// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ID_SECURITYTECH.Models
{
    public class QueryDeviceriskDeviceriskResponse : TeaModel {
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

        // code
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // message
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // request_id
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public DeviceRiskResp Data { get; set; }

    }

}
