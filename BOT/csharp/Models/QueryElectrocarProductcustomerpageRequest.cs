// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryElectrocarProductcustomerpageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=true)]
        public long? Current { get; set; }

        // 每页显示条数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 产品key
        [NameInMap("product_key")]
        [Validation(Required=false)]
        public string ProductKey { get; set; }

        // 行业id
        [NameInMap("industry_id")]
        [Validation(Required=false)]
        public string IndustryId { get; set; }

        // 品类id
        [NameInMap("category_id")]
        [Validation(Required=false)]
        public string CategoryId { get; set; }

        // 联网方式：0-WIFI、1-蜂窝、2-以太网、3-蓝牙、4-蓝牙+蜂窝网络
        [NameInMap("net_type")]
        [Validation(Required=false)]
        public long? NetType { get; set; }

        // 客户id
        [NameInMap("customer_id")]
        [Validation(Required=true)]
        public string CustomerId { get; set; }

    }

}
