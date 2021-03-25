// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryAppservicebuildpackrelationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 一组应用服务id
        [NameInMap("appservice_ids")]
        [Validation(Required=false)]
        public List<string> AppserviceIds { get; set; }

        // 一组应用id
        // 
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // buildpackArch
        [NameInMap("buildpack_arch")]
        [Validation(Required=false)]
        public string BuildpackArch { get; set; }

        // buildpackIds
        [NameInMap("buildpack_ids")]
        [Validation(Required=false)]
        public List<string> BuildpackIds { get; set; }

        // 当前页
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 是否降序
        [NameInMap("descend")]
        [Validation(Required=false)]
        public bool? Descend { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // 每页个数
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 分类
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // 开始索引
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // techstackIdentities
        [NameInMap("techstack_identities")]
        [Validation(Required=false)]
        public List<string> TechstackIdentities { get; set; }

        // 一组技术栈id
        [NameInMap("techstack_ids")]
        [Validation(Required=false)]
        public List<string> TechstackIds { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
