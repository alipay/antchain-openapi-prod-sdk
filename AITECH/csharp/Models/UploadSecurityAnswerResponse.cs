// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityAnswerResponse : TeaModel {
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

        // 四种动作码
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

        // 风险标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<LabelModel> Labels { get; set; }

        // 命中自定义风险词
        [NameInMap("customize_risk_word")]
        [Validation(Required=false)]
        public List<string> CustomizeRiskWord { get; set; }

        // 拒答话术
        [NameInMap("limit_answer")]
        [Validation(Required=false)]
        public string LimitAnswer { get; set; }

        // 回传
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 回传
        [NameInMap("flow_msg_id")]
        [Validation(Required=false)]
        public string FlowMsgId { get; set; }

        // 脱敏后内容
        [NameInMap("obfuscation_data")]
        [Validation(Required=false)]
        public string ObfuscationData { get; set; }

        // 流式处理状态（终态 done）
        [NameInMap("flow_process_state")]
        [Validation(Required=false)]
        public string FlowProcessState { get; set; }

        // 调试字段
        [NameInMap("universal_prompt")]
        [Validation(Required=false)]
        public string UniversalPrompt { get; set; }

        // 调试字段
        [NameInMap("universal_output")]
        [Validation(Required=false)]
        public string UniversalOutput { get; set; }

        // 调试字段
        [NameInMap("finance_prompt")]
        [Validation(Required=false)]
        public string FinancePrompt { get; set; }

        // 调试字段
        [NameInMap("finance_output")]
        [Validation(Required=false)]
        public string FinanceOutput { get; set; }

        // 策略版本
        [NameInMap("strategy_version")]
        [Validation(Required=false)]
        public string StrategyVersion { get; set; }

        // token 用量
        [NameInMap("token_usage")]
        [Validation(Required=false)]
        public TokenUsageSummary TokenUsage { get; set; }

        // 调试信息
        [NameInMap("debug_info")]
        [Validation(Required=false)]
        public string DebugInfo { get; set; }

        // ASR 转写文本
        [NameInMap("transcribed_text")]
        [Validation(Required=false)]
        public string TranscribedText { get; set; }

        // 金融深挖结果
        [NameInMap("findeepdive_result")]
        [Validation(Required=false)]
        public string FindeepdiveResult { get; set; }

        // 金融深挖总览
        [NameInMap("fin_deep_dive_overall")]
        [Validation(Required=false)]
        public string FinDeepDiveOverall { get; set; }

    }

}
