// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFedspannerclusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用于描述联邦spanner 集群内容器实例采用内网还是外网
        [NameInMap("address_type")]
        [Validation(Required=true)]
        public string AddressType { get; set; }

        // 用于描述联邦spanner 集群内容器实例 cpu大小， 单位core 
        [NameInMap("cpu")]
        [Validation(Required=true)]
        public string Cpu { get; set; }

        // 用于描述联邦spanner 集群内容器实例disk大小， 单位Gi 
        [NameInMap("disk")]
        [Validation(Required=true)]
        public string Disk { get; set; }

        // 用于描述联邦spanner 集群内容器实例的网络是否采用host网络
        [NameInMap("host_network")]
        [Validation(Required=true)]
        public bool? HostNetwork { get; set; }

        // 用于描述联邦spanner 集群内容器实例mem 大小， 单位 Gi  
        [NameInMap("mem")]
        [Validation(Required=true)]
        public string Mem { get; set; }

        // 用于描述联邦spanner 集群名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 描述集群初始状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 定义了container的spec信息，包含多版本，镜像，副本数，标签等
        [NameInMap("sub_clusters_config")]
        [Validation(Required=true)]
        public string SubClustersConfig { get; set; }

        // 工作空间组信息
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
