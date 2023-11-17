// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署链接结果
    public class CaSignUrlResult : TeaModel {
        // 签署方名称
        [NameInMap("sign_cert_name")]
        [Validation(Required=false)]
        public string SignCertName { get; set; }

        // 签署方证件号（脱敏）
        [NameInMap("sign_cert_no")]
        [Validation(Required=false)]
        public string SignCertNo { get; set; }

        // 签署方id
        [NameInMap("sign_user_id")]
        [Validation(Required=false)]
        public string SignUserId { get; set; }

        // 加密后的签署方证件号(用来关联签署方的签署链接)
        [NameInMap("encrypt_sign_cert_no")]
        [Validation(Required=false)]
        public string EncryptSignCertNo { get; set; }

        // 签署链接
        [NameInMap("sign_url")]
        [Validation(Required=false)]
        public string SignUrl { get; set; }

    }

}
