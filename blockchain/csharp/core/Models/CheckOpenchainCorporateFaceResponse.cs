// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CheckOpenchainCorporateFaceResponse : TeaModel {
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

        // 认证id
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 二维码URL，用户支付宝扫一扫实人认证
        [NameInMap("certify_url")]
        [Validation(Required=false)]
        public string CertifyUrl { get; set; }

    }

}
