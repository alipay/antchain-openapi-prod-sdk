// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ANTVERSE.Models
{
    // 弹幕结构体
    public class DanmakuListBO : TeaModel {
        // 弹幕内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 用户昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 发送时间戳(ms)
        [NameInMap("send_time")]
        [Validation(Required=true)]
        public long? SendTime { get; set; }

        // 直播平台code
        [NameInMap("room_type")]
        [Validation(Required=true)]
        public string RoomType { get; set; }

    }

}
