// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 安全组详细信息
    public class SecurityGroup : TeaModel {
        // 创建时间。按照ISO8601标准表示，并需要使用UTC时间。格式为：yyyy-MM-ddThh:mmZ。
        [NameInMap("creation_time")]
        [Validation(Required=true)]
        public string CreationTime { get; set; }

        // 安全组的描述信息。
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 安全组ID。
        [NameInMap("security_group_id")]
        [Validation(Required=true)]
        public string SecurityGroupId { get; set; }

        // 安全组名称。
        [NameInMap("security_group_name")]
        [Validation(Required=true)]
        public string SecurityGroupName { get; set; }

        // 安全组所属的专有网络。
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // 安全组入方向规则
        [NameInMap("ingress_rules")]
        [Validation(Required=false)]
        public List<SecurityGroupRule> IngressRules { get; set; }

        // 安全组出方向规则
        [NameInMap("egress_rules")]
        [Validation(Required=false)]
        public List<SecurityGroupRule> EgressRules { get; set; }

    }

}
