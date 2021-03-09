// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // rmc 交换机详细信息
    public class VSwitchVO : TeaModel {
        // 交换机的iaas ID
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 交换机名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 交换机描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 交换机的状态，取值： Pending：配置中。 Available：可用。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // vpc id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // workspace id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // zone id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // zone iaas id
        [NameInMap("zone_iaas_id")]
        [Validation(Required=false)]
        public string ZoneIaasId { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 换机的IPv4网段
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // 交换机创建时间
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string UtcCreate { get; set; }

        // 可用ip数目
        [NameInMap("available_ip_address_count")]
        [Validation(Required=false)]
        public long? AvailableIpAddressCount { get; set; }

    }

}
