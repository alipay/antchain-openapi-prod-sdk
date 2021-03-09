// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // Database ImportVO
    public class ImportVO : TeaModel {
        // is_imported
        [NameInMap("is_imported")]
        [Validation(Required=true)]
        public bool? IsImported { get; set; }

        // imported_workspace_name
        [NameInMap("imported_workspace_name")]
        [Validation(Required=true)]
        public string ImportedWorkspaceName { get; set; }

        // is_unimportable
        [NameInMap("is_unimportable")]
        [Validation(Required=false)]
        public bool? IsUnimportable { get; set; }

        // unimportable_reason
        [NameInMap("unimportable_reason")]
        [Validation(Required=false)]
        public string UnimportableReason { get; set; }

    }

}
