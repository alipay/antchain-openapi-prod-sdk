// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 钉钉消息体
    public class DingTalkContent : TeaModel {
        // webHook
        [NameInMap("web_hook")]
        [Validation(Required=false)]
        public string WebHook { get; set; }

        // 消息类型
        [NameInMap("msgtype")]
        [Validation(Required=false)]
        public string Msgtype { get; set; }

        // 文字
        [NameInMap("text")]
        [Validation(Required=false)]
        public Text Text { get; set; }

        // 链接
        [NameInMap("link")]
        [Validation(Required=false)]
        public Link Link { get; set; }

        // markdown
        [NameInMap("markdown")]
        [Validation(Required=false)]
        public Markdown Markdown { get; set; }

        // actionCard
        [NameInMap("action_card")]
        [Validation(Required=false)]
        public ActionCard ActionCard { get; set; }

        // feedCard
        [NameInMap("feed_card")]
        [Validation(Required=false)]
        public FeedCard FeedCard { get; set; }

        // at
        [NameInMap("at")]
        [Validation(Required=false)]
        public At At { get; set; }

    }

}
