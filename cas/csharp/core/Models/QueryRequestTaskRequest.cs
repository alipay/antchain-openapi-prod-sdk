// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryRequestTaskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // max_time
        [NameInMap("max_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string MaxTime { get; set; }

        // min_time
        [NameInMap("min_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string MinTime { get; set; }

        // operators
        [NameInMap("operators")]
        [Validation(Required=false)]
        public List<string> Operators { get; set; }

        // operatorType
        [NameInMap("operator_type")]
        [Validation(Required=false)]
        public string OperatorType { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // requestIds
        [NameInMap("request_ids")]
        [Validation(Required=false)]
        public List<string> RequestIds { get; set; }

        // request_statuses
        [NameInMap("request_statuses")]
        [Validation(Required=false)]
        public List<string> RequestStatuses { get; set; }

        // request_types
        [NameInMap("request_types")]
        [Validation(Required=false)]
        public List<string> RequestTypes { get; set; }

        // resource_ids
        [NameInMap("resource_ids")]
        [Validation(Required=false)]
        public List<string> ResourceIds { get; set; }

        // resource_types
        [NameInMap("resource_types")]
        [Validation(Required=false)]
        public List<string> ResourceTypes { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // workspace_ids
        [NameInMap("workspace_ids")]
        [Validation(Required=false)]
        public List<string> WorkspaceIds { get; set; }

    }

}
