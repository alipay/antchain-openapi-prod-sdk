// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryNotaryOpenapiMerchantResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 查询的biz_no
        [NameInMap("biz_no")]
        [Validation(Required=false)]
        public string BizNo { get; set; }

        // 认证状态：认证是否通过。通过为true，不通过为false
        [NameInMap("passed")]
        [Validation(Required=false)]
        public bool? Passed { get; set; }

    }

}
