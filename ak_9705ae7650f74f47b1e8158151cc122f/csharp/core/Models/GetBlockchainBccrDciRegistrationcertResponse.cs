// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    public class GetBlockchainBccrDciRegistrationcertResponse : TeaModel {
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

        // 废弃待删除
        [NameInMap("cert_status")]
        [Validation(Required=false)]
        public string CertStatus { get; set; }

        // 废弃待删除
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 废弃待删除
        [NameInMap("error_reason")]
        [Validation(Required=false)]
        public string ErrorReason { get; set; }

        // 废弃待删除
        [NameInMap("error_reason_cn")]
        [Validation(Required=false)]
        public string ErrorReasonCn { get; set; }

        // 数登状态
        [NameInMap("digital_register_status")]
        [Validation(Required=false)]
        public string DigitalRegisterStatus { get; set; }

        // 数登证书&样本证书压缩包url
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 剩余下载次数
        [NameInMap("download_times_left")]
        [Validation(Required=false)]
        public long? DownloadTimesLeft { get; set; }

        // 失败详情
        [NameInMap("fail_detail")]
        [Validation(Required=false)]
        public string FailDetail { get; set; }

        // 数登证书下载链接
        [NameInMap("digital_register_cert_url")]
        [Validation(Required=false)]
        public string DigitalRegisterCertUrl { get; set; }

        // 数登样本证书下载链接
        [NameInMap("digital_register_sample_url")]
        [Validation(Required=false)]
        public string DigitalRegisterSampleUrl { get; set; }

    }

}
