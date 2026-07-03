// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryQmpOfflinehostplanDecisionresultResponse : TeaModel {
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

        // 安全托管计划编码
        [NameInMap("plan_code")]
        [Validation(Required=false)]
        public string PlanCode { get; set; }

        // EXECUTING/DECISI ON_SUCCESS/DECISION_FAIL/CANCEL。执行中/成功/失败/取消。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 总托管数量
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public long? TotalNum { get; set; }

        // 分层结果数
        [NameInMap("decision_num")]
        [Validation(Required=false)]
        public long? DecisionNum { get; set; }

        // 分层结果的oss文件路径
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 触达确认状态.Y/N,已确认，未确认，当前计划无触达则为空
        [NameInMap("action_confirm_status")]
        [Validation(Required=false)]
        public string ActionConfirmStatus { get; set; }

        // 触达时间
        [NameInMap("action_time")]
        [Validation(Required=false)]
        public string ActionTime { get; set; }

    }

}
