// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 应用查询
    public class AppQuery : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // chineseName
        [NameInMap("chinese_name")]
        [Validation(Required=false)]
        public string ChineseName { get; set; }

        // stackId
        [NameInMap("stack_id")]
        [Validation(Required=false)]
        public string StackId { get; set; }

        // startVersion
        [NameInMap("start_version")]
        [Validation(Required=false)]
        public string StartVersion { get; set; }

        // endVersion
        [NameInMap("end_version")]
        [Validation(Required=false)]
        public string EndVersion { get; set; }

        // appIds
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // appDomainId
        [NameInMap("app_domain_id")]
        [Validation(Required=false)]
        public string AppDomainId { get; set; }

        // appDomainIds
        [NameInMap("app_domain_ids")]
        [Validation(Required=false)]
        public List<string> AppDomainIds { get; set; }

        // appDomainName
        [NameInMap("app_domain_name")]
        [Validation(Required=false)]
        public string AppDomainName { get; set; }

        // appLevelId
        [NameInMap("app_level_id")]
        [Validation(Required=false)]
        public string AppLevelId { get; set; }

        // ownerId
        [NameInMap("owner_id")]
        [Validation(Required=false)]
        public string OwnerId { get; set; }

        // isComponent
        [NameInMap("is_component")]
        [Validation(Required=false)]
        public bool? IsComponent { get; set; }

        // simpleQuery
        [NameInMap("simple_query")]
        [Validation(Required=false)]
        public bool? SimpleQuery { get; set; }

        // workspaceId
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // containerCount
        [NameInMap("container_count")]
        [Validation(Required=false)]
        public string ContainerCount { get; set; }

        // databaseCount
        [NameInMap("database_count")]
        [Validation(Required=false)]
        public string DatabaseCount { get; set; }

        // slbCount
        [NameInMap("slb_count")]
        [Validation(Required=false)]
        public string SlbCount { get; set; }

        // utcCreate
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // isOnePartyRequest
        [NameInMap("is_one_party_request")]
        [Validation(Required=false)]
        public bool? IsOnePartyRequest { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页数
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // orders
        [NameInMap("orders")]
        [Validation(Required=false)]
        public List<string> Orders { get; set; }

        // queryType
        [NameInMap("query_type")]
        [Validation(Required=false)]
        public string QueryType { get; set; }

    }

}
