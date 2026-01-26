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
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 参考分类接口中返回的分类结果
        [NameInMap("type_cn")]
        [Validation(Required=false)]
        public string TypeCn { get; set; }

        // 细分的分类结果
        [NameInMap("sub_type")]
        [Validation(Required=false)]
        public string SubType { get; set; }

        // 细分的分类结果
        [NameInMap("sub_type_cn")]
        [Validation(Required=false)]
        public string SubTypeCn { get; set; }

        // 参考Extraction参数
        [NameInMap("extraction")]
        [Validation(Required=false)]
        public List<Extraction> Extraction { get; set; }

        // 参考Page参数
        [NameInMap("page")]
        [Validation(Required=false)]
        public List<Page> Page { get; set; }

    }

}
