// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // waas公钥信息
    public class PublicKeyInfo : TeaModel {
        // 公钥id
        /// <summary>
        /// <b>Example:</b>
        /// <para>key-1</para>
        /// </summary>
        [NameInMap("key_id")]
        [Validation(Required=true)]
        public string KeyId { get; set; }

        // 公钥内容
        /// <summary>
        /// <b>Example:</b>
        /// <para>7ceb38181822437c82909506a87aa456</para>
        /// </summary>
        [NameInMap("public_key")]
        [Validation(Required=true)]
        public string PublicKey { get; set; }

        // 算法类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>Secp256k1VerificationKey2018</para>
        /// </summary>
        [NameInMap("sign_type")]
        [Validation(Required=true)]
        public string SignType { get; set; }

        // 过期时间戳（毫秒）
        /// <summary>
        /// <b>Example:</b>
        /// <para>18600000000</para>
        /// </summary>
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

        // 公钥状态，0:不可用 1:可用
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

        // 创建者的did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:xxxx:xxxxxxxx</para>
        /// </summary>
        [NameInMap("controller")]
        [Validation(Required=false)]
        public string Controller { get; set; }

    }

}
