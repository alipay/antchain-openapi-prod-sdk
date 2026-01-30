// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YDINDUSTRY.Models
{
    public class QueryRetailScoreResponse : TeaModel {
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

        // 行业分数
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

        // 流水号
        [NameInMap("trans_no")]
        [Validation(Required=false)]
        public string TransNo { get; set; }

        // 返回行业分其他数据，里面是key-value形式，标识返回的额外参数数据
        [NameInMap("ext_param")]
        [Validation(Required=false)]
        public string ExtParam { get; set; }

    }

}
