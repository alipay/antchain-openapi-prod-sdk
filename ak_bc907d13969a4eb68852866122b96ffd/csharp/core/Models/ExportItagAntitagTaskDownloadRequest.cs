// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_bc907d13969a4eb68852866122b96ffd.Models
{
    public class ExportItagAntitagTaskDownloadRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // iTAG租户id
        [NameInMap("tntinstid")]
        [Validation(Required=false)]
        public string Tntinstid { get; set; }

        // TaskId
        [NameInMap("taskid")]
        [Validation(Required=false)]
        public string Taskid { get; set; }

        // Encode
        [NameInMap("encode")]
        [Validation(Required=false)]
        public string Encode { get; set; }

    }

}
