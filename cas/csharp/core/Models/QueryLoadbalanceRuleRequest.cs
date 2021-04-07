// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // cookies
        [NameInMap("cookies")]
        [Validation(Required=false)]
        public List<string> Cookies { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // domains
        [NameInMap("domains")]
        [Validation(Required=false)]
        public List<string> Domains { get; set; }

        // domain_urls
        [NameInMap("domain_urls")]
        [Validation(Required=false)]
        public List<string> DomainUrls { get; set; }

        // health_monitor_ids
        [NameInMap("health_monitor_ids")]
        [Validation(Required=false)]
        public List<string> HealthMonitorIds { get; set; }

        // listener_ports
        [NameInMap("listener_ports")]
        [Validation(Required=false)]
        public List<long?> ListenerPorts { get; set; }

        // loadbalancer_ids
        [NameInMap("loadbalancer_ids")]
        [Validation(Required=false)]
        public List<string> LoadbalancerIds { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // urls
        [NameInMap("urls")]
        [Validation(Required=false)]
        public List<string> Urls { get; set; }

        // vcomputer_group_ids
        [NameInMap("vcomputer_group_ids")]
        [Validation(Required=false)]
        public List<string> VcomputerGroupIds { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
