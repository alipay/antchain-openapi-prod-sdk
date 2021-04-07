// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LoadBalancerImportVO
    public class LoadBalancerImportVO : TeaModel {
        // iaas_id
        [NameInMap("iaas_id")]
        [Validation(Required=false)]
        public string IaasId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // network_type
        [NameInMap("network_type")]
        [Validation(Required=false)]
        public string NetworkType { get; set; }

        // inner_ip_address
        [NameInMap("inner_ip_address")]
        [Validation(Required=false)]
        public List<string> InnerIpAddress { get; set; }

        // public_ip_address
        [NameInMap("public_ip_address")]
        [Validation(Required=false)]
        public List<string> PublicIpAddress { get; set; }

        // utc_create
        [NameInMap("utc_create")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string UtcCreate { get; set; }

        // import_info
        [NameInMap("import_info")]
        [Validation(Required=true)]
        public ImportVO ImportInfo { get; set; }

    }

}
