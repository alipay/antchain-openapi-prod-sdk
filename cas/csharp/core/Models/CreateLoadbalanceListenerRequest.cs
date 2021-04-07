// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateLoadbalanceListenerRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // backend_server_port
        [NameInMap("backend_server_port")]
        [Validation(Required=false)]
        public long? BackendServerPort { get; set; }

        // bandwidth
        [NameInMap("bandwidth")]
        [Validation(Required=false)]
        public long? Bandwidth { get; set; }

        // certificate_iaas_id
        [NameInMap("certificate_iaas_id")]
        [Validation(Required=false)]
        public string CertificateIaasId { get; set; }

        // certificate_id
        [NameInMap("certificate_id")]
        [Validation(Required=false)]
        public string CertificateId { get; set; }

        // cookie
        [NameInMap("cookie")]
        [Validation(Required=false)]
        public string Cookie { get; set; }

        // cookie_timeout
        [NameInMap("cookie_timeout")]
        [Validation(Required=false)]
        public long? CookieTimeout { get; set; }

        // established_timeout
        [NameInMap("established_timeout")]
        [Validation(Required=false)]
        public long? EstablishedTimeout { get; set; }

        // gm_crypto_cert_iaas_id
        [NameInMap("gm_crypto_cert_iaas_id")]
        [Validation(Required=false)]
        public string GmCryptoCertIaasId { get; set; }

        // gm_sign_cert_iaas_id
        [NameInMap("gm_sign_cert_iaas_id")]
        [Validation(Required=false)]
        public string GmSignCertIaasId { get; set; }

        // health_monitor
        [NameInMap("health_monitor")]
        [Validation(Required=false)]
        public ListenerHealthMonitor HealthMonitor { get; set; }

        // lb id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // listener_port
        [NameInMap("listener_port")]
        [Validation(Required=true)]
        public long? ListenerPort { get; set; }

        // persist_timeout
        [NameInMap("persist_timeout")]
        [Validation(Required=false)]
        public long? PersistTimeout { get; set; }

        // scheduler
        [NameInMap("scheduler")]
        [Validation(Required=false)]
        public string Scheduler { get; set; }

        // sticky_session_type
        [NameInMap("sticky_session_type")]
        [Validation(Required=false)]
        public string StickySessionType { get; set; }

        // tls_cipher_policy
        [NameInMap("tls_cipher_policy")]
        [Validation(Required=false)]
        public string TlsCipherPolicy { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // v_computer_group_id
        [NameInMap("v_computer_group_id")]
        [Validation(Required=false)]
        public string VComputerGroupId { get; set; }

        // x_forwarded_for
        [NameInMap("x_forwarded_for")]
        [Validation(Required=false)]
        public string XForwardedFor { get; set; }

    }

}
