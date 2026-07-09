// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicDevicecontrolRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备did 集合
        [NameInMap("device_did_list")]
        [Validation(Required=false)]
        public string DeviceDidList { get; set; }

        // 设备did 集合
        [NameInMap("device_operate_infos")]
        [Validation(Required=false)]
        public List<DeviceOperateInfo> DeviceOperateInfos { get; set; }

        // 设备操作类型
        [NameInMap("device_operation")]
        [Validation(Required=true)]
        public string DeviceOperation { get; set; }

        // 所属账号名称
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

    }

}
