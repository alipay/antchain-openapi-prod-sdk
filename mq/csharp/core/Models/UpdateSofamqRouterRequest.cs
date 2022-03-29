// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class UpdateSofamqRouterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前状态
        [NameInMap("current_status")]
        [Validation(Required=true)]
        public long? CurrentStatus { get; set; }

        // 路由任务描述信息
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 路由任务 ID
        [NameInMap("router_id")]
        [Validation(Required=true)]
        public long? RouterId { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 目标状态
        [NameInMap("target_status")]
        [Validation(Required=true)]
        public long? TargetStatus { get; set; }

    }

}
