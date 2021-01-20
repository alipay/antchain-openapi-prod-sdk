// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryServiceRollbackversionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // depth
        [NameInMap("depth")]
        [Validation(Required=false)]
        public long? Depth { get; set; }

        // gmt_create_end
        [NameInMap("gmt_create_end")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreateEnd { get; set; }

        // gmt_create_start
        [NameInMap("gmt_create_start")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}[Z]")]
        public string GmtCreateStart { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // ops_types
        [NameInMap("ops_types")]
        [Validation(Required=false)]
        public List<string> OpsTypes { get; set; }

        // page_no
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // process_definition_id
        [NameInMap("process_definition_id")]
        [Validation(Required=false)]
        public string ProcessDefinitionId { get; set; }

        // service_group_collection_id
        [NameInMap("service_group_collection_id")]
        [Validation(Required=false)]
        public string ServiceGroupCollectionId { get; set; }

        // service_paas_id
        [NameInMap("service_paas_id")]
        [Validation(Required=false)]
        public string ServicePaasId { get; set; }

        // state
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
