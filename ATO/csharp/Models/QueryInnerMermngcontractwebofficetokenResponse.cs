// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class QueryInnerMermngcontractwebofficetokenResponse : TeaModel {
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

        // 访问token
        [NameInMap("access_token")]
        [Validation(Required=false)]
        public string AccessToken { get; set; }

        // 访问token过期时间
        [NameInMap("access_token_expired_time")]
        [Validation(Required=false)]
        public string AccessTokenExpiredTime { get; set; }

        // 刷新token
        [NameInMap("refresh_token")]
        [Validation(Required=false)]
        public string RefreshToken { get; set; }

        // 刷新token过期时间
        [NameInMap("refresh_token_expired_time")]
        [Validation(Required=false)]
        public string RefreshTokenExpiredTime { get; set; }

        // 编辑地址
        [NameInMap("weboffice_url")]
        [Validation(Required=false)]
        public string WebofficeUrl { get; set; }

    }

}
