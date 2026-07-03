// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 决策场景信息
    public class AirDfSceneInfos : TeaModel {
        // 决策场景结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>review</para>
        /// </summary>
        [NameInMap("scene_decision")]
        [Validation(Required=false)]
        public string SceneDecision { get; set; }

        // 决策场景
        /// <summary>
        /// <b>Example:</b>
        /// <para>air_scene</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=false)]
        public string SceneCode { get; set; }

        // 决策域信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>[{&quot;decision_flows&quot;:[{&quot;decision&quot;:&quot;review&quot;,&quot;name&quot;:&quot;租赁测试策略&quot;}],&quot;domain_decision&quot;:&quot;review&quot;,&quot;domain_code&quot;:&quot;lease_domain&quot;}]</para>
        /// </summary>
        [NameInMap("domain_infos")]
        [Validation(Required=false)]
        public List<AirDomainInfos> DomainInfos { get; set; }

    }

}
