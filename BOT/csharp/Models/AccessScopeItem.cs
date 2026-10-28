// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 清单访问范围项：一个场景及其允许访问的目标 ID 集合
    public class AccessScopeItem : TeaModel {
        // 场景码。范围项归属的业务场景，同一请求内可以出现多个不同场景的范围项。
        /// <summary>
        /// <b>Example:</b>
        /// <para>SCENE_001</para>
        /// </summary>
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 访问目标 ID 清单
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;dev-8801&quot;,&quot;dev-8802&quot;]</para>
        /// </summary>
        [NameInMap("targets")]
        [Validation(Required=true)]
        public List<string> Targets { get; set; }

    }

}
