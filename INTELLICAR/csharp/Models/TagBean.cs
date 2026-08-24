// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 长安画像标签
    public class TagBean : TeaModel {
        // 标签编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>01qe000</para>
        /// </summary>
        [NameInMap("tid")]
        [Validation(Required=false)]
        public string Tid { get; set; }

        // 标签类目
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 标签名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("tname")]
        [Validation(Required=false)]
        public string Tname { get; set; }

        // 标签值名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("tvname")]
        [Validation(Required=false)]
        public string Tvname { get; set; }

    }

}
