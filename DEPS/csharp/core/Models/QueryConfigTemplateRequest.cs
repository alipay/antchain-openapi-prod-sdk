// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryConfigTemplateRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用名称
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

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

        // 查询类型，支持精准查询、模糊查询、前缀模糊查询，这里默认为模糊查询；查询类型针对字段 app_name
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // 模板状态，DRAFT 草稿，RELEASE 已发布，发布后才会生成 version，否则为空
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // 版本
        [NameInMap("tpl_version")]
        [Validation(Required=false)]
        public string TplVersion { get; set; }

    }

}
