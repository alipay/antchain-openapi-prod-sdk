// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 存证证明信息
    public class EvidenceCertificateInfo : TeaModel {
        // 证书编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>5978355373</para>
        /// </summary>
        [NameInMap("certificate_no")]
        [Validation(Required=true)]
        public string CertificateNo { get; set; }

        // 上链时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>2023-06-27T10:50:23+08:00</para>
        /// </summary>
        [NameInMap("certificate_time")]
        [Validation(Required=true)]
        public string CertificateTime { get; set; }

        // 链上交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>eh5a978s3553c73ee7e2cl22e</para>
        /// </summary>
        [NameInMap("certificate_hash")]
        [Validation(Required=true)]
        public string CertificateHash { get; set; }

        // 证书下载url（有效期3天）
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://xxxx">https://xxxx</a></para>
        /// </summary>
        [NameInMap("certificate_url")]
        [Validation(Required=true)]
        public string CertificateUrl { get; set; }

    }

}
