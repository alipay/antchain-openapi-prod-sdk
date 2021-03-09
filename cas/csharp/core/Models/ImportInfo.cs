// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // vpc import info
    public class ImportInfo : TeaModel {
        // 已导入的workspace name
        [NameInMap("imported_workspace_name")]
        [Validation(Required=false)]
        public string ImportedWorkspaceName { get; set; }

        // vpc是否已导入workspace
        [NameInMap("is_imported")]
        [Validation(Required=false)]
        public bool? IsImported { get; set; }

        // 是否可以删除已导入的workspace
        [NameInMap("is_unimportable")]
        [Validation(Required=false)]
        public bool? IsUnimportable { get; set; }

        // 不可删除已导入workspace的原因
        [NameInMap("unimportable_reason")]
        [Validation(Required=false)]
        public string UnimportableReason { get; set; }

    }

}
