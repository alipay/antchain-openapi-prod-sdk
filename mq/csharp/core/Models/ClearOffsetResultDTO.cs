// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 清除消费进度结果对象
    public class ClearOffsetResultDTO : TeaModel {
        // GroupId
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 操作结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

    }

}
