// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateBuildpackUpdatepackagesstatusRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // buildpackId
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // newFileStatus
        [NameInMap("new_file_status")]
        [Validation(Required=false)]
        public string NewFileStatus { get; set; }

        // originalFileStatus
        [NameInMap("original_file_status")]
        [Validation(Required=false)]
        public string OriginalFileStatus { get; set; }

        // regionIds
        [NameInMap("region_num")]
        [Validation(Required=false)]
        public List<string> RegionNum { get; set; }

    }

}
