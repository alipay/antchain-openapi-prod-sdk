// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 录屏取证结果
    public class RecordScreenResult : TeaModel {
        // 取证类型(SCREEN_RECORDING：录屏取证)
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 取证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

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

        // 证书文件下载地址
        [NameInMap("certificate_file_url")]
        [Validation(Required=false)]
        public string CertificateFileUrl { get; set; }

        // 录屏取证文件列表
        [NameInMap("evidence_files")]
        [Validation(Required=false)]
        public List<EvidenceFile> EvidenceFiles { get; set; }

        // 录屏开始时间
        [NameInMap("evidence_start_time")]
        [Validation(Required=true)]
        public long? EvidenceStartTime { get; set; }

        // 录屏结束时间
        [NameInMap("evidence_end_time")]
        [Validation(Required=true)]
        public long? EvidenceEndTime { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        // 云桌面url
        [NameInMap("operate_url")]
        [Validation(Required=true)]
        public string OperateUrl { get; set; }

    }

}
