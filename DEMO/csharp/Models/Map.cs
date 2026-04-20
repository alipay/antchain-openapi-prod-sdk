// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 键值对
    public class Map : TeaModel {
        // 键
        /// <summary>
        /// <b>Example:</b>
        /// <para>key1</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // 值
        /// <summary>
        /// <b>Example:</b>
        /// <para>value1</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
