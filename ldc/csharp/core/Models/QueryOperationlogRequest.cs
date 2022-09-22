// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOperationlogRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 页码。起始值：1。默认值：1。
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 分页查询时设置的每页行数。最大值：100，默认值：10。
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 实体类型。LDC_PLAN/LDC_SERVICE/POD_CONTAINER
        [NameInMap("entity_type")]
        [Validation(Required=false)]
        public string EntityType { get; set; }

        // 目标id。发布单plan_id或者lks_service_id。
        [NameInMap("target_id")]
        [Validation(Required=false)]
        public string TargetId { get; set; }

        // 当前工作空间组名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 集群id，entity_type==POD_CONTAINER 时有用
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // pod名称，entity_type==POD_CONTAINER 时有用
        [NameInMap("pod_name")]
        [Validation(Required=false)]
        public string PodName { get; set; }

        // 命名空间，entity_type==POD_CONTAINER 时必传
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

    }

}
