// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    public class QueryDciPreviewRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // dci作品预览id
        [NameInMap("dci_preview_id")]
        [Validation(Required=false)]
        public string DciPreviewId { get; set; }

        // basis的dci content id
        [NameInMap("dci_basis_id")]
        [Validation(Required=false)]
        public string DciBasisId { get; set; }

    }

}
