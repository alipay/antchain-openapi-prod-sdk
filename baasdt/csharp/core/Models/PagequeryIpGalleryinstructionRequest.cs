// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class PagequeryIpGalleryinstructionRequest : TeaModel {
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

        // 账户链上ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 授权订单ID
        [NameInMap("ip_order_id")]
        [Validation(Required=true)]
        public string IpOrderId { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 每页数据量大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 数据排序顺序：正序还是倒序。默认按照下载时间排序。
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

    }

}
