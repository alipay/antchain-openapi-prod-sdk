// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryJointconstraintBreachrecordResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 是否存在履行记录
        // 
        // 
        [NameInMap("has_record")]
        [Validation(Required=false)]
        public bool? HasRecord { get; set; }

        // 违约次数
        // 
        // 
        [NameInMap("breach_count")]
        [Validation(Required=false)]
        public long? BreachCount { get; set; }

    }

}
