// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class QueryCreditCreditamountResponse : TeaModel {
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

        // 可用额度
        [NameInMap("credit_amount")]
        [Validation(Required=false)]
        public string CreditAmount { get; set; }

        // 集团平台did
        [NameInMap("group_platform_did")]
        [Validation(Required=false)]
        public string GroupPlatformDid { get; set; }

        // 平台did
        [NameInMap("platform_did")]
        [Validation(Required=false)]
        public string PlatformDid { get; set; }

        // 产品ID
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

    }

}
