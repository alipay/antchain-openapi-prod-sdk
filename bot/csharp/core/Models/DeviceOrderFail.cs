// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 订单同步失败结果
    public class DeviceOrderFail : TeaModel {
        // 订单id
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 设备did
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 返回code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 失败
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

    }

}
