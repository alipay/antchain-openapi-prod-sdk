// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // FolderPath
    public class FolderPath : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // v
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
