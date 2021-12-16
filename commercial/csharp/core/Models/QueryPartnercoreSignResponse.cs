// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class QueryPartnercoreSignResponse : TeaModel {
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

        // 合同信息
        [NameInMap("partner_policy_relation")]
        [Validation(Required=false)]
        public PartnerPolicyRelation PartnerPolicyRelation { get; set; }

        // 政策信息扩展
        [NameInMap("policy_dto")]
        [Validation(Required=false)]
        public PolicyDTO PolicyDto { get; set; }

    }

}
