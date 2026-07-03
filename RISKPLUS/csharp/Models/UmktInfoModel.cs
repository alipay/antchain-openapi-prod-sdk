// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户的混合策略圈客结果
    public class UmktInfoModel : TeaModel {
        // 场景策略id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 实时营销结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("umkt_result")]
        [Validation(Required=true)]
        public long? UmktResult { get; set; }

        // json 结构的营销额外输出信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;f_01&quot;:&quot;95.0&quot;}</para>
        /// </summary>
        [NameInMap("umkt_out_put_info")]
        [Validation(Required=true)]
        public string UmktOutPutInfo { get; set; }

    }

}
