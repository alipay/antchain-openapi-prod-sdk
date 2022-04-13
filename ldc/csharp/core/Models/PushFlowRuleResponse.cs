// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class PushFlowRuleResponse : TeaModel {
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

        // 是否灰度环境
        [NameInMap("gray")]
        [Validation(Required=false)]
        public bool? Gray { get; set; }

        // 推送结果
        [NameInMap("rule_result_list")]
        [Validation(Required=false)]
        public List<PushRuleResult> RuleResultList { get; set; }

    }

}
