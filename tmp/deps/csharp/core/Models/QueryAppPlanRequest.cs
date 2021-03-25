// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryAppPlanRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

        // 发布单 order_id
        [NameInMap("order_id")]
        [Validation(Required=false)]
        public string OrderId { get; set; }

        // 当前页码，从1开始，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 状态筛选列表
        [NameInMap("state_list")]
        [Validation(Required=false)]
        public List<string> StateList { get; set; }

        // 工作空间名称
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // 工作空间 id 列表
        [NameInMap("workspace_ids")]
        [Validation(Required=false)]
        public List<string> WorkspaceIds { get; set; }

    }

}
