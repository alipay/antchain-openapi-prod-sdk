// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 线下取证存证结果
    public class OfflineRegisterResult : TeaModel {
        // 取证文件
        [NameInMap("evidence_file")]
        [Validation(Required=false)]
        public EvidenceFile EvidenceFile { get; set; }

        // 线下取证ID
        [NameInMap("offline_evidence_id")]
        [Validation(Required=true)]
        public string OfflineEvidenceId { get; set; }

        // 错误码
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 取证状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 取证时间
        [NameInMap("evidence_time")]
        [Validation(Required=false)]
        public long? EvidenceTime { get; set; }

        // 委托取证ID
        [NameInMap("evidence_assignment_id")]
        [Validation(Required=false)]
        public string EvidenceAssignmentId { get; set; }

        // 取证用户ID
        [NameInMap("evidence_user_id")]
        [Validation(Required=false)]
        public string EvidenceUserId { get; set; }

        // 取证名称
        [NameInMap("evidence_name")]
        [Validation(Required=false)]
        public string EvidenceName { get; set; }

        // 公证处code
        [NameInMap("notary_office_code")]
        [Validation(Required=false)]
        public string NotaryOfficeCode { get; set; }

        // 公证处名称
        [NameInMap("notary_office_name")]
        [Validation(Required=false)]
        public string NotaryOfficeName { get; set; }

        // 经度
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 取证开始时间
        [NameInMap("evidence_start_time")]
        [Validation(Required=false)]
        public long? EvidenceStartTime { get; set; }

        // 取证结束时间
        [NameInMap("evidence_end_time")]
        [Validation(Required=false)]
        public long? EvidenceEndTime { get; set; }

        // 取证类型
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 存证编号
        [NameInMap("certificate_no")]
        [Validation(Required=false)]
        public string CertificateNo { get; set; }

        // 	
        // 上链时间
        [NameInMap("certificate_time")]
        [Validation(Required=false)]
        public long? CertificateTime { get; set; }

        // 证据hash
        [NameInMap("evidence_hash")]
        [Validation(Required=false)]
        public string EvidenceHash { get; set; }

        // 链上交易hash
        [NameInMap("evidence_tx_hash")]
        [Validation(Required=false)]
        public string EvidenceTxHash { get; set; }

        // 证书文件下载地址
        [NameInMap("certificate_file_url")]
        [Validation(Required=false)]
        public string CertificateFileUrl { get; set; }

        // 备注
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
