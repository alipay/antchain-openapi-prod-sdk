// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 策略流信息
    public class DfSceneInfos : TeaModel {
        // scene_code
        /// <summary>
        /// <b>Example:</b>
        /// <para>场景code</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 拒绝
        /// <summary>
        /// <b>Example:</b>
        /// <para>reject</para>
        /// </summary>
        [NameInMap("scene_decision")]
        [Validation(Required=true)]
        public string SceneDecision { get; set; }

        // decision_flow
        /// <summary>
        /// <b>Example:</b>
        /// <para>decision_flow</para>
        /// </summary>
        [NameInMap("decision_flow")]
        [Validation(Required=true)]
        public DecisionFlow DecisionFlow { get; set; }

    }

}
