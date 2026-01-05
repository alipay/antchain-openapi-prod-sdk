// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTTS.Models
{
    public class OpenActivateRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 地址
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // 外部客户id
        [NameInMap("external_customer_id")]
        [Validation(Required=true)]
        public string ExternalCustomerId { get; set; }

        // 客户性别
        [NameInMap("sex")]
        [Validation(Required=true)]
        public string Sex { get; set; }

        // 用户名
        [NameInMap("username")]
        [Validation(Required=true)]
        public string Username { get; set; }

        // 出生日期
        [NameInMap("birth_date")]
        [Validation(Required=true)]
        public long? BirthDate { get; set; }

    }

}
