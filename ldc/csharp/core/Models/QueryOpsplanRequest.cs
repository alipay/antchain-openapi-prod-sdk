// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryOpsplanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        // 
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 发布单创建起始时间
        // 
        [NameInMap("creation_time_from")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTimeFrom { get; set; }

        // 发布单创建截止时间
        // 
        [NameInMap("creation_time_to")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreationTimeTo { get; set; }

        // 当前页码，从1开始
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 发布单名称前缀
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 运维单类型：REBOOT,ONLINE,OFFLINE
        [NameInMap("mode")]
        [Validation(Required=false)]
        public string Mode { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 发布单id列表
        // 
        [NameInMap("plan_ids")]
        [Validation(Required=false)]
        public List<string> PlanIds { get; set; }

        // 发布单状态列表
        [NameInMap("state_list")]
        [Validation(Required=false)]
        public List<string> StateList { get; set; }

        // 发布单号
        // 
        [NameInMap("time_series_id")]
        [Validation(Required=false)]
        public string TimeSeriesId { get; set; }

        // 发布单类型列表， e.g: 分组发布|重启
        // 
        [NameInMap("types")]
        [Validation(Required=true)]
        public List<string> Types { get; set; }

        // 工作空间组名称
        // 
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
