// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 获取 Agent 详情 Result
    public class AgentDtailResult : TeaModel {
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

        // trace_id
        [NameInMap("trace_id")]
        [Validation(Required=true)]
        public string TraceId { get; set; }

        // req_id
        [NameInMap("req_id")]
        [Validation(Required=true)]
        public string ReqId { get; set; }

        // 返回结果
        // 
        [NameInMap("result")]
        [Validation(Required=true)]
        public AgentVO Result { get; set; }

    }

}
