// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECH.Models
{
    // 主题信息
    public class MeiyouTopicWebInfo : TeaModel {
        // 内容文本
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 当前楼层
        [NameInMap("current_floor")]
        [Validation(Required=false)]
        public long? CurrentFloor { get; set; }

        // 回复楼层
        [NameInMap("call_back_floor")]
        [Validation(Required=false)]
        public long? CallBackFloor { get; set; }

        // 发布时间戳(毫秒)
        // 
        [NameInMap("publish_time")]
        [Validation(Required=false)]
        public long? PublishTime { get; set; }

        // 图片URL数组(JSON字符串)
        [NameInMap("images")]
        [Validation(Required=false)]
        public string Images { get; set; }

        // 用户昵称
        [NameInMap("user_nickname")]
        [Validation(Required=false)]
        public string UserNickname { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 用户类型
        // 
        [NameInMap("user_type")]
        [Validation(Required=false)]
        public string UserType { get; set; }

        // 用户头像URL
        [NameInMap("user_avatar")]
        [Validation(Required=false)]
        public string UserAvatar { get; set; }

    }

}
