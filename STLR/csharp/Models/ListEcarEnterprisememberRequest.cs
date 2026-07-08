// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ListEcarEnterprisememberRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 会员注册开始时间
        [NameInMap("register_start_time")]
        [Validation(Required=false)]
        public string RegisterStartTime { get; set; }

        // 会员注册结束时间
        [NameInMap("register_end_time")]
        [Validation(Required=false)]
        public string RegisterEndTime { get; set; }

        // 当前查询页码，默认值为1
        [NameInMap("current")]
        [Validation(Required=false)]
        public long? Current { get; set; }

        // 每页记录条数，默认为20，取值范围为[10,200]
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
