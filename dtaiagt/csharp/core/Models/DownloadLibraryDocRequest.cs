// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    public class DownloadLibraryDocRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 知识库ID
        [NameInMap("library_id")]
        [Validation(Required=true)]
        public long? LibraryId { get; set; }

        // 文档ID
        [NameInMap("doc_id")]
        [Validation(Required=true)]
        public long? DocId { get; set; }

    }

}
