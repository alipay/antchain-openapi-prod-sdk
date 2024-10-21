// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class DeleteDistributorSubuserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 二级用户账号
        [NameInMap("sub_user_account_id")]
        [Validation(Required=true)]
        public string SubUserAccountId { get; set; }

        // 用户id
        [NameInMap("sub_user_id")]
        [Validation(Required=false)]
        public string SubUserId { get; set; }

        // 二级用户钱包地址
        [NameInMap("sub_user_address")]
        [Validation(Required=false)]
        public string SubUserAddress { get; set; }

    }

}
