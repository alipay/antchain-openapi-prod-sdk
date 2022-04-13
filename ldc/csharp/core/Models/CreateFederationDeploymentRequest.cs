// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFederationDeploymentRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属应用
        [NameInMap("app")]
        [Validation(Required=true)]
        public string App { get; set; }

        // clusters
        [NameInMap("clusters")]
        [Validation(Required=true)]
        public List<string> Clusters { get; set; }

        // FedDeploymentClusterOverride描述
        [NameInMap("cluster_overrides")]
        [Validation(Required=false)]
        public List<FedDeploymentClusterOverride> ClusterOverrides { get; set; }

        // DNS配置
        [NameInMap("dns_policy")]
        [Validation(Required=false)]
        public string DnsPolicy { get; set; }

        // Host networking requested for this pod
        [NameInMap("host_network")]
        [Validation(Required=false)]
        public bool? HostNetwork { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // Pod模板描述
        [NameInMap("pod_spec")]
        [Validation(Required=true)]
        public PodSpec PodSpec { get; set; }

        // Deployment 副本数
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public long? Replicas { get; set; }

        // Pod volume list
        [NameInMap("volumes")]
        [Validation(Required=false)]
        public List<Volume> Volumes { get; set; }

        // 环境组名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
