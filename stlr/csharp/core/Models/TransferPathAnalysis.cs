// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 转型路径分析数据
    public class TransferPathAnalysis : TeaModel {
        // 所属领域
        [NameInMap("field")]
        [Validation(Required=true)]
        public string Field { get; set; }

        // 目录编号
        [NameInMap("index_number")]
        [Validation(Required=true)]
        public string IndexNumber { get; set; }

        // 目录内容
        [NameInMap("index_content")]
        [Validation(Required=true)]
        public string IndexContent { get; set; }

        // 技术标准说明
        [NameInMap("detail")]
        [Validation(Required=true)]
        public string Detail { get; set; }

        // 企业是否采取该路径
        [NameInMap("target")]
        [Validation(Required=true)]
        public string Target { get; set; }

    }

}
