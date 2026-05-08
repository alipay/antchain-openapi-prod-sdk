// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.QQQ.Models
{
    // 结构体返回结构
    public class ResultListDemo : TeaModel {
        // 返回结果码
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;:&quot;value&quot;}</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public AbcDemoStruct Code { get; set; }

        // 返回结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;name&quot;:{&quot;key&quot;:&quot;value&quot;}}</para>
        /// </summary>
        [NameInMap("data")]
        [Validation(Required=true)]
        public AbcDemoStruct Data { get; set; }

        // 返回信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;message&quot;:&quot;success&quot;}</para>
        /// </summary>
        [NameInMap("message")]
        [Validation(Required=true)]
        public AbcDemoStruct Message { get; set; }

    }

}
