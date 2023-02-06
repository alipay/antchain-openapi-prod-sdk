// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    public class QueryThreemetaSeconddistributeResponse : TeaModel {
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

        // YES：二次放号；NO：不是二次放号；CANCELLED：已销号
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

        // 扩展信息，Map的json格式。
        [NameInMap("extern_info")]
        [Validation(Required=false)]
        public string ExternInfo { get; set; }

    }

}
