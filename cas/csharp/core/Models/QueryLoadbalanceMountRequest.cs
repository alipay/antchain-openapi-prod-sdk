// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryLoadbalanceMountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // app_ids
        [NameInMap("app_ids")]
        [Validation(Required=false)]
        public List<string> AppIds { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // domains
        [NameInMap("domains")]
        [Validation(Required=false)]
        public List<string> Domains { get; set; }

        // iaas_ids_exclude
        [NameInMap("iaas_ids_exclude")]
        [Validation(Required=false)]
        public List<string> IaasIdsExclude { get; set; }

        // initialized
        [NameInMap("initialized")]
        [Validation(Required=false)]
        public bool? Initialized { get; set; }

        // loadbalance_ids
        [NameInMap("loadbalance_ids")]
        [Validation(Required=true)]
        public List<string> LoadbalanceIds { get; set; }

        // mounted
        [NameInMap("mounted")]
        [Validation(Required=false)]
        public bool? Mounted { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // region_ids
        [NameInMap("region_ids")]
        [Validation(Required=false)]
        public List<string> RegionIds { get; set; }

        // zone_ids
        [NameInMap("zone_ids")]
        [Validation(Required=false)]
        public List<string> ZoneIds { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
