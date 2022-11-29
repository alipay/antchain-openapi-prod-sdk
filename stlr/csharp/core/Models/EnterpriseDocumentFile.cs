// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 文档信息
    public class EnterpriseDocumentFile : TeaModel {
        // 文档名称
        [NameInMap("document_name")]
        [Validation(Required=true)]
        public string DocumentName { get; set; }

        // 文件地址
        [NameInMap("document_address")]
        [Validation(Required=true)]
        public string DocumentAddress { get; set; }

    }

}
