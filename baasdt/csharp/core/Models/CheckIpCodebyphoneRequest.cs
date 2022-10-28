// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class CheckIpCodebyphoneRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 支持数字凭证的加密编码及UNI序列号
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 核验用户的手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

        // 核验用户的名称
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 外部客户自定义客户ID
        [NameInMap("external_user_id")]
        [Validation(Required=false)]
        public string ExternalUserId { get; set; }

        // 核验用户的位置信息
        [NameInMap("gps")]
        [Validation(Required=false)]
        public string Gps { get; set; }

        // 核验用户头像地址
        [NameInMap("avatar")]
        [Validation(Required=false)]
        public string Avatar { get; set; }

    }

}
