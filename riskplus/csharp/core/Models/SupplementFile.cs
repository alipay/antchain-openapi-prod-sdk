// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 补充材料
    public class SupplementFile : TeaModel {
        // 材料类型：
        // 301-行驶证正本
        // 302-行驶证副本
        // 303-车辆产证（摩托车二手车）
        // 
        [NameInMap("file_type")]
        [Validation(Required=true)]
        public string FileType { get; set; }

        // 材料url
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 材料名称/描述
        [NameInMap("file_desc")]
        [Validation(Required=true)]
        public string FileDesc { get; set; }

    }

}
