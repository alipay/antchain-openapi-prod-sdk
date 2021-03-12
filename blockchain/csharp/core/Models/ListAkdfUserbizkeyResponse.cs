// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListAkdfUserbizkeyResponse : TeaModel {
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

        // 区块链id
        [NameInMap("bizid")]
        [Validation(Required=false)]
        public string Bizid { get; set; }

        // 用户密钥信息
        [NameInMap("user_biz_key_info")]
        [Validation(Required=false)]
        public List<UserBizKeyInfo> UserBizKeyInfo { get; set; }

    }

}
