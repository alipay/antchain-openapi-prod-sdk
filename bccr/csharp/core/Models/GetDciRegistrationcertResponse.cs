// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class GetDciRegistrationcertResponse : TeaModel {
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

        // 证书状态
        [NameInMap("cert_status")]
        [Validation(Required=false)]
        public string CertStatus { get; set; }

        // 证书下载链接
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 剩余下载次数
        [NameInMap("download_times_left")]
        [Validation(Required=false)]
        public long? DownloadTimesLeft { get; set; }

        // 错误原因
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

    }

}
