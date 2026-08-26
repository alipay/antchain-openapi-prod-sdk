// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // ABC产品结构体B
    public class AbcCreateStructB : TeaModel {
        // 【信息描述】
        /// <summary>
        /// <b>Example:</b>
        /// <para>这是关于xxx的资料信息</para>
        /// </summary>
        [NameInMap("info")]
        [Validation(Required=false)]
        public string Info { get; set; }

        // 【地区】
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省杭州市</para>
        /// </summary>
        [NameInMap("region")]
        [Validation(Required=false)]
        public string Region { get; set; }

    }

}
