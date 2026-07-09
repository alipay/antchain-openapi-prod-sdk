// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarOtataskpermanentcancelRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备定位信息
        [NameInMap("device_locator")]
        [Validation(Required=true)]
        public DeviceLocator DeviceLocator { get; set; }

        // 取消来源：APP_USER - 用户选择不再提示该版本 / VENDOR - 厂家后台取消 / ADMIN - 管理员取消
        [NameInMap("cancel_source")]
        [Validation(Required=true)]
        public string CancelSource { get; set; }

        // 取消原因
        [NameInMap("cancel_reason")]
        [Validation(Required=false)]
        public string CancelReason { get; set; }

        // 待永久取消的固件任务列表
        [NameInMap("items")]
        [Validation(Required=true)]
        public List<IotxOtaTaskPermanentCancelItem> Items { get; set; }

    }

}
