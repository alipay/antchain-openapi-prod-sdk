// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryBaicorpInternalevaluationasyncResponse : TeaModel {
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

        // 业务自定义id
        [NameInMap("custom_id")]
        [Validation(Required=false)]
        public string CustomId { get; set; }

        // 风险识别结果
        [NameInMap("risk_result")]
        [Validation(Required=false)]
        public string RiskResult { get; set; }

        // 风险识别结果描述
        [NameInMap("risk_result_desc")]
        [Validation(Required=false)]
        public string RiskResultDesc { get; set; }

        // 监测任务ID
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

    }

}
