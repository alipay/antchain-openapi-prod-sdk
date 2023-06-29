// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYTC.Models
{
    public class JudgeCodeFakescreenResponse : TeaModel {
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

        // 验真是否成功
        [NameInMap("detect_success")]
        [Validation(Required=false)]
        public bool? DetectSuccess { get; set; }

        // 返回编码
        [NameInMap("detect_code")]
        [Validation(Required=false)]
        public string DetectCode { get; set; }

        // 调用返回信息
        [NameInMap("detect_message")]
        [Validation(Required=false)]
        public string DetectMessage { get; set; }

    }

}
