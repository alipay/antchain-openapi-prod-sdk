// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityTextdetoxificationResponse : TeaModel {
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

        // 是否安全无风险
        [NameInMap("safe")]
        [Validation(Required=false)]
        public bool? Safe { get; set; }

        // 一级风险分类
        [NameInMap("risk_category")]
        [Validation(Required=false)]
        public string RiskCategory { get; set; }

        // 二级风险明细分类
        [NameInMap("risk_label")]
        [Validation(Required=false)]
        public string RiskLabel { get; set; }

        // 风险分数
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 风险关键词列表
        [NameInMap("risk_words")]
        [Validation(Required=false)]
        public List<string> RiskWords { get; set; }

        // 关键词索引
        [NameInMap("risk_words_index")]
        [Validation(Required=false)]
        public List<string> RiskWordsIndex { get; set; }

    }

}
