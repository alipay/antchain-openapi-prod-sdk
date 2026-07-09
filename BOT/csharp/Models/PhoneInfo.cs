// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 手机型号信息
    public class PhoneInfo : TeaModel {
        // 颜色
        /// <summary>
        /// <b>Example:</b>
        /// <para>红色</para>
        /// </summary>
        [NameInMap("colour")]
        [Validation(Required=true)]
        public string Colour { get; set; }

        // 色值
        /// <summary>
        /// <b>Example:</b>
        /// <para>#BA0F2F</para>
        /// </summary>
        [NameInMap("colour_number")]
        [Validation(Required=true)]
        public string ColourNumber { get; set; }

        // 内存大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>128GB</para>
        /// </summary>
        [NameInMap("memory")]
        [Validation(Required=true)]
        public string Memory { get; set; }

    }

}
