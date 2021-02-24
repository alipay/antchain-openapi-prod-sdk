// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyRiskyResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 返回码
        [NameInMap("response_code")]
        [Validation(Required=false)]
        public string ResponseCode { get; set; }

        // 全局动态中的企业列表
        [NameInMap("risky_companies")]
        [Validation(Required=false)]
        public List<RtopRiskyCompany> RiskyCompanies { get; set; }

        // 是否调用成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // 总条数
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public long? TotalNum { get; set; }

    }

}
