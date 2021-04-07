// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceVswitchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 交换机的网段。交换机网段要求如下：
        // 
        // 交换机的网段的掩码长度范围为16~29位。
        // 交换机的网段必须从属于所在VPC的网段。
        // 交换机的网段不能与所在VPC中路由条目的目标网段相同，但可以是目标网段的子集。
        [NameInMap("cidr_block")]
        [Validation(Required=true)]
        public string CidrBlock { get; set; }

        // 描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 交换机的名称。
        // 
        // 名称长度为2~128个字符，必须以字母或中文开头，但不能以http://或https://开头。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 要创建的交换机的地域 identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 要创建的交换机所属的VPC ID。
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // 要创建的交换机所属的可用区 identity
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

    }

}
