// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class QueryDatabaseSchemaRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // char_sets
        [NameInMap("char_sets")]
        [Validation(Required=false)]
        public List<string> CharSets { get; set; }

        // current_page
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // database_id
        [NameInMap("database_id")]
        [Validation(Required=true)]
        public string DatabaseId { get; set; }

        // iaas_ids
        [NameInMap("iaas_ids")]
        [Validation(Required=false)]
        public List<string> IaasIds { get; set; }

        // ids
        [NameInMap("ids")]
        [Validation(Required=false)]
        public List<string> Ids { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

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
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
