// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约加密字段
    public class ContractEncryptKeyItem : TeaModel {
        // 字段对应的id
        /// <summary>
        /// <b>Example:</b>
        /// <para>keyId</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 0:encrypt_text,
        // 1:encrypt_array_text,
        // 2:encrypt_int
        // 3:encrypt_array_int
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 字段对应的数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;value_1&quot;</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
