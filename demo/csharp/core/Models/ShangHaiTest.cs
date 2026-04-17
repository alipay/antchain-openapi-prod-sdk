// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 用于上海非金迭代的测试使用
    public class ShangHaiTest : TeaModel {
        // string
        /// <summary>
        /// <b>Example:</b>
        /// <para>test</para>
        /// </summary>
        [NameInMap("param_1")]
        [Validation(Required=false)]
        public string Param1 { get; set; }

        // number
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("param_2")]
        [Validation(Required=false)]
        public long? Param2 { get; set; }

    }

}
