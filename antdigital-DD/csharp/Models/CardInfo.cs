// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // x
    public class CardInfo : TeaModel {
        // 1
        [NameInMap("demo_info")]
        [Validation(Required=true)]
        public DemoClass DemoInfo { get; set; }

        // 测试
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
