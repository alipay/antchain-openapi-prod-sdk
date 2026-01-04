// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // 根据sessionId查询历史对话信息
    public class DisplaySingleSessionHistoryVO : TeaModel {
        // 展示内容列表，入参和出参放在一起，方便前端展示
        [NameInMap("content_list")]
        [Validation(Required=true)]
        public List<DisplayResponseContent> ContentList { get; set; }

    }

}
