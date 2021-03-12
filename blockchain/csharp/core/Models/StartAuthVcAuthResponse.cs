// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcAuthResponse : TeaModel {
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

        // 可验证声明的颁发状态说明： 0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 本次可验证声明目标者的DID
        [NameInMap("subject_did")]
        [Validation(Required=false)]
        public string SubjectDid { get; set; }

        // 可验证声明完整内容， status 为 “1” 时候非空
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

        // 可验证声明的唯一标识id，status 为 “1” 时候非空
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

    }

}
