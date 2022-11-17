// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 公证出证拒绝办理信息/终止信息
    public class RefuseInfo : TeaModel {
        // 拒绝理由/终止备注
        [NameInMap("reason")]
        [Validation(Required=true)]
        public string Reason { get; set; }

        // 不予办理决定书路径/终止决定书路径
        [NameInMap("notification_path")]
        [Validation(Required=true)]
        public string NotificationPath { get; set; }

    }

}
