// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 用户混合营销决策结果
    public class RpspInfoModel : TeaModel {
        // 流量分层计划code
        /// <summary>
        /// <b>Example:</b>
        /// <para>planCode1</para>
        /// </summary>
        [NameInMap("plan_code")]
        [Validation(Required=true)]
        public string PlanCode { get; set; }

        // 场景策略Id
        /// <summary>
        /// <b>Example:</b>
        /// <para>15000</para>
        /// </summary>
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 客群分层结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("rpsp_result")]
        [Validation(Required=true)]
        public string RpspResult { get; set; }

        // 	
        // json 结构的营销额外输出信息
        /// <summary>
        /// <b>Example:</b>
        /// <para>{&quot;f_01&quot;:&quot;95.0&quot;}</para>
        /// </summary>
        [NameInMap("rpsp_out_put_info")]
        [Validation(Required=true)]
        public string RpspOutPutInfo { get; set; }

    }

}
