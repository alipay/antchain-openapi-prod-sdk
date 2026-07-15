// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // {"key":"value"}
    public class KeyValuePair : TeaModel {
        // 键名
        /// <summary>
        /// <b>Example:</b>
        /// <para>key</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        /// <summary>
        /// <b>Example:</b>
        /// <para>value</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
