// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾租户触达策略计划信息
    public class TenantActionPlanInfo : TeaModel {
        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 营销名称
        [NameInMap("scene_strategy_name")]
        [Validation(Required=true)]
        public string SceneStrategyName { get; set; }

        // 营销状态
        [NameInMap("scene_strategy_status")]
        [Validation(Required=true)]
        public string SceneStrategyStatus { get; set; }

        // 渠道id
        [NameInMap("action_driver_code")]
        [Validation(Required=true)]
        public long? ActionDriverCode { get; set; }

        // 渠道类型
        [NameInMap("channel_code")]
        [Validation(Required=true)]
        public string ChannelCode { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 场景策略入参名
        [NameInMap("action_param_info")]
        [Validation(Required=false)]
        public List<string> ActionParamInfo { get; set; }

        // 参数查询是否完成
        [NameInMap("is_param_query_done")]
        [Validation(Required=false)]
        public bool? IsParamQueryDone { get; set; }

    }

}
