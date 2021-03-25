// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // NotificationConfig
    public class NotificationConfig : TeaModel {
        // 接收人列表
        [NameInMap("receivers")]
        [Validation(Required=false)]
        public List<NotificationReceiver> Receivers { get; set; }

        // 类型
        [NameInMap("notification_type")]
        [Validation(Required=false)]
        public string NotificationType { get; set; }

        // 是否开启，默认不开启
        [NameInMap("enabled")]
        [Validation(Required=false)]
        public bool? Enabled { get; set; }

        // cloud_web_url
        [NameInMap("cloud_web_url")]
        [Validation(Required=false)]
        public string CloudWebUrl { get; set; }

        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

    }

}
