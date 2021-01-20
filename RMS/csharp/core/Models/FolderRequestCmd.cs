// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // FolderRequestCmd
    public class FolderRequestCmd : TeaModel {
        // custom_plugin_id
        [NameInMap("custom_plugin_id")]
        [Validation(Required=false)]
        public long? CustomPluginId { get; set; }

        // folder_id
        [NameInMap("folder_id")]
        [Validation(Required=false)]
        public long? FolderId { get; set; }

        // include_me
        [NameInMap("include_me")]
        [Validation(Required=false)]
        public bool? IncludeMe { get; set; }

        // include_plugin_name
        [NameInMap("include_plugin_name")]
        [Validation(Required=false)]
        public bool? IncludePluginName { get; set; }

    }

}
