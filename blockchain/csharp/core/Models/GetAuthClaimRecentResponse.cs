// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class GetAuthClaimRecentResponse : TeaModel {
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

        // 声明的 id，status 为 “1” 时候非空
        [NameInMap("vc_id")]
        [Validation(Required=false)]
        public string VcId { get; set; }

        // 可验证声明完成内容， status 为 “1” 时候非空
        [NameInMap("vc_content")]
        [Validation(Required=false)]
        public string VcContent { get; set; }

        // 业务类型
        [NameInMap("biz_type")]
        [Validation(Required=false)]
        public string BizType { get; set; }

        // vc状态 0:未授权 1:已授权 2: 拒绝授权 3: 授权已撤销
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 授权是否可撤销
        [NameInMap("revocable")]
        [Validation(Required=false)]
        public bool? Revocable { get; set; }

        // 过期时间
        [NameInMap("expire")]
        [Validation(Required=false)]
        public long? Expire { get; set; }

    }

}
