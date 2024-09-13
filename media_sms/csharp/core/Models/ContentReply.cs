// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 上行内容
    public class ContentReply : TeaModel {
        // 手机号
        [NameInMap("phone")]
        [Validation(Required=true)]
        public string Phone { get; set; }

        // 用户是否已经退订过
        [NameInMap("reject")]
        [Validation(Required=true)]
        public bool? Reject { get; set; }

        // 用户最新回复内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 用户回复时间
        [NameInMap("reply_time")]
        [Validation(Required=true)]
        public string ReplyTime { get; set; }

        // 拓展字段
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
