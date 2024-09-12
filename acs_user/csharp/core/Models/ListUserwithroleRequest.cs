// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACS_USER.Models
{
    public class ListUserwithroleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品CODE
        [NameInMap("prod_code")]
        [Validation(Required=false)]
        public string ProdCode { get; set; }

        // 产品内的角色信息
        [NameInMap("product_role")]
        [Validation(Required=false)]
        public string ProductRole { get; set; }

        // 分页开始序号，默认第一个开始
        [NameInMap("current_page")]
        [Validation(Required=false)]
        public long? CurrentPage { get; set; }

        // 分页大小，未传默认是100
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
