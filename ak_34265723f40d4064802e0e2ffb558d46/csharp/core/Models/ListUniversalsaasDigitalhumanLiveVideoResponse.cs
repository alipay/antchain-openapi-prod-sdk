// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_34265723f40d4064802e0e2ffb558d46.Models
{
    public class ListUniversalsaasDigitalhumanLiveVideoResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 结果状态
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 直播视频列表
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<LiveVideos> Data { get; set; }

        // 直播模式（是否包含交互插播等模式，code待定）
        [NameInMap("live_mode")]
        [Validation(Required=false)]
        public string LiveMode { get; set; }

        // 直播循环次数
        [NameInMap("loop_count")]
        [Validation(Required=false)]
        public long? LoopCount { get; set; }

    }

}
