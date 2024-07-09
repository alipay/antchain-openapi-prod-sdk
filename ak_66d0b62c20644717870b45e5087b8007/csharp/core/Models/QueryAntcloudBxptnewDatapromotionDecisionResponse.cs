// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_66d0b62c20644717870b45e5087b8007.Models
{
    public class QueryAntcloudBxptnewDatapromotionDecisionResponse : TeaModel {
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

        // 用户ID
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // 营销状态
        [NameInMap("promotion_status")]
        [Validation(Required=false)]
        public string PromotionStatus { get; set; }

    }

}
