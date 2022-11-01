// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryLeaseAsyncencryptedinfoResponse : TeaModel {
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

        // 结果码，OK表示成功
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 结果描述
        [NameInMap("message")]
        [Validation(Required=false)]
        public string Message { get; set; }

        // 对应的加密后的具体信息（只有当query_status状态为SUCCESS时才返回此数据）
        [NameInMap("response_data")]
        [Validation(Required=false)]
        public string ResponseData { get; set; }

        // 链上查询状态枚举
        // TOBE_CHAIN 待上链查询
        // CHAINING 查询中
        // SUCCESS 查询成功
        // FAIL 查询失败
        [NameInMap("query_status")]
        [Validation(Required=false)]
        public string QueryStatus { get; set; }

    }

}
