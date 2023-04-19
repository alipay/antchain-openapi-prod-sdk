// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 相似的明细结果
    public class ResembleDetail : TeaModel {
        // 相似分数
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 长度
        [NameInMap("length")]
        [Validation(Required=false)]
        public string Length { get; set; }

        // 明细类型，例如VIDEO_SEGMENT表示视频区间相似
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 查询源文件的位置信息
        [NameInMap("query_position_data")]
        [Validation(Required=true)]
        public ResemblePositionData QueryPositionData { get; set; }

        // 相似文件的位置信息
        [NameInMap("match_position_data")]
        [Validation(Required=true)]
        public ResemblePositionData MatchPositionData { get; set; }

    }

}
