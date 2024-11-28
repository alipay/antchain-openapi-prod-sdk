// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    public class CheckAicoguardrailsAskResponse : TeaModel {
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

        // 会话ID，用于匹配多轮对话上下文
        [NameInMap("session_id")]
        [Validation(Required=false)]
        public string SessionId { get; set; }

        // 唯一定位一个问答对
        [NameInMap("request_id")]
        [Validation(Required=false)]
        public string RequestId { get; set; }

        // 是否安全无风险. true：安全无风险. false：有风险
        [NameInMap("safe")]
        [Validation(Required=false)]
        public bool? Safe { get; set; }

        // 安全动作
        // 提问场景
        //    BLOCK：拦截
        //    SECURITY_ANSWER：安全代答
        //    SECURITY_PROMPT：安全提示增强
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

        // 安全代答的回答
        [NameInMap("security_answer")]
        [Validation(Required=false)]
        public string SecurityAnswer { get; set; }

        // 有安全风险时的提问改写
        [NameInMap("security_prompt")]
        [Validation(Required=false)]
        public string SecurityPrompt { get; set; }

        // 有风险时的风险类型，一级风险分类
        [NameInMap("risk_category")]
        [Validation(Required=false)]
        public string RiskCategory { get; set; }

        // 有风险时的风险类型，二级风险明细分类
        [NameInMap("risk_label")]
        [Validation(Required=false)]
        public string RiskLabel { get; set; }

        // 风险等级分数，0-100，分数越高风险等级越高
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 命中风险场景的风险词
        [NameInMap("risk_words")]
        [Validation(Required=false)]
        public List<string> RiskWords { get; set; }

        // 风险词索引
        [NameInMap("risk_words_index")]
        [Validation(Required=false)]
        public List<string> RiskWordsIndex { get; set; }

        // 会话动作
        //    END_SESSION：终止会话
        //    RECALL_QUERY：撤回提问
        [NameInMap("session_action")]
        [Validation(Required=false)]
        public string SessionAction { get; set; }

    }

}
