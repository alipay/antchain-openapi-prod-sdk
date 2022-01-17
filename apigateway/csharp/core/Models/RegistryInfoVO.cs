// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // 注册中心详情
    public class RegistryInfoVO : TeaModel {
        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 注册中心标识
        [NameInMap("registry_id")]
        [Validation(Required=false)]
        public string RegistryId { get; set; }

        // 注册中心类型
        [NameInMap("registry_type")]
        [Validation(Required=false)]
        public string RegistryType { get; set; }

        // 名称
        [NameInMap("registry_name")]
        [Validation(Required=false)]
        public string RegistryName { get; set; }

        // access_key
        [NameInMap("access_key")]
        [Validation(Required=false)]
        public string AccessKey { get; set; }

        // secret_key
        [NameInMap("secret_key")]
        [Validation(Required=false)]
        public string SecretKey { get; set; }

        // 集群数量
        [NameInMap("sys_count")]
        [Validation(Required=false)]
        public long? SysCount { get; set; }

        // host
        [NameInMap("host")]
        [Validation(Required=false)]
        public List<string> Host { get; set; }

        // can_delete
        [NameInMap("can_delete")]
        [Validation(Required=false)]
        public bool? CanDelete { get; set; }

        // port
        [NameInMap("port")]
        [Validation(Required=false)]
        public long? Port { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // pub协议标识
        [NameInMap("pub_protocol")]
        [Validation(Required=false)]
        public string PubProtocol { get; set; }

        // can_update
        [NameInMap("can_update")]
        [Validation(Required=false)]
        public bool? CanUpdate { get; set; }

        // 注册中心分组
        [NameInMap("registry_group")]
        [Validation(Required=false)]
        public string RegistryGroup { get; set; }

        // 协议版本
        [NameInMap("protocol_version")]
        [Validation(Required=false)]
        public string ProtocolVersion { get; set; }

        // 命名空间
        [NameInMap("name_space")]
        [Validation(Required=false)]
        public string NameSpace { get; set; }

        // 集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

    }

}
