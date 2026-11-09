// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SDS.Models
{
    // 标签
    public class Tag : TeaModel {
        // 编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>IS_OK</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 值
        /// <summary>
        /// <b>Example:</b>
        /// <para>N</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
