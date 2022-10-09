// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class OperateIotbasicDeviceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备不可操作列表
        [NameInMap("device_disable_list")]
        [Validation(Required=true)]
        public List<DeviceDisableData> DeviceDisableList { get; set; }

        // 不允许操作类型
        // DISABLE_CHAGE：不允许变更租户
        // DISABLE_EDIT：不允许编辑设备
        // DISABLE_DEL：不允许删除设备
        [NameInMap("disable_operate_type")]
        [Validation(Required=true)]
        public string DisableOperateType { get; set; }

        // 操作状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 不允许操作提示，操作状态为true时必须有值
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

    }

}
