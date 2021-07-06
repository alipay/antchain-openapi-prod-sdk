// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GATEWAYX.Models
{
    // 调用者信息
    public class XInvokerInfo : TeaModel {
        // 调用渠道
        [NameInMap("invoke_channel")]
        [Validation(Required=true)]
        public string InvokeChannel { get; set; }

        // 渠道的用户id
        [NameInMap("invoke_channel_uid")]
        [Validation(Required=true)]
        public string InvokeChannelUid { get; set; }

        // 8位金融云租户ID
        [NameInMap("invoke_tenant")]
        [Validation(Required=true)]
        public string InvokeTenant { get; set; }

        // 调用者用户金融云id
        [NameInMap("invoke_user_id")]
        [Validation(Required=true)]
        public string InvokeUserId { get; set; }

    }

}
