// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateDevicecorpDevicecontrolRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备列表
        [NameInMap("device_infos")]
        [Validation(Required=true)]
        public List<DeviceOperateInfo> DeviceInfos { get; set; }

        // 设备管控操作；OPEN：设备开启；CLOSE：设备关闭；RESET：设备重置。
        [NameInMap("device_operation")]
        [Validation(Required=true)]
        public string DeviceOperation { get; set; }

    }

}
