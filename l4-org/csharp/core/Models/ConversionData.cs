// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ORG.Models
{
    // 转化统计数据
    public class ConversionData : TeaModel {
        // 渠道
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 投放人数
        [NameInMap("send_cnt")]
        [Validation(Required=true)]
        public long? SendCnt { get; set; }

        // 核销人数
        [NameInMap("use_cnt")]
        [Validation(Required=true)]
        public long? UseCnt { get; set; }

        // 核销率
        [NameInMap("use_rate")]
        [Validation(Required=true)]
        public string UseRate { get; set; }

    }

}
