// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    public class QuerySecurityImageResponse : TeaModel {
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

        // 代表风险等级和建议的处置结论
        [NameInMap("action_code")]
        [Validation(Required=false)]
        public string ActionCode { get; set; }

        // 排黑排白命中结果（命中时携带详细信息，未命中或未启用为 null）
        [NameInMap("image_black_white_result")]
        [Validation(Required=false)]
        public ImageBlackWhiteResult ImageBlackWhiteResult { get; set; }

        // 本次接口请求内所有大模型调用的 token 汇总。
        [NameInMap("token_usage")]
        [Validation(Required=false)]
        public TokenUsageSummary TokenUsage { get; set; }

    }

}
