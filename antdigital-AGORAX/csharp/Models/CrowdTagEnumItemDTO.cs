// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 人群标签对象
    public class CrowdTagEnumItemDTO : TeaModel {
        // 枚举名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>性别</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 枚举值
        /// <summary>
        /// <b>Example:</b>
        /// <para>F</para>
        /// </summary>
        [NameInMap("val")]
        [Validation(Required=true)]
        public string Val { get; set; }

    }

}
