// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
    public class PodDNSConfig : TeaModel {
        // A list of DNS name server IP addresses
        [NameInMap("nameservers")]
        [Validation(Required=false)]
        public List<string> Nameservers { get; set; }

        // A list of DNS resolver options. 
        [NameInMap("options")]
        [Validation(Required=false)]
        public List<PodDNSConfigOption> Options { get; set; }

        // A list of DNS search domains for host-name lookup
        [NameInMap("searches")]
        [Validation(Required=true)]
        public List<string> Searches { get; set; }

    }

}
