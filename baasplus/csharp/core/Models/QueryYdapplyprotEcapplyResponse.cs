// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryYdapplyprotEcapplyResponse : TeaModel {
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

        // 核验是否通过
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

        // 风险分
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 命中的策略列表
        [NameInMap("strategies")]
        [Validation(Required=false)]
        public List<string> Strategies { get; set; }

        // 风险决策结果
        [NameInMap("decision")]
        [Validation(Required=false)]
        public string Decision { get; set; }

    }

}
