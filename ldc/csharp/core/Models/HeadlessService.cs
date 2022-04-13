// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // headless service 配置
    public class HeadlessService : TeaModel {
        // headless service 的名称，不能以-0~-9结尾
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
