// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ABC.Models
{
    // 子结构体
    public class SubDemoStruct : TeaModel {
        // name
        /// <summary>
        /// <b>Example:</b>
        /// <para>name</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // value
        /// <summary>
        /// <b>Example:</b>
        /// <para>value</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
