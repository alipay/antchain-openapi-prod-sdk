// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 实例配置
    public class Component : TeaModel {
        // 名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>DATA_DISK_SIZE</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 单位
        /// <summary>
        /// <b>Example:</b>
        /// <para>GB</para>
        /// </summary>
        [NameInMap("unit")]
        [Validation(Required=false)]
        public string Unit { get; set; }

        // 值
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
