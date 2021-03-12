// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PullAuthWebpageUrlResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 可用的H5的Url，并且已经携带授权宝侧相关的参数：token、bizId等.
        [NameInMap("auth_url")]
        [Validation(Required=false)]
        public string AuthUrl { get; set; }

        // 此请求业务方的C端用户的DID，在授权宝侧相当于C端用户给业务方做授权，因此C端用户是issuer，业务方的B类客户是目标subject。
        [NameInMap("issuer_did")]
        [Validation(Required=false)]
        public string IssuerDid { get; set; }

        // 此请求业务方B类客户的DID
        [NameInMap("subject_did")]
        [Validation(Required=false)]
        public string SubjectDid { get; set; }

    }

}
