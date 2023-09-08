// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 终端安全-Android应用加固-ClassMethodConfig
    public class ClassMethodConfig : TeaModel {
        // 加固类名
        [NameInMap("class_name")]
        [Validation(Required=true)]
        public string ClassName { get; set; }

        // 方法集合，使用英文逗号分隔
        [NameInMap("methods")]
        [Validation(Required=true)]
        public string Methods { get; set; }

    }

}
