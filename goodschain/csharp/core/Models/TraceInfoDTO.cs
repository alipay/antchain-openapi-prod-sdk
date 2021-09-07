// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.GOODSCHAIN.Models
{
    // 溯源信息
    public class TraceInfoDTO : TeaModel {
        // 操作描述
        [NameInMap("operate_type_desc")]
        [Validation(Required=true)]
        public string OperateTypeDesc { get; set; }

        // 操作时间，时间戳
        [NameInMap("operate_time")]
        [Validation(Required=true)]
        public long? OperateTime { get; set; }

        // 操作人id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

        // 操作人名称
        [NameInMap("operator_name")]
        [Validation(Required=true)]
        public string OperatorName { get; set; }

        // 操作内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
