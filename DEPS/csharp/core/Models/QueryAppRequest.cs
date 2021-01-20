// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryAppRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 根据应用分组查询，为空默认查询所有应用分组
        [NameInMap("app_group_name")]
        [Validation(Required=false)]
        public string AppGroupName { get; set; }

        // 根据应用名称查询，为空默认查询所有应用
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

        // 当前页码，从1开始，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 分页大小，默认为10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name, app_group_name
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

    }

}
