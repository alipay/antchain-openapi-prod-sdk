// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    public class VerifyFirmResponse : TeaModel {
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

        // 企业分布式did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 法人认证信息
        [NameInMap("certify_lp_dto")]
        [Validation(Required=false)]
        public CertifyLPDTO CertifyLpDto { get; set; }

    }

}
