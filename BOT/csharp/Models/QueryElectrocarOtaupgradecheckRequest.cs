// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarOtaupgradecheckRequest : TeaModel {
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

        // 模块版本上报列表
        [NameInMap("module_versions")]
        [Validation(Required=false)]
        public List<ModuleVersionItem> ModuleVersions { get; set; }

        // 是否返回已升级完成任务，默认 false
        [NameInMap("include_success")]
        [Validation(Required=false)]
        public bool? IncludeSuccess { get; set; }

    }

}
