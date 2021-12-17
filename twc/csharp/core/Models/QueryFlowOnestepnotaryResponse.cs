// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryFlowOnestepnotaryResponse : TeaModel {
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

        // 存证全流程状态，FINISH(完结)、PROCESSING(上链中)、DISABLE(失效)、FAILED(失败)
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 阶段存证查询结果列表
        [NameInMap("phase_query_result_list")]
        [Validation(Required=false)]
        public List<PhaseQueryResult> PhaseQueryResultList { get; set; }

    }

}
