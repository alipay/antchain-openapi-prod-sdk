// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // BizDomain
    public class BizDomain : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // tenant_id
        // 
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public long? TenantId { get; set; }

        // config
        [NameInMap("config")]
        [Validation(Required=true)]
        public string Config { get; set; }

        // outside_domain_id
        [NameInMap("outside_domain_id")]
        [Validation(Required=true)]
        public string OutsideDomainId { get; set; }

        // entity_list
        [NameInMap("entity_list")]
        [Validation(Required=true)]
        public string EntityList { get; set; }

    }

}
