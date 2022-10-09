// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备注册 请求对象
    public class IotBasicDeviceRegisterInfo : TeaModel {
        // 设备规格
        [NameInMap("device_specs")]
        [Validation(Required=true)]
        public string DeviceSpecs { get; set; }

        // 设备型号
        [NameInMap("device_model")]
        [Validation(Required=true)]
        public string DeviceModel { get; set; }

        // 设备名称
        [NameInMap("device_name")]
        [Validation(Required=true)]
        public string DeviceName { get; set; }

        // 设备sn
        [NameInMap("device_sn")]
        [Validation(Required=true)]
        public string DeviceSn { get; set; }

        // 设备标签
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 安装位置
        [NameInMap("location")]
        [Validation(Required=false)]
        public string Location { get; set; }

        // 设备扩展信息
        [NameInMap("device_ext")]
        [Validation(Required=false)]
        public string DeviceExt { get; set; }

        // 设备安全认证ID
        [NameInMap("sec_id")]
        [Validation(Required=false)]
        public string SecId { get; set; }

    }

}
