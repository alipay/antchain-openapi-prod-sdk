// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class ScaleoutProdinstanceAppserviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 应用服务实例唯一标识。
        [NameInMap("app_service_id")]
        [Validation(Required=true)]
        public string AppServiceId { get; set; }

        // 集群容器目标数量。target_num需要大于当前集群容器数量，扩容（target_num-当前集群容器数量）个容器。
        [NameInMap("target_num")]
        [Validation(Required=true)]
        public long? TargetNum { get; set; }

        // 操作人
        [NameInMap("submitter_id")]
        [Validation(Required=false)]
        public string SubmitterId { get; set; }

        // 容器分组策略，默认SYSTEM_RECOMMENDATION
        [NameInMap("group_strategy")]
        [Validation(Required=false)]
        public string GroupStrategy { get; set; }

    }

}
