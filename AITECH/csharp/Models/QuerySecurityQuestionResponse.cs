// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityQuestionResponse : TeaModel {
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

        // 代表风险等级和建议的处置结论，PASS：安全无风险，BLOCK：绝对风险，建议直接拦截，SECURITY_ANSWER：泛风险，回答内容存在敏感要素
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

        // 命中的自定义黑词列表
        [NameInMap("customize_risk_word")]
        [Validation(Required=false)]
        public List<string> CustomizeRiskWord { get; set; }

        // 风险标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<LabelModel> Labels { get; set; }

        // 会话Id
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 表示是同一个Q&A
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 兜底话术
        [NameInMap("limit_answer")]
        [Validation(Required=false)]
        public string LimitAnswer { get; set; }

        // 有风险时的安全代答
        [NameInMap("security_answer")]
        [Validation(Required=false)]
        public string SecurityAnswer { get; set; }

        // 当请求参数 promptReword=Y 时返回，为安全改写后的内容
        [NameInMap("security_prompt")]
        [Validation(Required=false)]
        public string SecurityPrompt { get; set; }

        // 提示词攻击手法标签
        [NameInMap("attack_labels")]
        [Validation(Required=false)]
        public AttackLabel AttackLabels { get; set; }

        // 领域标签信息
        [NameInMap("field_info")]
        [Validation(Required=false)]
        public FieldModel FieldInfo { get; set; }

        // 安全代答匹配到的Q
        [NameInMap("match_q")]
        [Validation(Required=false)]
        public string MatchQ { get; set; }

        // 越狱手法标签
        [NameInMap("jailbreak_label")]
        [Validation(Required=false)]
        public string JailbreakLabel { get; set; }

        // universal模型请求参数
        [NameInMap("universal_prompt")]
        [Validation(Required=false)]
        public string UniversalPrompt { get; set; }

        // universal模型返回结果
        [NameInMap("universal_output")]
        [Validation(Required=false)]
        public string UniversalOutput { get; set; }

        // 金融V3模型请求参数
        [NameInMap("finance_prompt")]
        [Validation(Required=false)]
        public string FinancePrompt { get; set; }

        // 金融V3模型返回结果
        [NameInMap("finance_output")]
        [Validation(Required=false)]
        public string FinanceOutput { get; set; }

        // 策略版本号
        [NameInMap("strategy_version")]
        [Validation(Required=false)]
        public string StrategyVersion { get; set; }

        // 本次接口请求内所有大模型及 Embedding 调用的 token 汇总。
        [NameInMap("token_usage")]
        [Validation(Required=false)]
        public TokenUsageSummary TokenUsage { get; set; }

        // 调试信息（X-Debug-Mode: true 时返回；语音检测内含 audioAsrInfo 子结构）
        //  对应的结果为Map转化的JSON字符串
        [NameInMap("debug_info")]
        [Validation(Required=false)]
        public string DebugInfo { get; set; }

        // 金融合规深度审核——命中的风险点列表（JSON 数组字符串；仅深审开时返回，非深审场景不输出）
        [NameInMap("findeepdive_result")]
        [Validation(Required=false)]
        public string FindeepdiveResult { get; set; }

        // 金融合规深度审核——整体结论（block/warning/pass；仅深审开时返回）
        [NameInMap("fin_deep_dive_overall")]
        [Validation(Required=false)]
        public string FinDeepDiveOverall { get; set; }

    }

}
