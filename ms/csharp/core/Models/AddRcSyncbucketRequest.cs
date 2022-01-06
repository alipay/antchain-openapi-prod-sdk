// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class AddRcSyncbucketRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 是否自动开启数据同步任务(默认不开启同步任务)
        [NameInMap("auto_start")]
        [Validation(Required=true)]
        public bool? AutoStart { get; set; }

        // 自己指定的生成集群任务的唯一 key，针对聚石塔的情况，与用户的环境一一映射(查询时使用)
        [NameInMap("cluster_task_unique_key")]
        [Validation(Required=true)]
        public string ClusterTaskUniqueKey { get; set; }

        // {  // 商户当前注册中心集群信息
        //     "type": "EUREKA",   // 集群类型
        //     "name": "xx_eureka", // 集群名字
        //     "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
        //     "extraParams": [{   //扩展参数，比如涉及到鉴权
        //       "key": "user",
        //       "value": "xx"
        //     }, {
        //       "key": "password",
        //       "value": "xx"
        //     }]
        //   }
        [NameInMap("source_cluster")]
        [Validation(Required=true)]
        public string SourceCluster { get; set; }

        // {  // 商户当前注册中心集群信息
        //     "type": "EUREKA",   // 集群类型
        //     "name": "xx_eureka", // 集群名字
        //     "vip": "11.22.33.44;12.33.44.1",   // 集群入口地址，可以是 vip；也可以是 ip 列表(多个用分号 ; 间隔)
        //     "extraParams": [{   //扩展参数，比如涉及到鉴权
        //       "key": "user",
        //       "value": "xx"
        //     }, {
        //       "key": "password",
        //       "value": "xx"
        //     }]
        //   }
        [NameInMap("target_cluster")]
        [Validation(Required=true)]
        public string TargetCluster { get; set; }

        // 是否开启双向同步(默认单向：从 source_cluster -> target_cluster)，聚石塔中传为 true
        [NameInMap("two_way_sync")]
        [Validation(Required=true)]
        public bool? TwoWaySync { get; set; }

        // 租户实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

    }

}
