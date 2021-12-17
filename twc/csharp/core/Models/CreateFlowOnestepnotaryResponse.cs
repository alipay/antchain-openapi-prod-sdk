// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CreateFlowOnestepnotaryResponse : TeaModel {
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

        // 返回流程ID，全局唯一
        [NameInMap("flow_id")]
        [Validation(Required=false)]
        public string FlowId { get; set; }

        // 阶段存证结果列表
        [NameInMap("phase_create_result_list")]
        [Validation(Required=false)]
        public List<PhaseCreateResult> PhaseCreateResultList { get; set; }

    }

}
