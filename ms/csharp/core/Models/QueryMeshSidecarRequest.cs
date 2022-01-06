// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    public class QueryMeshSidecarRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 查询指定应用服务的
        [NameInMap("app_service_name")]
        [Validation(Required=false)]
        public string AppServiceName { get; set; }

        // 查询指定集群的，如果未设置，则根据tenant + workspace获取
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // 查询指定命名空间的，如果未指定，默认值为default
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 分页查询索引页，默认0
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 分页查询单页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

        // 查询指定podIp(英文半角逗号分割)的
        [NameInMap("pod_ip")]
        [Validation(Required=false)]
        public string PodIp { get; set; }

        // 查询指定pod状态的
        [NameInMap("pod_status")]
        [Validation(Required=false)]
        public string PodStatus { get; set; }

        // 查询指定sidecar状态的
        [NameInMap("sidecar_status")]
        [Validation(Required=false)]
        public string SidecarStatus { get; set; }

        // 查询注入指定版本sidecar的
        [NameInMap("sidecar_version")]
        [Validation(Required=false)]
        public string SidecarVersion { get; set; }

        // 排序字段，默认pod创建时间
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // 升序(ascend) 或 降序(descend)
        [NameInMap("sort_order")]
        [Validation(Required=false)]
        public string SortOrder { get; set; }

        // sidecar类型(mosn/odp/mist)
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
