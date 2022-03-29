// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // ControlPlan
    public class ControlPlan : TeaModel {
        // action_id
        [NameInMap("action_id")]
        [Validation(Required=true)]
        public long? ActionId { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // plugin_type
        [NameInMap("plugin_type")]
        [Validation(Required=true)]
        public string PluginType { get; set; }

        // plugin_id
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public string PluginId { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public long? FileId { get; set; }

        // ds_name
        [NameInMap("ds_name")]
        [Validation(Required=true)]
        public string DsName { get; set; }

    }

}
