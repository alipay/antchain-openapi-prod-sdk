// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class AddDnsRecordsetRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // type: 记录类型，默认为A, 仅支持 A, CName, 见DnsRecordSetType
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // type: 类型, PUBLIC(外部域名) 或者 PRIVATE (域名) 见DnsNetworkType
        [NameInMap("dns_network_type")]
        [Validation(Required=false)]
        public string DnsNetworkType { get; set; }

        // tenant_id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // dns_records
        [NameInMap("dns_records")]
        [Validation(Required=true)]
        public List<DnsRecordParam> DnsRecords { get; set; }

    }

}
