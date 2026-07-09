// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class PublishElectrocarModuleversionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备定位信息
        [NameInMap("device_locator")]
        [Validation(Required=false)]
        public DeviceLocator DeviceLocator { get; set; }

        // 模块定位信息
        [NameInMap("module_locator")]
        [Validation(Required=true)]
        public ModuleLocator ModuleLocator { get; set; }

        // 当前模块版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
