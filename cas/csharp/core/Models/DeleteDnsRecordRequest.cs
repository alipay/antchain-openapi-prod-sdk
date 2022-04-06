// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class DeleteDnsRecordRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // dns_recordset_id
        [NameInMap("dns_recordset_id")]
        [Validation(Required=true)]
        public string DnsRecordsetId { get; set; }

        // dns_record_ip
        [NameInMap("dns_record_ip")]
        [Validation(Required=true)]
        public string DnsRecordIp { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
