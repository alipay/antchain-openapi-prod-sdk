// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateProdsAppopsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 环境id	
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署单元实例id
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitInstanceIdentity { get; set; }

        // 应用运维的操作类型，取值列表：ONLINE：上线，OFFLINE：下线，RESTART:重启	
        // 
        [NameInMap("ops_action")]
        [Validation(Required=true)]
        public string OpsAction { get; set; }

        // 容器名称列表	
        // 
        [NameInMap("container_names")]
        [Validation(Required=true)]
        public List<string> ContainerNames { get; set; }

        // 应用容器分组策略，默认取SYSTEM_RECOMMENDATION
        [NameInMap("group_strategy")]
        [Validation(Required=true)]
        public string GroupStrategy { get; set; }

    }

}
