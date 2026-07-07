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
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("offline_evidence_id")]
        [Validation(Required=true)]
        public string OfflineEvidenceId { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTARY_OFFLINE_REGISTER_ERROR</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>公证处线下取证存证失败</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=false)]
        public string ErrorMessage { get; set; }

        // 取证状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 取证时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713770769000</para>
        /// </summary>
        [NameInMap("evidence_time")]
        [Validation(Required=false)]
        public long? EvidenceTime { get; set; }

        // 委托取证ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("evidence_assignment_id")]
        [Validation(Required=false)]
        public string EvidenceAssignmentId { get; set; }

        // 取证用户ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>123456</para>
        /// </summary>
        [NameInMap("evidence_user_id")]
        [Validation(Required=false)]
        public string EvidenceUserId { get; set; }

        // 取证名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>取证名称</para>
        /// </summary>
        [NameInMap("evidence_name")]
        [Validation(Required=false)]
        public string EvidenceName { get; set; }

        // 公证处code
        /// <summary>
        /// <b>Example:</b>
        /// <para>LU_JIANG</para>
        /// </summary>
        [NameInMap("notary_office_code")]
        [Validation(Required=false)]
        public string NotaryOfficeCode { get; set; }

        // 公证处名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>鹭江公证处</para>
        /// </summary>
        [NameInMap("notary_office_name")]
        [Validation(Required=false)]
        public string NotaryOfficeName { get; set; }

        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>23.35</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 纬度
        /// <summary>
        /// <b>Example:</b>
        /// <para>23.35</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

        // 位置
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 取证开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713770769000</para>
        /// </summary>
        [NameInMap("evidence_start_time")]
        [Validation(Required=false)]
        public long? EvidenceStartTime { get; set; }

        // 取证结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713770769000</para>
        /// </summary>
        [NameInMap("evidence_end_time")]
        [Validation(Required=false)]
        public long? EvidenceEndTime { get; set; }

        // 取证类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>OFFLINE_PICTURE</para>
        /// </summary>
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 存证编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240401000000013980</para>
        /// </summary>
        [NameInMap("certificate_no")]
        [Validation(Required=false)]
        public string CertificateNo { get; set; }

        // 	
        // 上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713771170000</para>
        /// </summary>
        [NameInMap("certificate_time")]
        [Validation(Required=false)]
        public long? CertificateTime { get; set; }

        // 证据hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>2ed3532c4438f82eef7cdf6a54e7ac11</para>
        /// </summary>
        [NameInMap("evidence_hash")]
        [Validation(Required=false)]
        public string EvidenceHash { get; set; }

        // 链上交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>b251a2d54ea254165c9baf13e8366635b1c90d4a449a35fcdce7b332054c8aac</para>
        /// </summary>
        [NameInMap("evidence_tx_hash")]
        [Validation(Required=false)]
        public string EvidenceTxHash { get; set; }

        // 证书文件下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("certificate_file_url")]
        [Validation(Required=false)]
        public string CertificateFileUrl { get; set; }

        // 备注
        /// <summary>
        /// <b>Example:</b>
        /// <para>备注</para>
        /// </summary>
        [NameInMap("memo")]
        [Validation(Required=false)]
        public string Memo { get; set; }

    }

}
