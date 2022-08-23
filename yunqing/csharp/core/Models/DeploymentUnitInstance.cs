// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 产品部署单元实例信息
    public class DeploymentUnitInstance : TeaModel {
        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // 产品版本
        [NameInMap("prod_version")]
        [Validation(Required=true)]
        public string ProdVersion { get; set; }

        // 部署单元实例id
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署单元实例状态：ACTIVE、FAILED、UPGRADING
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 部署拓扑标识
        [NameInMap("deploy_topology_identity")]
        [Validation(Required=true)]
        public string DeployTopologyIdentity { get; set; }

        // 部署规格标识id
        [NameInMap("deploy_spec_identity")]
        [Validation(Required=true)]
        public string DeploySpecIdentity { get; set; }

        // 部署单元部署在哪个zone
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 逻辑部署单元实例id
        [NameInMap("logical_instance_id")]
        [Validation(Required=false)]
        public string LogicalInstanceId { get; set; }

    }

}
