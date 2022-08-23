// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 资源基线实例元信息
    public class ResourceInstance : TeaModel {
        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

        // 产品码
        [NameInMap("prod_code")]
        [Validation(Required=true)]
        public string ProdCode { get; set; }

        // zz-rdb
        [NameInMap("resource_pool_name")]
        [Validation(Required=true)]
        public string ResourcePoolName { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 资源类型：LB、SERVER、RDB
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 区域id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 可用区id
        [NameInMap("zone_id")]
        [Validation(Required=true)]
        public string ZoneId { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

        // 部署单元实例id
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitInstanceIdentity { get; set; }

    }

}
