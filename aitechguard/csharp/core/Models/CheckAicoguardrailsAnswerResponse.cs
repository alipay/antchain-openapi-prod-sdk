// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    public class CheckAicoguardrailsAnswerResponse : TeaModel {
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

        // 是否安全无风险
        [NameInMap("safe")]
        [Validation(Required=false)]
        public bool? Safe { get; set; }

        // 风险一级分类标签
        [NameInMap("risk_category")]
        [Validation(Required=false)]
        public string RiskCategory { get; set; }

        // 风险二级分类标签
        [NameInMap("risk_label")]
        [Validation(Required=false)]
        public string RiskLabel { get; set; }

        // 风险等级分数，百分之，分数越高风险等级越高
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 风险关键词列表
        [NameInMap("risk_words")]
        [Validation(Required=false)]
        public List<string> RiskWords { get; set; }

        // 风险关键词位置，逗号分割左右下标，左闭右开区间
        [NameInMap("risk_words_index")]
        [Validation(Required=false)]
        public List<string> RiskWordsIndex { get; set; }

    }

}
