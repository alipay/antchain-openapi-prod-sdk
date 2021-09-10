// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 文档信息
    public class Document : TeaModel {
        // 文档url
        [NameInMap("document_url")]
        [Validation(Required=true, MaxLength=500)]
        public string DocumentUrl { get; set; }

        // 文档名称 
        [NameInMap("document_name")]
        [Validation(Required=true, MaxLength=200)]
        public string DocumentName { get; set; }

    }

}
