// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateResourceSecuritygroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 安全组描述信息。长度为2~256个英文或中文字符，不能以http://和https://开头。
        // 
        // 默认值：空。
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 安全组入方向规则
        [NameInMap("ingress_rules")]
        [Validation(Required=false)]
        public List<SecurityGroupRule> IngressRules { get; set; }

        // 安全组出方向规则
        [NameInMap("egress_rules")]
        [Validation(Required=false)]
        public List<SecurityGroupRule> EgressRules { get; set; }

        // 安全组名称。长度为2~128个英文或中文字符。必须以大小字母或中文开头，不能以 http://和https://开头。可以包含数字、半角冒号（:）、下划线（_）或者连字符（-）。默认值：空。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 安全组所属地域identity
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 安全组所属VPC ID。
        [NameInMap("vpc_id")]
        [Validation(Required=true)]
        public string VpcId { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
