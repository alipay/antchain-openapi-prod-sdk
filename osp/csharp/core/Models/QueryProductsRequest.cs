// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class QueryProductsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 产品名称, 选填, 如果指定了产品名称就只返回指定产品的信息
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 当前页码，默认为1
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public int? PageNum { get; set; }

        // 分页大小，默认10
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public int? PageSize { get; set; }

    }

}
