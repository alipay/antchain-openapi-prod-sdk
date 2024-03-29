// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // IpFileOs
    public class IpFileOs : TeaModel {
        // error_msg
        [NameInMap("error_msg")]
        [Validation(Required=true)]
        public string ErrorMsg { get; set; }

        // ip
        [NameInMap("ip")]
        [Validation(Required=true)]
        public string Ip { get; set; }

        // next_file_id
        [NameInMap("next_file_id")]
        [Validation(Required=true)]
        public string NextFileId { get; set; }

        // next_offset
        [NameInMap("next_offset")]
        [Validation(Required=true)]
        public long? NextOffset { get; set; }

        // uuid
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

    }

}
