// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateAppopsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 执行运维操作的目标应用列表。
        [NameInMap("app_service_ids")]
        [Validation(Required=false)]
        public List<string> AppServiceIds { get; set; }

        // 执行运维操作的目标容器列表。当ops_dimension为CONTAINER时，该参数必填。
        [NameInMap("container_ids")]
        [Validation(Required=false)]
        public List<string> ContainerIds { get; set; }

        // 目标环境唯一标识。
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启，RECOVERY_RESTART：容灾重启，DISABLE_SLB_TRAFFIC:应用摘流，ENABLE_SLB_TRAFFIC:应用挂流。
        [NameInMap("ops_action")]
        [Validation(Required=true)]
        public string OpsAction { get; set; }

        // 应用运维维度。两种取值：APP_SERVICE、CONTAINER。
        [NameInMap("ops_dimension")]
        [Validation(Required=true)]
        public string OpsDimension { get; set; }

        // 要执行运维操作的应用服务实例所在的单元。
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

    }

}
