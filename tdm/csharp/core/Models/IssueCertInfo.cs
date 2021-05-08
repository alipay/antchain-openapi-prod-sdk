// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TDM.Models
{
    // 证明开具信息
    public class IssueCertInfo : TeaModel {
        // 证明文件ID
        [NameInMap("issue_id")]
        [Validation(Required=true)]
        public string IssueId { get; set; }

        // 证明开具时间
        [NameInMap("issue_time")]
        [Validation(Required=true)]
        public string IssueTime { get; set; }

        // 证明开具单位
        [NameInMap("provider_name")]
        [Validation(Required=false)]
        public string ProviderName { get; set; }

        // 证明类型
        [NameInMap("issue_cert_type")]
        [Validation(Required=true)]
        public string IssueCertType { get; set; }

        // 证明抬头
        [NameInMap("deposit_cert_tag")]
        [Validation(Required=false)]
        public string DepositCertTag { get; set; }

        // 证明文件png图片存储地址
        [NameInMap("deposit_cert")]
        [Validation(Required=false)]
        public string DepositCert { get; set; }

        // 证明文件pdf获取地址(不带二维码)
        [NameInMap("deposit_cert_pdf")]
        [Validation(Required=false)]
        public string DepositCertPdf { get; set; }

        // 证明文件pdf获取地址(带验真码)
        [NameInMap("deposit_cert_pdf_qr")]
        [Validation(Required=false)]
        public string DepositCertPdfQr { get; set; }

    }

}
