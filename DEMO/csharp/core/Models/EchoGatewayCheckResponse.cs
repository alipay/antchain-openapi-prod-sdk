// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    public class EchoGatewayCheckResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

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
