// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessDidResponse : TeaModel {
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

        // 链的业务编号
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 生成的did用户身份号
        [NameInMap("did")]
        [Validation(Required=false)]
        public string Did { get; set; }

        // isv创建者身份
        [NameInMap("isv_account")]
        [Validation(Required=false)]
        public string IsvAccount { get; set; }

        // 是否创建成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
