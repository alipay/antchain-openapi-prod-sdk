// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryResourceComputerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // iaas id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // 逗号分隔的实例ID，最多支持100个
        [NameInMap("instance_ids")]
        [Validation(Required=false)]
        public List<string> InstanceIds { get; set; }

        // 实例名称，支持使用通配符*进行模糊搜索。
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // 实例的规格
        [NameInMap("instance_type")]
        [Validation(Required=false)]
        public string InstanceType { get; set; }

        // 主机的内网ip，取值可以由多个IP组成一个JSON数组，最多支持100个IP，IP之间用半角逗号（,）隔开。
        [NameInMap("private_ip_addresses")]
        [Validation(Required=false)]
        public List<string> PrivateIpAddresses { get; set; }

        // 供应商id
        [NameInMap("provider_id")]
        [Validation(Required=false)]
        public string ProviderId { get; set; }

        // 实例所属的地域ID
        [NameInMap("region_id")]
        [Validation(Required=true)]
        public string RegionId { get; set; }

        // 实例所在的企业资源组ID。
        [NameInMap("resource_group_id")]
        [Validation(Required=false)]
        public string ResourceGroupId { get; set; }

        // 实例状态。取值范围：
        // 
        // Running：运行中
        // Starting：启动中
        // Stopping：停止中
        // Stopped：已停止
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 主机所在工作空间
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
