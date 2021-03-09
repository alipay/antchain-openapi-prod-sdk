// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // LoadBalancerRule
    public class LoadBalancerRule : TeaModel {
        // load_balancer
        [NameInMap("load_balancer")]
        [Validation(Required=false)]
        public LoadBalancer LoadBalancer { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // listener_port
        [NameInMap("listener_port")]
        [Validation(Required=false)]
        public long? ListenerPort { get; set; }

        // status
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // domain
        [NameInMap("domain")]
        [Validation(Required=false)]
        public string Domain { get; set; }

        // url
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // cookie
        [NameInMap("cookie")]
        [Validation(Required=false)]
        public string Cookie { get; set; }

        // is_health_monitor
        [NameInMap("is_health_monitor")]
        [Validation(Required=false)]
        public string IsHealthMonitor { get; set; }

        // health_monitor
        [NameInMap("health_monitor")]
        [Validation(Required=false)]
        public ListenerHealthMonitor HealthMonitor { get; set; }

        // sticky_session
        [NameInMap("sticky_session")]
        [Validation(Required=false)]
        public string StickySession { get; set; }

        // app_id
        [NameInMap("app_id")]
        [Validation(Required=false)]
        public string AppId { get; set; }

        // workspace_id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

    }

}
