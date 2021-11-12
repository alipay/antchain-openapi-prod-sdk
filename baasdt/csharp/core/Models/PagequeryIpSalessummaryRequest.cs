// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class PagequeryIpSalessummaryRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequestInfo BaseRequest { get; set; }

        // 订单ID。订单ID和账单ID二选一传入。
        [NameInMap("ip_order_id")]
        [Validation(Required=false)]
        public string IpOrderId { get; set; }

        // 账单ID。订单ID和账单ID二选一传入。
        [NameInMap("ip_bill_id")]
        [Validation(Required=false)]
        public string IpBillId { get; set; }

        // 销售数据状态：1初始化，2商户确认，3版权方确认，4账单生成，5商户已校正，6版权方拒绝
        [NameInMap("status")]
        [Validation(Required=false)]
        public long? Status { get; set; }

        // 排序字段
        [NameInMap("order_by")]
        [Validation(Required=true)]
        public string OrderBy { get; set; }

        // 排序顺序：正序还是倒序
        [NameInMap("order")]
        [Validation(Required=true)]
        public string Order { get; set; }

        // 页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 每页数据量大小。不大于100。
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
