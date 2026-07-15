// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    public class QueryBenefitAppResponse : TeaModel {
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

        // 平台配置的档位稳定 ID，例如TIER_17
        [NameInMap("tier_id")]
        [Validation(Required=false)]
        public string TierId { get; set; }

        // 档位名称，例如中级会员17元
        [NameInMap("tier_name")]
        [Validation(Required=false)]
        public string TierName { get; set; }

    }

}
