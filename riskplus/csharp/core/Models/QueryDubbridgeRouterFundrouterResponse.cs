// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRouterFundrouterResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 资金方代码
        [NameInMap("fund_code")]
        [Validation(Required=false)]
        public string FundCode { get; set; }

        // 资金方简称
        [NameInMap("abbre_fund_name")]
        [Validation(Required=false)]
        public string AbbreFundName { get; set; }

        // 客户编号
        [NameInMap("customer_no")]
        [Validation(Required=false)]
        public string CustomerNo { get; set; }

    }

}
