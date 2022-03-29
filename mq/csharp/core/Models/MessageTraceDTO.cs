// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // MessageTrace信息结构
    public class MessageTraceDTO : TeaModel {
        // 查询结果
        [NameInMap("track_list")]
        [Validation(Required=true)]
        public List<MessageTrackDTO> TrackList { get; set; }

    }

}
