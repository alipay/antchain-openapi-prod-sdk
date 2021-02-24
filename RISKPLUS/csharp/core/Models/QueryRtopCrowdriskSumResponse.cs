// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCrowdriskSumResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 查询企业的影响金额之和
        [NameInMap("money_involved")]
        [Validation(Required=false)]
        public long? MoneyInvolved { get; set; }

        // 查询企业的影响人数之和
        [NameInMap("people_involved")]
        [Validation(Required=false)]
        public long? PeopleInvolved { get; set; }

    }

}
