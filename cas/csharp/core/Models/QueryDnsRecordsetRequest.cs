// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryDnsRecordsetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // resource_type
        [NameInMap("resource_type")]
        [Validation(Required=false)]
        public string ResourceType { get; set; }

        // ip
        // 
        [NameInMap("ip")]
        [Validation(Required=false)]
        public string Ip { get; set; }

        // dns_recordset_name
        [NameInMap("dns_recordset_name")]
        [Validation(Required=false)]
        public string DnsRecordsetName { get; set; }

        // resource_name
        [NameInMap("resource_name")]
        [Validation(Required=false)]
        public string ResourceName { get; set; }

        // resource_iaas_ids
        [NameInMap("resource_iaas_ids")]
        [Validation(Required=false)]
        public List<string> ResourceIaasIds { get; set; }

        // dns_recordset_ids
        [NameInMap("dns_recordset_ids")]
        [Validation(Required=false)]
        public List<string> DnsRecordsetIds { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

    }

}
