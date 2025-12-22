// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 签署链接
    public class AntSignUrlResult : TeaModel {
        // 签署方名称
        [NameInMap("sign_cert_name")]
        [Validation(Required=true)]
        public string SignCertName { get; set; }

        // 签署方证件号（脱敏）
        [NameInMap("sign_cert_no")]
        [Validation(Required=true)]
        public string SignCertNo { get; set; }

        // 签署方 id
        [NameInMap("sign_user_id")]
        [Validation(Required=true)]
        public string SignUserId { get; set; }

        // 加密后的签署方证件号(用来关联签署方的签署链接)
        [NameInMap("encrypt_sign_cert_no")]
        [Validation(Required=true)]
        public string EncryptSignCertNo { get; set; }

        // 签署链接：电子签任务为异步任务，请确保已处于签署中（SIGNNING）状态，再给用户发送签署链接，否则用户签署会不成功
        [NameInMap("sign_url")]
        [Validation(Required=true)]
        public string SignUrl { get; set; }

    }

}
