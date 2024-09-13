// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MEDIA_SMS.Models
{
    // 消息发送状态
    public class SmsSendStatus : TeaModel {
        // 手机号
        [NameInMap("phone_no")]
        [Validation(Required=true)]
        public string PhoneNo { get; set; }

        // 发送状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 发送状态描述
        [NameInMap("detail_msg")]
        [Validation(Required=true)]
        public string DetailMsg { get; set; }

    }

}
