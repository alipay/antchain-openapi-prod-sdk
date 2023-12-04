// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_34265723f40d4064802e0e2ffb558d46.Models
{
    // 视频结果列表
    public class LiveVideos : TeaModel {
        // 蚂蚁数字人平台直播id
        [NameInMap("live_id")]
        [Validation(Required=true)]
        public string LiveId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 视频片段id
        [NameInMap("section_id")]
        [Validation(Required=true)]
        public string SectionId { get; set; }

        // 视频地址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 是否插播，默认false
        [NameInMap("temp_video")]
        [Validation(Required=true)]
        public bool? TempVideo { get; set; }

        // 触发插播行为的时间戳，当isTemp为true时，存在该值
        [NameInMap("occurrence_time_stamp")]
        [Validation(Required=false)]
        public long? OccurrenceTimeStamp { get; set; }

        // 视频类型（start欢迎语、end结束、trans转场、normal普通、temporary评论插播）
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 视频剧本
        [NameInMap("text")]
        [Validation(Required=true)]
        public string Text { get; set; }

    }

}
