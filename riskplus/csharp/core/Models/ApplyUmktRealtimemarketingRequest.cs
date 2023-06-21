// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class ApplyUmktRealtimemarketingRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 营销盾内部租户下的子租户
        [NameInMap("sub_tenant_id")]
        [Validation(Required=false)]
        public string SubTenantId { get; set; }

        // 	
        // 场景策略id
        [NameInMap("scene_strategy_id")]
        [Validation(Required=true)]
        public long? SceneStrategyId { get; set; }

        // 外部流水号
        [NameInMap("out_serial_no")]
        [Validation(Required=true)]
        public string OutSerialNo { get; set; }

        // 	
        // 用户参数类型
        [NameInMap("param_type")]
        [Validation(Required=true)]
        public string ParamType { get; set; }

        // 触达渠道配置
        [NameInMap("channel_params")]
        [Validation(Required=false)]
        public string ChannelParams { get; set; }

        // 扩展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

        // 手机号/手机号md5
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

    }

}
