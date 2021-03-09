// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryDiskRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // current page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // page size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // workspace name
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // statuses
        [NameInMap("statuses")]
        [Validation(Required=false)]
        public List<string> Statuses { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // computer_ids
        [NameInMap("computer_ids")]
        [Validation(Required=false)]
        public List<string> ComputerIds { get; set; }

        // devices
        [NameInMap("devices")]
        [Validation(Required=false)]
        public List<string> Devices { get; set; }

        // max_size
        [NameInMap("max_size")]
        [Validation(Required=false)]
        public long? MaxSize { get; set; }

        // min_size
        [NameInMap("min_size")]
        [Validation(Required=false)]
        public long? MinSize { get; set; }

        // workspace_ids
        [NameInMap("workspace_ids")]
        [Validation(Required=false)]
        public List<string> WorkspaceIds { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

    }

}
