// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    public class PagequeryIssuerKeyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当前页码(默认为第一页)
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 页面显示条数(默认10，最小为5)
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 排序字段
        [NameInMap("sort_field")]
        [Validation(Required=false)]
        public string SortField { get; set; }

        // 密钥名称
        [NameInMap("key_name")]
        [Validation(Required=false)]
        public string KeyName { get; set; }

    }

}
