// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 安全组规则
    public class SecurityGroupRule : TeaModel {
        // 规则描述信息
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 目的端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
        [NameInMap("dest_cidr_ip")]
        [Validation(Required=false)]
        public string DestCidrIp { get; set; }

        // 传输层协议。不区分大小写。取值范围：
        // 
        // icmp
        // gre
        // tcp
        // udp
        // all：支持所有协议
        [NameInMap("ip_protocol")]
        [Validation(Required=false)]
        public string IpProtocol { get; set; }

        // 经典网络类型安全组规则的网卡类型。取值范围：
        // 
        // internet：公网。
        // intranet：内网。
        // 默认值：internet。
        // 
        // 在以下情况中，参数NicType取值只能为intranet：
        // 
        // 安全组规则的网络类型为专有网络VPC时，您无需设置NicType参数，默认并且只能为intranet。
        // 当设置安全组之间互相访问时，即指定了DestGroupId且没有指定DestCidrIp时。
        [NameInMap("nic_type")]
        [Validation(Required=false)]
        public string NicType { get; set; }

        // 访问权限。取值范围：
        // 
        // accept：接受访问。
        // drop：拒绝访问，不返回拒绝信息。
        // 默认值：accept。
        [NameInMap("policy")]
        [Validation(Required=false)]
        public string Policy { get; set; }

        // 目的端安全组开放的传输层协议相关的端口范围。取值范围：
        // 
        // TCP/UDP协议：取值范围为1~65535。使用斜线（/）隔开起始端口和终止端口。正确示范：1/200；错误示范：200/1。
        // ICMP协议：-1/-1。
        // GRE协议：-1/-1。
        // all：-1/-1。
        [NameInMap("port_range")]
        [Validation(Required=false)]
        public string PortRange { get; set; }

        // 安全组规则优先级。取值范围：1~100
        // 
        // 默认值：1。
        [NameInMap("priority")]
        [Validation(Required=false)]
        public string Priority { get; set; }

        // 源端IP地址范围。支持CIDR格式和IPv4格式的IP地址范围。
        // 
        // 默认值：0.0.0.0/0。
        [NameInMap("source_cidr_ip")]
        [Validation(Required=false)]
        public string SourceCidrIp { get; set; }

    }

}
