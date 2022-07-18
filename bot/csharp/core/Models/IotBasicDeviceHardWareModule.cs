// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // 设备硬件模块信息体
    public class IotBasicDeviceHardWareModule : TeaModel {
        // 所属规格
        [NameInMap("specs_id")]
        [Validation(Required=true)]
        public long? SpecsId { get; set; }

        // 硬件模块ID
        [NameInMap("hardware_module_id")]
        [Validation(Required=true)]
        public long? HardwareModuleId { get; set; }

        // 模块名称
        [NameInMap("hardware_module_name")]
        [Validation(Required=true)]
        public string HardwareModuleName { get; set; }

        // 模块编码
        [NameInMap("hardware_module_value")]
        [Validation(Required=true)]
        public string HardwareModuleValue { get; set; }

        // 模块参数
        [NameInMap("hardware_module_param")]
        [Validation(Required=true)]
        public string HardwareModuleParam { get; set; }

    }

}
