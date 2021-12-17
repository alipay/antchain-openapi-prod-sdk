// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryFlowCertificateResponse : TeaModel {
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

        // 存证证明下载地址，有效期1个小时
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // Legal码H5页面URL
        [NameInMap("legal_code_url")]
        [Validation(Required=false)]
        public string LegalCodeUrl { get; set; }

        // Legal码证书H5页面URL
        [NameInMap("legal_show_url")]
        [Validation(Required=false)]
        public string LegalShowUrl { get; set; }

    }

}
