// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    public class CloseRmsPluginRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // body
        [NameInMap("body")]
        [Validation(Required=true)]
        public string Body { get; set; }

        // file_id
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public long? FileId { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // outside_bizdomain
        [NameInMap("outside_bizdomain")]
        [Validation(Required=true)]
        public string OutsideBizdomain { get; set; }

        // plugin_id
        [NameInMap("plugin_id")]
        [Validation(Required=true)]
        public long? PluginId { get; set; }

        // table
        [NameInMap("table")]
        [Validation(Required=true)]
        public string Table { get; set; }

    }

}
