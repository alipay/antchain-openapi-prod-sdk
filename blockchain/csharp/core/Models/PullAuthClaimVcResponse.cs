// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PullAuthClaimVcResponse : TeaModel {
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

        // 长度不超过64字符的业务唯一ID，用于对一个业务流的追踪，与请求中的biz_id一致方便业务方使用。
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 具体的业务类型，长度不超过32字符，具体需要对接确定新增的业务类型。
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // 当前声明的状态说明：
        // 0：用户未授权
        // 1：用户授权成功，此时vc_content字段会包含授权后的声明内容
        // 101：业务方发起声明claim_content中的用户三要素（姓名，电话，身份证号），与目标用户真实的三要素匹配失败
        // 
        // 其它状态码，待定义后增加。
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 申请授权的用户did
        [NameInMap("user_did")]
        [Validation(Required=false)]
        public string UserDid { get; set; }

        // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

    }

}
