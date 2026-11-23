// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 分镜
    public class Storyboard : TeaModel {
        // 分镜id集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>[&quot;shot-001&quot;]</para>
        /// </summary>
        [NameInMap("shot_ids")]
        [Validation(Required=true)]
        public List<string> ShotIds { get; set; }

        // 分镜集合
        /// <summary>
        /// <b>Example:</b>
        /// <para>undefined</para>
        /// </summary>
        [NameInMap("shots")]
        [Validation(Required=true)]
        public List<Shot> Shots { get; set; }

    }

}
