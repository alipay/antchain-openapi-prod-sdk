// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateBusinessContractGrantcorpResponse : TeaModel {
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

        // 授权的字段列表
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<string> Data { get; set; }

        // 是否授权给组织成功，0表示成功
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
