// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // rmc vpc 详细信息
    public class VpcVO : TeaModel {
        // VPC的状态，取值： Pending：配置中。 Available：可用。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // VPC的IPv4网段
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // VPC路由器的ID
        [NameInMap("v_router_iaas_id")]
        [Validation(Required=false)]
        public string VRouterIaasId { get; set; }

        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // vpc name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 计费类型
        [NameInMap("instance_charge_type")]
        [Validation(Required=false)]
        public string InstanceChargeType { get; set; }

        // vpc iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // provider id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // iaas 底座类型
        [NameInMap("iaas_type")]
        [Validation(Required=false)]
        public string IaasType { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // zone id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // vpc id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // 创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 最近一次修改时间
        [NameInMap("utc_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcModified { get; set; }

    }

}
