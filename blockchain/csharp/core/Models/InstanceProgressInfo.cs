// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 实例进度信息
    public class InstanceProgressInfo : TeaModel {
        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 操作时间
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

        // 合约部署进度类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 部署状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 合约部署进度名称
        [NameInMap("type_name")]
        [Validation(Required=false)]
        public string TypeName { get; set; }

        // 额外参数
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

    }

}
