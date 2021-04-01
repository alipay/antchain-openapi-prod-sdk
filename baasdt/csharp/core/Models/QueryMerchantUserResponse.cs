// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryMerchantUserResponse : TeaModel {
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

        // 用户完整信息
        // {
        //             "tenant_id": "ZKUA",
        //             "user_id": "331f9b0922f940f464d4b94b5628180408ac305b7fc72d3e40f5b7727d0702fb",
        //             "local_id": "user01",
        //             "did": "",
        //             "vc": "",
        //             "pk": "3280b948a7fa8525c0fbfd47d1df75d7a7ee9f3baedd6964565b42f461dd86732717c4bc4c8203ea2b9b1aeef7b148644babba3c0cd6927c4c0964919f590c6c"
        //         }
        // 
        [NameInMap("user")]
        [Validation(Required=false)]
        public User User { get; set; }

    }

}
