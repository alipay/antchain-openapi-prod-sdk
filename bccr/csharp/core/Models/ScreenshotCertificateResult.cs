// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 网页截图存证结果
    public class ScreenshotCertificateResult : TeaModel {
        // 证据类型
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 证据状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 网页截取编号
        [NameInMap("screenshot_id")]
        [Validation(Required=true)]
        public string ScreenshotId { get; set; }

        // 证据编号
        [NameInMap("evidence_id")]
        [Validation(Required=true)]
        public string EvidenceId { get; set; }

        // 存证编号
        [NameInMap("certificate_no")]
        [Validation(Required=true)]
        public string CertificateNo { get; set; }

        // 上链时间
        [NameInMap("certificate_time")]
        [Validation(Required=true)]
        public long? CertificateTime { get; set; }

        // 证据hash
        [NameInMap("evidence_hash")]
        [Validation(Required=true)]
        public string EvidenceHash { get; set; }

        // 链上交易hash
        [NameInMap("evidence_tx_hash")]
        [Validation(Required=true)]
        public string EvidenceTxHash { get; set; }

        // 证书下载链接
        [NameInMap("certificate_file_url")]
        [Validation(Required=true)]
        public string CertificateFileUrl { get; set; }

        // 截图文件下载链接
        [NameInMap("screenshot_file_url")]
        [Validation(Required=true)]
        public string ScreenshotFileUrl { get; set; }

        // 证据文件大小
        [NameInMap("evidence_file_size")]
        [Validation(Required=true)]
        public long? EvidenceFileSize { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
