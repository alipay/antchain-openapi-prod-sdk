// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class AuthSignFlowResponse : TeaModel {
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

        // 签署最后落签的签署区域id列表
        [NameInMap("sign_field_ids")]
        [Validation(Required=false)]
        public string SignFieldIds { get; set; }

        // 手动签署链接，区块链合同签署方式，企业未进行静默授权，会返回一个手动签署链接
        // 如果已授权或者不是区块链签署方式，该字段为空
        [NameInMap("org_sign_url")]
        [Validation(Required=false)]
        public string OrgSignUrl { get; set; }

    }

}
