// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 设备风险信息
    public class DeviceRiskInfo : TeaModel {
        // 设备是否root
        [NameInMap("is_device_rooted")]
        [Validation(Required=false)]
        public bool? IsDeviceRooted { get; set; }

        // 设备是否hook
        [NameInMap("is_device_hooked")]
        [Validation(Required=false)]
        public bool? IsDeviceHooked { get; set; }

        // 设备是否使用定制rom
        [NameInMap("is_custom_rom")]
        [Validation(Required=false)]
        public bool? IsCustomRom { get; set; }

        // 设备是否是云手机
        [NameInMap("is_cloud_phone")]
        [Validation(Required=false)]
        public bool? IsCloudPhone { get; set; }

        // 是否为模拟器
        [NameInMap("is_emulator")]
        [Validation(Required=false)]
        public bool? IsEmulator { get; set; }

        // 设备是否支持虚拟摄像头
        [NameInMap("has_virtual_camera")]
        [Validation(Required=false)]
        public bool? HasVirtualCamera { get; set; }

        // 设备是否使用虚拟摄像头
        [NameInMap("is_using_virtual_camera")]
        [Validation(Required=false)]
        public bool? IsUsingVirtualCamera { get; set; }

        // 设备是否有重打包风险
        [NameInMap("has_repack_risk")]
        [Validation(Required=false)]
        public bool? HasRepackRisk { get; set; }

        // 设备是否多开
        [NameInMap("is_multi_instance")]
        [Validation(Required=false)]
        public bool? IsMultiInstance { get; set; }

        // 设备是否开启虚拟定位
        [NameInMap("is_fake_location")]
        [Validation(Required=false)]
        public bool? IsFakeLocation { get; set; }

        // 有其他注入行为
        [NameInMap("has_other_injection")]
        [Validation(Required=false)]
        public bool? HasOtherInjection { get; set; }

        // 设备是否有其他自动化工具
        [NameInMap("has_atuomation_tools")]
        [Validation(Required=false)]
        public bool? HasAtuomationTools { get; set; }

        // 风险sdk的JSON格式数据
        [NameInMap("risk_sdk_json")]
        [Validation(Required=false)]
        public string RiskSdkJson { get; set; }

    }

}
