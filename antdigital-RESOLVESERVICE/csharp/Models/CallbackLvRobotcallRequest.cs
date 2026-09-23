// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RESOLVESERVICE.Models
{
    public class CallbackLvRobotcallRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 关联发起呼叫时的请求ID（唯一关联键）
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 案件唯一标识
        [NameInMap("case_id")]
        [Validation(Required=true)]
        public string CaseId { get; set; }

        // 通话状态。示例： connected （已接通）、no_answer （无人接听）
        [NameInMap("call_status")]
        [Validation(Required=true)]
        public string CallStatus { get; set; }

        // 外呼开始时间，ISO 8601格式
        [NameInMap("call_start_time")]
        [Validation(Required=true)]
        public string CallStartTime { get; set; }

        // 外呼时长，单位：秒
        [NameInMap("call_duration")]
        [Validation(Required=true)]
        public long? CallDuration { get; set; }

        // 通话总结
        [NameInMap("call_summary")]
        [Validation(Required=true)]
        public string CallSummary { get; set; }

        // 通话标签。一通通话仅返回一组标签
        [NameInMap("call_tags")]
        [Validation(Required=true)]
        public CallTags CallTags { get; set; }

        // 通话录音下载地址
        [NameInMap("recording_url")]
        [Validation(Required=true)]
        public string RecordingUrl { get; set; }

        // 录音全文，按对话轮次组织
        [NameInMap("transcript")]
        [Validation(Required=true)]
        public List<Transcript> Transcript { get; set; }

    }

}
