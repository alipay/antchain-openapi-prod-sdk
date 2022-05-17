// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    // 绑定实例
    public class BindInstance : TeaModel {
        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 集群名字
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // 支持的region
        [NameInMap("regions")]
        [Validation(Required=true)]
        public List<string> Regions { get; set; }

        // 支持的dataCenter 
        [NameInMap("data_centers")]
        [Validation(Required=false)]
        public string DataCenters { get; set; }

        // 支持的zone 列表
        [NameInMap("zones")]
        [Validation(Required=false)]
        public string Zones { get; set; }

        // 绑定后的instanceId 信息
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // acvip 地址
        [NameInMap("acvip_endpoint")]
        [Validation(Required=true)]
        public string AcvipEndpoint { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
