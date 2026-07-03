// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 字典对象
    public class DictionaryInfoBO : TeaModel {
        // 字典key
        /// <summary>
        /// <b>Example:</b>
        /// <para>key1</para>
        /// </summary>
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // 字典value
        /// <summary>
        /// <b>Example:</b>
        /// <para>a</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
