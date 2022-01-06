// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class ReinitRcSyncclusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 集群唯一表示，大部分情况下等于 instanceId
        [NameInMap("cluster_task_unique_key")]
        [Validation(Required=true)]
        public string ClusterTaskUniqueKey { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 新的集群信息.
        // { // 商户当前注册中心集群信息 "type": "EUREKA", // 集群类型 "name": "xx_eureka", // 集群名字 "vip": "11.22.33.44;12.33.44.1", // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔) "extraParams": [{ //扩展参数，比如涉及到鉴权 "key": "user", "value": "xx" }, { "key": "password", "value": "xx" }] }
        [NameInMap("new_cluster")]
        [Validation(Required=true)]
        public string NewCluster { get; set; }

        // 是否允许集群切换
        [NameInMap("replace_cluster_enabled")]
        [Validation(Required=true)]
        public string ReplaceClusterEnabled { get; set; }

    }

}
