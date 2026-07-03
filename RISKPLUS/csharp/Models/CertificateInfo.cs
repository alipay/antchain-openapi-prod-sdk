// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 结清证明响应实体
    public class CertificateInfo : TeaModel {
        // 结清证明开具结果，0：有结清证明、1：无结清证明、2：开具中、3：暂不支持开具
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 用信申请订单号
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123</para>
        /// </summary>
        [NameInMap("relation_no")]
        [Validation(Required=false)]
        public string RelationNo { get; set; }

        // 结清证明url
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://www.example.com/ffff.pdf?expire=111111">https://www.example.com/ffff.pdf?expire=111111</a></para>
        /// </summary>
        [NameInMap("certificate_url")]
        [Validation(Required=false)]
        public string CertificateUrl { get; set; }

        // 结清证明文件Base64
        /// <summary>
        /// <b>Example:</b>
        /// <para>BEAKENMCT...</para>
        /// </summary>
        [NameInMap("certificate_base64")]
        [Validation(Required=false)]
        public string CertificateBase64 { get; set; }

        // 说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>已开具</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
