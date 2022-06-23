// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 设备参数名称/key/value
    public class ArgsNameValue : TeaModel {
        // 设备参数名称
        [NameInMap("args_name")]
        [Validation(Required=false)]
        public string ArgsName { get; set; }

        // 设备参数key
        [NameInMap("args_key")]
        [Validation(Required=true)]
        public string ArgsKey { get; set; }

        // 设备参数value
        [NameInMap("args_value")]
        [Validation(Required=true)]
        public string ArgsValue { get; set; }

        // 设备参数标识(ip,mac,bizid)
        [NameInMap("args_mark")]
        [Validation(Required=false)]
        public string ArgsMark { get; set; }

    }

}
