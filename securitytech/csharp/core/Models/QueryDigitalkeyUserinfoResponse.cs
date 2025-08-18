// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryDigitalkeyUserinfoResponse : TeaModel {
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

        // 用户ID
        [NameInMap("uid")]
        [Validation(Required=false)]
        public string Uid { get; set; }

        // 个人简介
        [NameInMap("introduction")]
        [Validation(Required=false)]
        public string Introduction { get; set; }

        // 用户昵称
        [NameInMap("nick_name")]
        [Validation(Required=false)]
        public string NickName { get; set; }

        // 用户头像地址
        [NameInMap("avatar_url")]
        [Validation(Required=false)]
        public string AvatarUrl { get; set; }

        // 品牌ID
        [NameInMap("brand_id")]
        [Validation(Required=false)]
        public string BrandId { get; set; }

    }

}
