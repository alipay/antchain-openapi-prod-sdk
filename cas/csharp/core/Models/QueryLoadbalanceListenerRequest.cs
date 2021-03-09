// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceListenerRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // backend_server_ports
        [NameInMap("backend_server_ports")]
        [Validation(Required=false)]
        public List<long?> BackendServerPorts { get; set; }

        // certificate_iaas_ids
        [NameInMap("certificate_iaas_ids")]
        [Validation(Required=false)]
        public List<string> CertificateIaasIds { get; set; }

        // certificate_ids
        [NameInMap("certificate_ids")]
        [Validation(Required=false)]
        public List<string> CertificateIds { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // gm_crypto_cert_iaas_ids
        [NameInMap("gm_crypto_cert_iaas_ids")]
        [Validation(Required=false)]
        public List<string> GmCryptoCertIaasIds { get; set; }

        // gm_sign_cert_iaas_ids
        [NameInMap("gm_sign_cert_iaas_ids")]
        [Validation(Required=false)]
        public List<string> GmSignCertIaasIds { get; set; }

        // listener_ports
        [NameInMap("listener_ports")]
        [Validation(Required=false)]
        public List<long?> ListenerPorts { get; set; }

        // load_balancer_ids
        [NameInMap("load_balancer_ids")]
        [Validation(Required=false)]
        public List<string> LoadBalancerIds { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // types
        [NameInMap("types")]
        [Validation(Required=false)]
        public List<string> Types { get; set; }

        // v_computer_group_ids
        [NameInMap("v_computer_group_ids")]
        [Validation(Required=false)]
        public List<string> VComputerGroupIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
