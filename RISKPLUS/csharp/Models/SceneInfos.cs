// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 场景决策列表
    public class SceneInfos : TeaModel {
        // 决策结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>accept</para>
        /// </summary>
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // 场景code
        /// <summary>
        /// <b>Example:</b>
        /// <para>ANFAPP</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
