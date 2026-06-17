// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class EchoGatewayCheckResponse : TeaModel {
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

        // output_demo
        [NameInMap("output_demo")]
        [Validation(Required=false)]
        public DemoClass OutputDemo { get; set; }

        // output_string
        [NameInMap("output_string")]
        [Validation(Required=false)]
        public string OutputString { get; set; }

        // file_url
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

    }

}
