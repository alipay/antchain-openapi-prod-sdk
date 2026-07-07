// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证结果
    public class EvidenceResult : TeaModel {
        // 取证编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240327000000001001</para>
        /// </summary>
        [NameInMap("evidence_id")]
        [Validation(Required=true)]
        public string EvidenceId { get; set; }

        // 取证类型（LIVE：直播，VOD：点播）
        /// <summary>
        /// <b>Example:</b>
        /// <para>LIVE</para>
        /// </summary>
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 公证处code
        /// <summary>
        /// <b>Example:</b>
        /// <para>LUJIANG</para>
        /// </summary>
        [NameInMap("notary_office")]
        [Validation(Required=true)]
        public string NotaryOffice { get; set; }

        // 取证站点url信息
        [NameInMap("evidence_url")]
        [Validation(Required=true)]
        public EvidenceWebUrlInfo EvidenceUrl { get; set; }

        // 取证结果文件下载url（有效期3天）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("evidence_result_url")]
        [Validation(Required=true)]
        public string EvidenceResultUrl { get; set; }

        // 存证证明信息
        [NameInMap("certificate_info")]
        [Validation(Required=true)]
        public EvidenceCertificateInfo CertificateInfo { get; set; }

        // 取证开始时间戳
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713589469000</para>
        /// </summary>
        [NameInMap("evidence_start_time")]
        [Validation(Required=true)]
        public long? EvidenceStartTime { get; set; }

        // 取证状态(SUCCESS:成功, FAIL:取证失败)
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 处理结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>4188</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 处理结果信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>取证资源不足</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
