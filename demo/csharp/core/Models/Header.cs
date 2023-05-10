// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 头文件
    public class Header : TeaModel {
        // 身份信息
        [NameInMap("identity")]
        [Validation(Required=true)]
        public Identity Identity { get; set; }

        // 调用链编号
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // host信息
        [NameInMap("host")]
        [Validation(Required=true)]
        public Host Host { get; set; }

        // 方向
        [NameInMap("direction")]
        [Validation(Required=true)]
        public string Direction { get; set; }

        // 请求类型
        [NameInMap("request_type")]
        [Validation(Required=true)]
        public string RequestType { get; set; }

        // 协议版本
        [NameInMap("protocol_version")]
        [Validation(Required=true)]
        public string ProtocolVersion { get; set; }

    }

}
