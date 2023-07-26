// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 实例最近调用记录
    public class InstanceRecordInfo : TeaModel {
        // 应用标识
        [NameInMap("application")]
        [Validation(Required=false)]
        public string Application { get; set; }

        // 执行结果
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 操作时间
        [NameInMap("operating_time")]
        [Validation(Required=false)]
        public string OperatingTime { get; set; }

    }

}
