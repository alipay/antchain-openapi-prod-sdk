// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 版本范围边界定义
    public class Bound : TeaModel {
        // 边界版本号；eKYT 范围匹配要求使用 x.y.z 数字版本格式。
        /// <summary>
        /// <b>Example:</b>
        /// <para>1.0.0</para>
        /// </summary>
        [NameInMap("version_no")]
        [Validation(Required=false)]
        public string VersionNo { get; set; }

        // 是否包含该边界；true 表示闭区间，false 表示开区间。
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("inclusive")]
        [Validation(Required=false)]
        public bool? Inclusive { get; set; }

    }

}
