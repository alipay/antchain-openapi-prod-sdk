// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreatePlatformDepositCorpdidResponse : TeaModel {
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

        // 企业did
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // 调用者金融科技id
        [NameInMap("isv_account")]
        [Validation(Required=false)]
        public string IsvAccount { get; set; }

        // 是否调用成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
