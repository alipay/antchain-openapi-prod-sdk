// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcBatchauthResponse : TeaModel {
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

        // 输入参数的bizId返回
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 具体业务的类型说明，来自入参。
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 本次可验证声明颁发者的DID
        [NameInMap("issuer_did")]
        [Validation(Required=false)]
        public string IssuerDid { get; set; }

        // 颁发的多个可验证声明结果列表。
        [NameInMap("vc_list")]
        [Validation(Required=false)]
        public List<VcContent> VcList { get; set; }

    }

}
