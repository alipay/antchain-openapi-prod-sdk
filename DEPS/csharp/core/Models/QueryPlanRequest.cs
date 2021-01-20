// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryPlanRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // gmtCreateEnd
        [NameInMap("gmt_create_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreateEnd { get; set; }

        // gmtCreateStart
        [NameInMap("gmt_create_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreateStart { get; set; }

        // initialByTag
        [NameInMap("initial_by_tag")]
        [Validation(Required=false)]
        public string InitialByTag { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // opsModes
        [NameInMap("ops_modes")]
        [Validation(Required=false)]
        public List<string> OpsModes { get; set; }

        // ops_types
        [NameInMap("ops_types")]
        [Validation(Required=false)]
        public List<string> OpsTypes { get; set; }

        // page no
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // plan_ids
        [NameInMap("plan_ids")]
        [Validation(Required=false)]
        public List<string> PlanIds { get; set; }

        // plan_time_serials_id
        [NameInMap("plan_time_serials_id")]
        [Validation(Required=false)]
        public string PlanTimeSerialsId { get; set; }

        // releaseModes
        [NameInMap("release_modes")]
        [Validation(Required=false)]
        public List<string> ReleaseModes { get; set; }

        // serviceName
        [NameInMap("service_name")]
        [Validation(Required=false)]
        public string ServiceName { get; set; }

        // states
        [NameInMap("states")]
        [Validation(Required=false)]
        public List<string> States { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
