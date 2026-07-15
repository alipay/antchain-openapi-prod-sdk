// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 更新did auth paylod结构体
    public class UpdateDidAuthPayload : TeaModel {
        // 新公钥的实际控制者
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxx</para>
        /// </summary>
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // 旧Auth Key的过期时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1567890</para>
        /// </summary>
        [NameInMap("previous_auth_key_expire")]
        [Validation(Required=true)]
        public string PreviousAuthKeyExpire { get; set; }

        // 更新Did doc的版本
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("previous_version")]
        [Validation(Required=true)]
        public long? PreviousVersion { get; set; }

        // 新DID Auth key的public key id
        /// <summary>
        /// <b>Example:</b>
        /// <para>key#3</para>
        /// </summary>
        [NameInMap("public_key_id")]
        [Validation(Required=true)]
        public string PublicKeyId { get; set; }

        // 密钥对生成算法
        /// <summary>
        /// <b>Example:</b>
        /// <para>RsaVerificationKey2018</para>
        /// </summary>
        [NameInMap("public_key_type")]
        [Validation(Required=true)]
        public string PublicKeyType { get; set; }

        // 公钥的实际值
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxxxx</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
