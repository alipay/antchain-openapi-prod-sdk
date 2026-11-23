// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    public class QueryAntcloudMarketingagentCreativeStoryboardResponse : TeaModel {
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

        // 任务id回显
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public string TaskId { get; set; }

        // PROCESSING/COMPLETED/FAILED
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 剧集id
        [NameInMap("episode_id")]
        [Validation(Required=false)]
        public string EpisodeId { get; set; }

        // 拆解详情
        [NameInMap("analysis_detail")]
        [Validation(Required=false)]
        public string AnalysisDetail { get; set; }

        // 原片分镜
        [NameInMap("original_storyboards")]
        [Validation(Required=false)]
        public string OriginalStoryboards { get; set; }

        // 新分镜脚本
        [NameInMap("new_storyboard_script")]
        [Validation(Required=false)]
        public string NewStoryboardScript { get; set; }

        // 本阶段费用
        [NameInMap("current_credit")]
        [Validation(Required=false)]
        public long? CurrentCredit { get; set; }

        // COMPLETE / PENDING / MISSING_USAGE / INVALID_USAGE / NOT_BILLABLE
        [NameInMap("credit_status")]
        [Validation(Required=false)]
        public string CreditStatus { get; set; }

        // 终态任务耗时（秒）
        [NameInMap("task_duration_seconds")]
        [Validation(Required=false)]
        public long? TaskDurationSeconds { get; set; }

        // FAILED 时返回的失败原因（脱敏文案）
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

    }

}
