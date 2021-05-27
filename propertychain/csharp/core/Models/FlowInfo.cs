// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 流程信息
    public class FlowInfo : TeaModel {
        // 备注
        [NameInMap("comment")]
        [Validation(Required=false)]
        public string Comment { get; set; }

        // 操作时间
        [NameInMap("operate_time")]
        [Validation(Required=false)]
        public string OperateTime { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 操作状态【NONE,WAITING,AGREED,REJECTED,CANCELED,ALL】
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
