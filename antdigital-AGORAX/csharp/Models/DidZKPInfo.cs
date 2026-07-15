// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // did中使用ZKP生成证明需要的信息
    public class DidZKPInfo : TeaModel {
        // 需要生成证明的路径
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;$./path&quot;</para>
        /// </summary>
        [NameInMap("path")]
        [Validation(Required=true)]
        public string Path { get; set; }

        // 生成ZKP证明的公共信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>json array string</para>
        /// </summary>
        [NameInMap("public_inputs")]
        [Validation(Required=true)]
        public string PublicInputs { get; set; }

        // zkp方法
        /// <summary>
        /// <b>Example:</b>
        /// <para>more,less,contain</para>
        /// </summary>
        [NameInMap("zkp_type")]
        [Validation(Required=true)]
        public string ZkpType { get; set; }

    }

}
