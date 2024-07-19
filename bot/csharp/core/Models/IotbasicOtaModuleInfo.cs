// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic ota模块信息
    public class IotbasicOtaModuleInfo : TeaModel {
        // OTA模块名称
        [NameInMap("module_name")]
        [Validation(Required=true)]
        public string ModuleName { get; set; }

        // 最新版本号
        [NameInMap("last_version")]
        [Validation(Required=false)]
        public string LastVersion { get; set; }

    }

}
