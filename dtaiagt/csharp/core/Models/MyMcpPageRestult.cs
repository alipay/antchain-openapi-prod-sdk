// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 我订阅的MCP分页对象
    public class MyMcpPageRestult : TeaModel {
        // total_count
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // trace_id
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // success
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // msg
        [NameInMap("msg")]
        [Validation(Required=true)]
        public string Msg { get; set; }

        // req_id
        [NameInMap("req_id")]
        [Validation(Required=true)]
        public string ReqId { get; set; }

        // MCP分页内容
        [NameInMap("result")]
        [Validation(Required=true)]
        public List<DigitalGatewayMCPPageVO> Result { get; set; }

    }

}
