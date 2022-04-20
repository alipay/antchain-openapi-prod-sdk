// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    public class CreateProdinstanceDeployunitbatchRequest : TeaModel {
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

        // 部署单元名称
        [NameInMap("deployment_unit_name")]
        [Validation(Required=true)]
        public string DeploymentUnitName { get; set; }

        // 部署单元实例id列表
        [NameInMap("unit_instance_ids")]
        [Validation(Required=true)]
        public List<string> UnitInstanceIds { get; set; }

        // 逻辑部署单元实例id
        [NameInMap("logical_instance_id")]
        [Validation(Required=true)]
        public string LogicalInstanceId { get; set; }

        // 集群中哪个zone，公有云场景使用，专有云不需要部署
        [NameInMap("cell_id")]
        [Validation(Required=true)]
        public string CellId { get; set; }

    }

}
