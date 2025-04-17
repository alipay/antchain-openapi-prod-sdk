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
        [NameInMap("plan_code")]
        [Validation(Required=true)]
        public string PlanCode { get; set; }

        // 场景策略Id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 客群分层结果
        [NameInMap("rpsp_result")]
        [Validation(Required=true)]
        public string RpspResult { get; set; }

        // 	
        // json 结构的营销额外输出信息
        [NameInMap("rpsp_out_put_info")]
        [Validation(Required=true)]
        public string RpspOutPutInfo { get; set; }

    }

}
