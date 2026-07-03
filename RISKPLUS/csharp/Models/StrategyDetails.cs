// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 策略详情
    public class StrategyDetails : TeaModel {
        // 策略id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 策略名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>策略名称</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 决策结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>accept</para>
        /// </summary>
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // 场景码
        /// <summary>
        /// <b>Example:</b>
        /// <para>scene_code</para>
        /// </summary>
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
