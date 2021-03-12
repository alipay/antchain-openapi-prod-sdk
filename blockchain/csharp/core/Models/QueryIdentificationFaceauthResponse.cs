// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class QueryIdentificationFaceauthResponse : TeaModel {
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

        // 认证ID
        [NameInMap("certify_id")]
        [Validation(Required=false)]
        public string CertifyId { get; set; }

        // 认证状态，枚举值如下：
        // 值为1，认证初始化成功
        // 值为2，认证链接获取成功
        // 值为3，认证通过
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

    }

}
