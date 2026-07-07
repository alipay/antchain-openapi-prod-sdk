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
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCREENSHOT</para>
        /// </summary>
        [NameInMap("evidence_type")]
        [Validation(Required=true)]
        public string EvidenceType { get; set; }

        // 证据状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>SUCCESS</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 网页截取编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240419000000028693</para>
        /// </summary>
        [NameInMap("screenshot_id")]
        [Validation(Required=true)]
        public string ScreenshotId { get; set; }

        // 证据编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>8240419000000028693</para>
        /// </summary>
        [NameInMap("evidence_id")]
        [Validation(Required=true)]
        public string EvidenceId { get; set; }

        // 存证编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240422173407597000001</para>
        /// </summary>
        [NameInMap("certificate_no")]
        [Validation(Required=true)]
        public string CertificateNo { get; set; }

        // 上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1713779272000</para>
        /// </summary>
        [NameInMap("certificate_time")]
        [Validation(Required=true)]
        public long? CertificateTime { get; set; }

        // 证据hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>dbdd234c35ca275a17b395ad58eff4c2</para>
        /// </summary>
        [NameInMap("evidence_hash")]
        [Validation(Required=true)]
        public string EvidenceHash { get; set; }

        // 链上交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>fc044ac2c1d75ed1219b39db86398cc7cd1c67a43d6ea6c4b83f3a7f5b918a14</para>
        /// </summary>
        [NameInMap("evidence_tx_hash")]
        [Validation(Required=true)]
        public string EvidenceTxHash { get; set; }

        // 证书下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("certificate_file_url")]
        [Validation(Required=true)]
        public string CertificateFileUrl { get; set; }

        // 截图文件下载链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.baidu.com">https://www.baidu.com</a></para>
        /// </summary>
        [NameInMap("screenshot_file_url")]
        [Validation(Required=true)]
        public string ScreenshotFileUrl { get; set; }

        // 证据文件大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("evidence_file_size")]
        [Validation(Required=true)]
        public long? EvidenceFileSize { get; set; }

        // 错误码
        /// <summary>
        /// <b>Example:</b>
        /// <para>NOTARY_SCREENSHOT_ERROR</para>
        /// </summary>
        [NameInMap("error_code")]
        [Validation(Required=true)]
        public string ErrorCode { get; set; }

        // 错误信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>公证处网页取证存证失败</para>
        /// </summary>
        [NameInMap("error_message")]
        [Validation(Required=true)]
        public string ErrorMessage { get; set; }

    }

}
