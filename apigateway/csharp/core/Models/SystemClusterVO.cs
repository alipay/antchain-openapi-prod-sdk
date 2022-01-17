// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // SystemClusterVO
    public class SystemClusterVO : TeaModel {
        // api数
        [NameInMap("api_count")]
        [Validation(Required=false)]
        public long? ApiCount { get; set; }

        // 认证配置
        [NameInMap("authentication_config")]
        [Validation(Required=false)]
        public AuthenticationConfigVO AuthenticationConfig { get; set; }

        // 认证方式
        [NameInMap("authentication_type")]
        [Validation(Required=false)]
        public string AuthenticationType { get; set; }

        // 是否可以删除
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 绑定的外部授权数量
        [NameInMap("external_auth_count")]
        [Validation(Required=false)]
        public long? ExternalAuthCount { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // 系统host地址
        [NameInMap("host")]
        [Validation(Required=false)]
        public List<string> Host { get; set; }

        // 负载均衡策略类型
        [NameInMap("lb_type")]
        [Validation(Required=false)]
        public string LbType { get; set; }

        // 创建人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 端口
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // sys_id
        [NameInMap("sys_id")]
        [Validation(Required=false)]
        public string SysId { get; set; }

        // sys_name
        [NameInMap("sys_name")]
        [Validation(Required=false)]
        public string SysName { get; set; }

        // 系统类型(手工配置/sofa注册中心/zk)
        [NameInMap("sys_type")]
        [Validation(Required=false)]
        public string SysType { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // unique_id
        [NameInMap("unique_id")]
        [Validation(Required=false)]
        public string UniqueId { get; set; }

        // upstream_protocol
        [NameInMap("upstream_protocol")]
        [Validation(Required=false)]
        public string UpstreamProtocol { get; set; }

        // 下发协议的开头
        [NameInMap("url_type")]
        [Validation(Required=false)]
        public string UrlType { get; set; }

        // vpc_id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // registry_id
        [NameInMap("registry_id")]
        [Validation(Required=false)]
        public string RegistryId { get; set; }

        // registry_info
        [NameInMap("registry_info")]
        [Validation(Required=false)]
        public RegistryInfoVO RegistryInfo { get; set; }

        // triple域名
        [NameInMap("triple_host")]
        [Validation(Required=false)]
        public string TripleHost { get; set; }

        // need_tls
        [NameInMap("need_tls")]
        [Validation(Required=false)]
        public bool? NeedTls { get; set; }

        // 证书类型
        [NameInMap("tls_type")]
        [Validation(Required=false)]
        public string TlsType { get; set; }

    }

}
