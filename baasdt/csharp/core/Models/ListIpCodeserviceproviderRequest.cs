// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ListIpCodeserviceproviderRequest : TeaModel {
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

        // 用户的手机号
        [NameInMap("phone_number")]
        [Validation(Required=true)]
        public string PhoneNumber { get; set; }

    }

}
