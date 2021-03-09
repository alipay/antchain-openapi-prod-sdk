// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用服务查询
    public class AppServiceQuery : TeaModel {
        // 根据 id 查询
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // deployStatus
        [NameInMap("deploy_status")]
        [Validation(Required=false)]
        public string DeployStatus { get; set; }

        // ownerId
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // workspaceIds
        [NameInMap("workspace_ids")]
        [Validation(Required=false)]
        public List<string> WorkspaceIds { get; set; }

        // appIds
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // 是否为一方化查询请求
        [NameInMap("is_one_party_request")]
        [Validation(Required=false)]
        public bool? IsOnePartyRequest { get; set; }

        // startIndex
        [NameInMap("start_index")]
        [Validation(Required=false)]
        public long? StartIndex { get; set; }

        // pageSize
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // currentPage
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // orders
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

        // 查询类型
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

        // Map<String, String>
        [NameInMap("conditions")]
        [Validation(Required=false)]
        public string Conditions { get; set; }

    }

}
