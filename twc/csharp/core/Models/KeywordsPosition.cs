// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 关键字位置列表
    public class KeywordsPosition : TeaModel {
        // 关键字
        [NameInMap("keyword")]
        [Validation(Required=true)]
        public string Keyword { get; set; }

        // 页码
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // x坐标
        [NameInMap("pos_x")]
        [Validation(Required=true)]
        public string PosX { get; set; }

        // y坐标
        [NameInMap("pos_y")]
        [Validation(Required=true)]
        public string PosY { get; set; }

    }

}
