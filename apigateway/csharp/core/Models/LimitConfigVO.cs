// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // LimitConfigVO
    public class LimitConfigVO : TeaModel {
        // 是否需要限制
        [NameInMap("need_limit")]
        [Validation(Required=false)]
        public bool? NeedLimit { get; set; }

        // 限制阈值
        [NameInMap("limit")]
        [Validation(Required=false)]
        public long? Limit { get; set; }

        // 限制响应类型
        [NameInMap("limit_rsp_type")]
        [Validation(Required=false)]
        public string LimitRspType { get; set; }

        // 响应信息
        [NameInMap("rsp_msg")]
        [Validation(Required=false)]
        public string RspMsg { get; set; }

    }

}
