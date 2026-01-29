// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICLAIM.Models
{
    // doument
    public class Document : TeaModel {
        // 参考分类接口中返回的分类结果
        [NameInMap("doc_type")]
        [Validation(Required=false)]
        public string DocType { get; set; }

        // 参考分类接口中返回的分类结果
        [NameInMap("doc_type_cn")]
        [Validation(Required=false)]
        public string DocTypeCn { get; set; }

        // 参考Extraction参数
        [NameInMap("extraction")]
        [Validation(Required=false)]
        public Extraction Extraction { get; set; }

        // 参考Page参数
        [NameInMap("pages")]
        [Validation(Required=false)]
        public List<Page> Pages { get; set; }

    }

}
