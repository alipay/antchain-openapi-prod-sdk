// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 用于测试预发ob的同步_已编辑
    public class PreTestUse : TeaModel {
        // 1
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("param_1")]
        [Validation(Required=true)]
        public string Param1 { get; set; }

        // 11
        /// <summary>
        /// <b>Example:</b>
        /// <para>11</para>
        /// </summary>
        [NameInMap("param_2")]
        [Validation(Required=true)]
        public long? Param2 { get; set; }

        // boolean
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("param_3")]
        [Validation(Required=true)]
        public bool? Param3 { get; set; }

    }

}
