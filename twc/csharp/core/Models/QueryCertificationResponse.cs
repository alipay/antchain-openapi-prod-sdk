// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryCertificationResponse : TeaModel {
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

        // 存证证明的证书信息列表
        [NameInMap("certificate_info")]
        [Validation(Required=false)]
        public List<CertificateInfo> CertificateInfo { get; set; }

        // 返回值状态码，0000则为成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 异常状态时的错误信息
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
