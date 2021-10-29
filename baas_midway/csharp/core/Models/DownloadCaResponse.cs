// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAAS_MIDWAY.Models
{
    public class DownloadCaResponse : TeaModel {
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

        // 根CA证书内容
        [NameInMap("trust_ca_content")]
        [Validation(Required=false)]
        public string TrustCaContent { get; set; }

        // CA证书格式，目前只有X509
        [NameInMap("ca_format")]
        [Validation(Required=false)]
        public string CaFormat { get; set; }

    }

}
