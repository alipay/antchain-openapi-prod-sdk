// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateWitnessFlowResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public long? Code { get; set; }

        // 流程配置
        [NameInMap("flow_config")]
        [Validation(Required=false)]
        public WitnessFlowConfig FlowConfig { get; set; }

        // 流程创建响应数据
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 见证流程
        [NameInMap("witness_flow_id")]
        [Validation(Required=false)]
        public string WitnessFlowId { get; set; }

    }

}
