// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVERENDER.Models
{
    // 分镜信息
    public class Shot : TeaModel {
        // 分镜编号
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("shot_number")]
        [Validation(Required=true)]
        public long? ShotNumber { get; set; }

        // 分镜时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>8</para>
        /// </summary>
        [NameInMap("shot_duration")]
        [Validation(Required=true)]
        public long? ShotDuration { get; set; }

        // 分镜详情
        /// <summary>
        /// <b>Example:</b>
        /// <para>镜头1 [0-2s] 深夜后厨</para>
        /// </summary>
        [NameInMap("shot_detail")]
        [Validation(Required=true)]
        public string ShotDetail { get; set; }

    }

}
