// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // map结构体
    public class MapStruct : TeaModel {
        // 生图数量
        /// <summary>
        /// <b>Example:</b>
        /// <para>generationCount</para>
        /// </summary>
        [NameInMap("key")]
        [Validation(Required=true)]
        public string Key { get; set; }

        // key对应的值
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
