// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class StartAuthVcGiveResponse : TeaModel {
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

        // 入参返回
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 业务类型，入参返回
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 本次转增后新颁发的可验证声明的issuer
        [NameInMap("issuer_did")]
        [Validation(Required=false)]
        public string IssuerDid { get; set; }

        // 可验证声明的颁发状态说明： 0：未授权 1：授权成功，此时vc_content字段会包含授权后的声明内容，其它状态码，待定义后增加。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 本次转增的目标，也是新颁发的可验证声明的持有者owner的did
        [NameInMap("subject_did")]
        [Validation(Required=false)]
        public string SubjectDid { get; set; }

        // 可验证声明完整内容， status 为 “1” 时候非空
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

        // 可验证声明的id
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

    }

}
