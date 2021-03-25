// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // SupportedRegion
    public class SupportedRegion : TeaModel {
        // file_size
        [NameInMap("file_size")]
        [Validation(Required=false)]
        public long? FileSize { get; set; }

        // file_status
        [NameInMap("file_status")]
        [Validation(Required=false)]
        public string FileStatus { get; set; }

        // original_file_name
        [NameInMap("original_file_name")]
        [Validation(Required=false)]
        public string OriginalFileName { get; set; }

        // region_id
        [NameInMap("region_num")]
        [Validation(Required=false)]
        public string RegionNum { get; set; }

    }

}
