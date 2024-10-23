// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 通知信息
    public class NoticeInfo : TeaModel {
        // 通知id
        [NameInMap("notice_id")]
        [Validation(Required=false)]
        public long? NoticeId { get; set; }

        // 通知标题
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 通知创建时间
        [NameInMap("notice_create_time")]
        [Validation(Required=false)]
        public string NoticeCreateTime { get; set; }

        // 是否未读
        [NameInMap("unread")]
        [Validation(Required=false)]
        public bool? Unread { get; set; }

    }

}
