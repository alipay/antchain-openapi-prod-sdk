// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class GetEcarPlaformauthtokenResponse : TeaModel {
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

        // 三方平台客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 碳账户编号，碳矩阵为客户分配的碳账户编号
        [NameInMap("carbon_account_no")]
        [Validation(Required=false)]
        public string CarbonAccountNo { get; set; }

        // 授权三方平台客户信登的TOKEN
        [NameInMap("access_token")]
        [Validation(Required=false)]
        public string AccessToken { get; set; }

    }

}
