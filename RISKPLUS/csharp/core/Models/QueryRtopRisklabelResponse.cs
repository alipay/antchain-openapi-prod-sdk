// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopRisklabelResponse : TeaModel {
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

        // 标签信息
        [NameInMap("risk_label_infos")]
        [Validation(Required=false)]
        public List<RiskLabelInfo> RiskLabelInfos { get; set; }

        // scroll_id
        [NameInMap("scroll_id")]
        [Validation(Required=false)]
        public string ScrollId { get; set; }

        // 是否调用成功
        [NameInMap("success")]
        [Validation(Required=false)]
        public bool? Success { get; set; }

        // total
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

    }

}
