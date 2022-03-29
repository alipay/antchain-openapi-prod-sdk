// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // ModelTreeNode
    public class ModelTreeNode : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // plugin_name
        [NameInMap("plugin_name")]
        [Validation(Required=true)]
        public string PluginName { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
