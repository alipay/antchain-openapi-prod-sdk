// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云托管账户信息
    public class ALiYunChainKmsAccount : TeaModel {
        // 账户公钥
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234567890</para>
        /// </summary>
        [NameInMap("pub_key")]
        [Validation(Required=false)]
        public string PubKey { get; set; }

        // 托管秘钥ID
        /// <summary>
        /// <b>Example:</b>
        /// <para>1234567890</para>
        /// </summary>
        [NameInMap("my_kms_key_id")]
        [Validation(Required=false)]
        public string MyKmsKeyId { get; set; }

    }

}
