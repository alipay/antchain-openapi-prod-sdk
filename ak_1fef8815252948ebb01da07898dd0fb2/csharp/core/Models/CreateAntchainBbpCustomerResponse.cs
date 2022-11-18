// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_1fef8815252948ebb01da07898dd0fb2.Models
{
    public class CreateAntchainBbpCustomerResponse : TeaModel {
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

        // 统一客户ID
        [NameInMap("customer_id")]
        [Validation(Required=false)]
        public string CustomerId { get; set; }

        // 统一账户ID
        [NameInMap("acc_id")]
        [Validation(Required=false)]
        public string AccId { get; set; }

        // 客户认证结果
        [NameInMap("auth_four_elements_response")]
        [Validation(Required=false)]
        public CustomerAuthResult AuthFourElementsResponse { get; set; }

    }

}
