// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 交换机详细信息
    public class VSwitch : TeaModel {
        // 交换机的IPv4网段
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // 交换机的创建时间
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 交换机的描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // cn-hangzhou
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // 交换机的状态，取值：
        // 
        // Pending：配置中。
        // Available：可用。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 交换机所属VPC的ID
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // 交换机的ID
        [NameInMap("v_switch_id")]
        [Validation(Required=false)]
        public string VSwitchId { get; set; }

        // 交换机的名称
        [NameInMap("v_switch_name")]
        [Validation(Required=false)]
        public string VSwitchName { get; set; }

        // 交换机所属的可用区
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // zone iaas id
        [NameInMap("zone_iaas_id")]
        [Validation(Required=false)]
        public string ZoneIaasId { get; set; }

    }

}
