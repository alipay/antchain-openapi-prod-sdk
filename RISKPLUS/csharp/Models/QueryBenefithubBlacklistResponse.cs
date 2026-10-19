// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryBenefithubBlacklistResponse : TeaModel {
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

        // true-命中黑名单,false-非命中黑名单
        [NameInMap("hit")]
        [Validation(Required=false)]
        public bool? Hit { get; set; }

        // UUID-流量平台用户id维度命中，MOBILE-手机号匹配命中。
        [NameInMap("hit_type")]
        [Validation(Required=false)]
        public string HitType { get; set; }

    }

}
