// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class CreateBaicorpInternalevaluationasyncResponse : TeaModel {
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

        // 内容质量分
        [NameInMap("content_score")]
        [Validation(Required=false)]
        public string ContentScore { get; set; }

        // 质量分描述
        [NameInMap("content_score_desc")]
        [Validation(Required=false)]
        public string ContentScoreDesc { get; set; }

        // 业务自定义id
        [NameInMap("custom_id")]
        [Validation(Required=false)]
        public string CustomId { get; set; }

        // 导致重复的原因
        [NameInMap("repeat_reason")]
        [Validation(Required=false)]
        public string RepeatReason { get; set; }

        // 是否重复
        [NameInMap("repeat_result")]
        [Validation(Required=false)]
        public bool? RepeatResult { get; set; }

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
