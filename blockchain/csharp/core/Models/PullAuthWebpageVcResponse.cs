// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class PullAuthWebpageVcResponse : TeaModel {
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

        // C类用户实际授权发生的时间，GMT标准时间
        [NameInMap("gmt_auth_time")]
        [Validation(Required=false)]
        public long? GmtAuthTime { get; set; }

        // 企业B类的唯一ID，对应的did在vc_content中的subject字段
        [NameInMap("pk_id")]
        [Validation(Required=false)]
        public string PkId { get; set; }

        // 当前声明的状态说明： 0：用户未授权 1：用户授权成功，此时vc_content字段会包含授权后的声明内容 ，101：信息校验失败，其他授权错误码情况待明确
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 授权的可验证声明具体类型说明，有助于未来业务区分不同授权场景。
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // C类用户的唯一ID，当前为通过姓名+身份证号组合计算哈希得到user_id = sha256(name+certNo)，对应的did在vc_content中的issuer字段
        [NameInMap("user_id")]
        [Validation(Required=false)]
        public string UserId { get; set; }

        // 如果status的值是“1”，则此字段就是用户授权成功后的声明（vc）的完整内容。
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

    }

}
