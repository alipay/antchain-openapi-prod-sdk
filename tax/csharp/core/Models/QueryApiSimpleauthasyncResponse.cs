// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    public class QueryApiSimpleauthasyncResponse : TeaModel {
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

        // 成功
        [NameInMap("return_result")]
        [Validation(Required=false)]
        public string ReturnResult { get; set; }

        // false 有值
        // true  无值
        [NameInMap("null_data_flag")]
        [Validation(Required=false)]
        public string NullDataFlag { get; set; }

        // json格式，其他内容
        [NameInMap("biz_content")]
        [Validation(Required=false)]
        public string BizContent { get; set; }

    }

}
