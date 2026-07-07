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
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCREEN_RECORDING</para>
        /// </summary>
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 取证状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 证据编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240401000000013980</para>
        /// </summary>
        [NameInMap("evidence_id")]
        [Validation(Required=true)]
        public string EvidenceId { get; set; }

        // 存证编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240401000000013980</para>
        /// </summary>
        [NameInMap("certificate_no")]
        [Validation(Required=true)]
        public string CertificateNo { get; set; }

        // 上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713771170000</para>
        /// </summary>
        [NameInMap("certificate_time")]
        [Validation(Required=true)]
        public long? CertificateTime { get; set; }

        // 证据hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>2ed3532c4438f82eef7cdf6a54e7ac11</para>
        /// </summary>
        [NameInMap("evidence_hash")]
        [Validation(Required=true)]
        public string EvidenceHash { get; set; }

        // 链上交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>b251a2d54ea254165c9baf13e8366635b1c90d4a449a35fcdce7b332054c8aac</para>
        /// </summary>
        [NameInMap("evidence_tx_hash")]
        [Validation(Required=true)]
        public string EvidenceTxHash { get; set; }

        // 证书文件下载地址
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("certificate_file_url")]
        [Validation(Required=false)]
        public string CertificateFileUrl { get; set; }

        // 录屏取证文件列表
        [NameInMap("evidence_files")]
        [Validation(Required=false)]
        public List<EvidenceFile> EvidenceFiles { get; set; }

        // 录屏开始时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713770769000</para>
        /// </summary>
        [NameInMap("evidence_start_time")]
        [Validation(Required=true)]
        public long? EvidenceStartTime { get; set; }

        // 录屏结束时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713770944000</para>
        /// </summary>
        [NameInMap("evidence_end_time")]
        [Validation(Required=true)]
        public long? EvidenceEndTime { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTARY_SCREENSHOT_ERROR</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=false)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>公证处网页取证存证失败</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

        // 云桌面url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("operate_url")]
        [Validation(Required=true)]
        public string OperateUrl { get; set; }

    }

}
