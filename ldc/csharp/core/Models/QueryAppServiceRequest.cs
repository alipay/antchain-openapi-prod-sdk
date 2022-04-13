// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryAppServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 根据应用名称查询，不能为空，不支持一次性查询所有应用，是精准查询，不支持模糊匹配
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 容器服务名
        [NameInMap("container_service_name")]
        [Validation(Required=false)]
        public string ContainerServiceName { get; set; }

        // 当前页码，从1开始，默认为1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 部署状态
        [NameInMap("deployment_states")]
        [Validation(Required=false)]
        public List<string> DeploymentStates { get; set; }

        // 所属命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
        [NameInMap("order")]
        [Validation(Required=false)]
        public string Order { get; set; }

        // 分页大小，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 container_service_name
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 工作空间组id列表
        [NameInMap("workspace_group_names")]
        [Validation(Required=false)]
        public List<string> WorkspaceGroupNames { get; set; }

    }

}
