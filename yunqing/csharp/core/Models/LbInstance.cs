// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // lb基线实例
    public class LbInstance : TeaModel {
        // lb资源池
        [NameInMap("resource_pool_name")]
        [Validation(Required=true)]
        public string ResourcePoolName { get; set; }

        // lb资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // lb资源实例名称
        [NameInMap("resource_name")]
        [Validation(Required=true)]
        public string ResourceName { get; set; }

        // lb路由信息：prodCode_appName
        [NameInMap("lb_router_name")]
        [Validation(Required=true)]
        public string LbRouterName { get; set; }

        // lb的vip
        [NameInMap("vip")]
        [Validation(Required=true)]
        public string Vip { get; set; }

        // lb绑定的域名
        [NameInMap("domain_name")]
        [Validation(Required=true)]
        public string DomainName { get; set; }

        // lb地址类型：INTENET公网，INTRANET内网
        [NameInMap("address_type")]
        [Validation(Required=true)]
        public string AddressType { get; set; }

        // lb带宽
        [NameInMap("bandwidth")]
        [Validation(Required=true)]
        public string Bandwidth { get; set; }

        // 是否是anytunnel lb
        [NameInMap("any_tunnel")]
        [Validation(Required=true)]
        public bool? AnyTunnel { get; set; }

        // 是否是办公网
        [NameInMap("official_only")]
        [Validation(Required=true)]
        public bool? OfficialOnly { get; set; }

        // lb类型：SLB、ALB
        [NameInMap("provider")]
        [Validation(Required=true)]
        public string Provider { get; set; }

        // lb状态，ACTIVE，FAILED
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 部署单元实例id
        [NameInMap("deployment_unit_instance_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitInstanceIdentity { get; set; }

        // 部署单元标识id
        [NameInMap("deployment_unit_identity")]
        [Validation(Required=true)]
        public string DeploymentUnitIdentity { get; set; }

    }

}
