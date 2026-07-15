// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 分享可验证声明时的核心内容
    public class VcShareStruct : TeaModel {
        // 分享的目标VC的id
        /// <summary>
        /// <b>Example:</b>
        /// <para>未定义</para>
        /// </summary>
        [NameInMap("vc_id")]
        [Validation(Required=true)]
        public string VcId { get; set; }

        // 目标的VC持有者的did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:6d8f3ff4af91532eaa7fc477be6b68dea14ed3bcfd5755ccedced43f6c248214</para>
        /// </summary>
        [NameInMap("owner_did")]
        [Validation(Required=true)]
        public string OwnerDid { get; set; }

        // 在支持声明的claim字段级别分享能力时使用，可以指定哪些字段隐藏，哪些字段分享。示例中标记为”1“的是隐藏，”0“的是分享明文。
        /// <summary>
        /// <b>Example:</b>
        /// <para>{ &quot;Item1&quot;: &quot;1&quot;, &quot;学历信息&quot;: [ { &quot;学历&quot;: &quot;0&quot;, &quot;毕业院校&quot;: &quot;0&quot;, &quot;专业&quot;: &quot;0&quot;, &quot;Item2&quot;:&quot;1&quot;, }, &quot;1&quot;, ], &quot;Item3&quot;:&quot;1&quot; }</para>
        /// </summary>
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 非托管模式下owner_did的签名，作为授权凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>jN1LVH5YhbTvgrdeBqlImPJBWDzVdNyyHZ1n9A0pSOQKnt11jWM5Qn707+wEa7bc8TOd1WvRItTe
        /// mx4xYCqX0gE=
        ///  </para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=false)]
        public string Signature { get; set; }

    }

}
