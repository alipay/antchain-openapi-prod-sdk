// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class SetContractTenantkeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 被通信秘钥加密后的解密密钥字符串。
        [NameInMap("file_decrypt_key")]
        [Validation(Required=true)]
        public string FileDecryptKey { get; set; }

        // 使用base64编码后的RSA公钥；用于解密decryptKey以及加密入参
        [NameInMap("signal_pub_key_encoded")]
        [Validation(Required=false)]
        public string SignalPubKeyEncoded { get; set; }

    }

}
