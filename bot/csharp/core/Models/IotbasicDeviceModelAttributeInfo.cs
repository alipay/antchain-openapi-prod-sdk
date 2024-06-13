// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotbasic设备模型属性
    public class IotbasicDeviceModelAttributeInfo : TeaModel {
        // 型号
        [NameInMap("model_value")]
        [Validation(Required=true)]
        public string ModelValue { get; set; }

        // 规格列表
        // 为空表示使用标准规格
        [NameInMap("specs_list")]
        [Validation(Required=false)]
        public List<string> SpecsList { get; set; }

    }

}
