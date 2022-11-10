// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备采购订单元素
    public class IotBasicDeviceOrderItem : TeaModel {
        // 蚂蚁链IoT平台设备唯一ID
        [NameInMap("device_did")]
        [Validation(Required=true)]
        public string DeviceDid { get; set; }

        // 设备唯一编号
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备金额，精确到小数后两位
        [NameInMap("payment_amount")]
        [Validation(Required=true)]
        public string PaymentAmount { get; set; }

    }

}
