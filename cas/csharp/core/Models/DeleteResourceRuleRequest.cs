// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteResourceRuleRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 传输层协议。参数值大小写敏感。取值范围：
        // 
        // icmp
        // gre
        // tcp
        // udp
        // all：支持所有协议
        [NameInMap("ip_protocol")]
        [Validation(Required=true)]
        public string IpProtocol { get; set; }

        // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
        // 
        // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。例如：1/200
        // ICMP协议：-1/-1
        // GRE协议：-1/-1
        // all：-1/-1
        [NameInMap("port_range")]
        [Validation(Required=true)]
        public string PortRange { get; set; }

        // CN-HANGZHOU_FINANCE
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // 枚举值：
        // ingress：入口规则
        // egress：出口规则
        [NameInMap("rule_type")]
        [Validation(Required=true)]
        public string RuleType { get; set; }

        // 目的端安全组ID。
        [NameInMap("security_group_id")]
        [Validation(Required=true)]
        public string SecurityGroupId { get; set; }

        // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
        [NameInMap("source_cidr_ip")]
        [Validation(Required=false)]
        public string SourceCidrIp { get; set; }

        // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。默认值：0.0.0.0/0
        [NameInMap("dest_cidr_ip")]
        [Validation(Required=false)]
        public string DestCidrIp { get; set; }

    }

}
