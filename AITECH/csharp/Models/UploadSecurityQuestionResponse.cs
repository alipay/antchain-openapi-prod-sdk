// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class UploadSecurityQuestionResponse : TeaModel {
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

        // PASS
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

        // 回传消息 ID
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 知识库匹配提问
        [NameInMap("match_q")]
        [Validation(Required=false)]
        public string MatchQ { get; set; }

        // 安全代答内容
        [NameInMap("security_answer")]
        [Validation(Required=false)]
        public string SecurityAnswer { get; set; }

        // 安全提示
        [NameInMap("security_prompt")]
        [Validation(Required=false)]
        public string SecurityPrompt { get; set; }

        // 越狱标签（旧字段）
        [NameInMap("jailbreak_label")]
        [Validation(Required=false)]
        public string JailbreakLabel { get; set; }

        // 攻击标签
        [NameInMap("attack_labels")]
        [Validation(Required=false)]
        public List<AttackLabelModel> AttackLabels { get; set; }

        // 领域识别
        [NameInMap("field_info")]
        [Validation(Required=false)]
        public FieldModel FieldInfo { get; set; }

        // 回传会话 ID
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
        [NameInMap("token_usage")]
        [Validation(Required=false)]
        public TokenUsageSummary TokenUsage { get; set; }

        // ASR 转写文本
        [NameInMap("transcribed_text")]
        [Validation(Required=false)]
        public string TranscribedText { get; set; }

        // 调试信息
        [NameInMap("debug_info")]
        [Validation(Required=false)]
        public string DebugInfo { get; set; }

        // 金融深挖结果
        [NameInMap("findeepdive_result")]
        [Validation(Required=false)]
        public string FindeepdiveResult { get; set; }

        // 金融深挖总览
        [NameInMap("fin_deep_dive_overall")]
        [Validation(Required=false)]
        public string FinDeepDiveOverall { get; set; }

        // Universal 调试-提示词
        [NameInMap("universal_prompt")]
        [Validation(Required=false)]
        public string UniversalPrompt { get; set; }

        // Universal 调试-输出
        [NameInMap("universal_output")]
        [Validation(Required=false)]
        public string UniversalOutput { get; set; }

        // 金融调试-提示词
        [NameInMap("finance_prompt")]
        [Validation(Required=false)]
        public string FinancePrompt { get; set; }

        // 金融调试-输出
        [NameInMap("finance_output")]
        [Validation(Required=false)]
        public string FinanceOutput { get; set; }

        // 策略版本
        [NameInMap("strategy_version")]
        [Validation(Required=false)]
        public string StrategyVersion { get; set; }

    }

}
