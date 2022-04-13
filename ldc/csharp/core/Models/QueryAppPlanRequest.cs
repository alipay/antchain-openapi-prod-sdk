// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryAppPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称，精准查询
        [NameInMap("app_name")]
        [Validation(Required=true)]
        public string AppName { get; set; }

        // 当前页码，从1开始，默认为1
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 排序规则，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
        [NameInMap("order")]
        [Validation(Required=false)]
        public string Order { get; set; }

        // 分页大小，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 状态筛选列表
        [NameInMap("states")]
        [Validation(Required=false)]
        public List<string> States { get; set; }

        // 查询指定发布单 timeseries_id 列表
        [NameInMap("timeseries_ids")]
        [Validation(Required=false)]
        public List<string> TimeseriesIds { get; set; }

        // 工作空间组id列表
        [NameInMap("workspace_group_names")]
        [Validation(Required=false)]
        public List<string> WorkspaceGroupNames { get; set; }

    }

}
