// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // AccountPo
    public class AccountPo : TeaModel {
        // 账户 hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>465518149b3407dc927e05208136c42b2c6b82fe961006f3dff5202b0c3d8764</para>
        /// </summary>
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 账户创建时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1573442990479</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 创建该账户的交易hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>fffc98e106171ee7783fb79a433312e3ac98091cb82e7292ec62462138c7ff8e</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 创建该账户的 账户hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>e7d3e769f3f593dadcb8634cc5b09fc90dd3a61c4a06a79cb0923662fe6fae6b</para>
        /// </summary>
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

    }

}
