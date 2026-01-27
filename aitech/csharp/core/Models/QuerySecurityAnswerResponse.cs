// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityAnswerResponse : TeaModel {
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

        // 风险标签
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<LabelModel> Labels { get; set; }

        // 命中的自定义黑词列表
        [NameInMap("customize_risk_word")]
        [Validation(Required=false)]
        public List<string> CustomizeRiskWord { get; set; }

        // 针对流式输入的处理状态，针对流式输入的处理状态，当请求参数 flowDetect=Y 时返回，结果信息如下：
        // 1. processing：等待处理中，暂无风险检测结果，可能是输入的文本信息不足一句
        // 2. done：处理完成，请参考actionCode及对应的风险标签信息
        [NameInMap("flow_process_state")]
        [Validation(Required=false)]
        public string FlowProcessState { get; set; }

        // 流式内容ID
        [NameInMap("flow_msg_id")]
        [Validation(Required=false)]
        public string FlowMsgId { get; set; }

        // 表示是同一个Q&A
        [NameInMap("message_id")]
        [Validation(Required=false)]
        public string MessageId { get; set; }

        // 兜底话术
        [NameInMap("security_answer")]
        [Validation(Required=false)]
        public string SecurityAnswer { get; set; }

    }

}
