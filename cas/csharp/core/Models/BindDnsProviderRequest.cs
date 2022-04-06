// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class BindDnsProviderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 部分环境绑定到机房机房
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

        // dns_provider_id
        [NameInMap("dns_provider_id")]
        [Validation(Required=true)]
        public string DnsProviderId { get; set; }

        // default_sub_domain_name
        [NameInMap("default_sub_domain_name")]
        [Validation(Required=false)]
        public string DefaultSubDomainName { get; set; }

    }

}
