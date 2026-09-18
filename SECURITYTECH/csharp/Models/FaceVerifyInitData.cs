// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // eKYT人脸核身初始化数据
    public class FaceVerifyInitData : TeaModel {
        // 请求唯一标识Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>111111111111111</para>
        /// </summary>
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 可信实人认证的唯一标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>cwek23dw24geor89230hf2rw</para>
        /// </summary>
        [NameInMap("certify_id")]
        [Validation(Required=true)]
        public string CertifyId { get; set; }

        // 认证流程入口 URL
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="https://picker">https://picker</a>...</para>
        /// </summary>
        [NameInMap("certify_url")]
        [Validation(Required=true)]
        public string CertifyUrl { get; set; }

    }

}
