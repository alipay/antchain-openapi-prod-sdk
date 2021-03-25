// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryConfigGlobalRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 模板参数保密级别
        [NameInMap("data_level")]
        [Validation(Required=false)]
        public string DataLevel { get; set; }

        // 参数名
        [NameInMap("key")]
        [Validation(Required=false)]
        public string Key { get; set; }

        // 排序规则数组，默认为 UTC_MODIFIED_DESC，即 根据修改时间降序排序
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

        // 根据参数类型进行查询
        [NameInMap("param_type")]
        [Validation(Required=false)]
        public string ParamType { get; set; }

        // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 key
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 该参数属于哪个 scope，可以在多个 scope 中查询
        [NameInMap("scopes")]
        [Validation(Required=false)]
        public List<string> Scopes { get; set; }

        // 该参数在该 scope 中的 id
        [NameInMap("scope_id")]
        [Validation(Required=false)]
        public string ScopeId { get; set; }

    }

}
