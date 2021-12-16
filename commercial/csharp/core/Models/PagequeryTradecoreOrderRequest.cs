// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    public class PagequeryTradecoreOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 取值范围：NEW
        [NameInMap("order_type")]
        [Validation(Required=false)]
        public string OrderType { get; set; }

        // 取值范围：INIT、PAY_SUCCESS、CLOSED
        [NameInMap("order_status")]
        [Validation(Required=false)]
        public string OrderStatus { get; set; }

        // 取值范围：GMT_CREATE（订单创建时间）、GMT_PAY_SUCCESS（订单支付成功时间）
        [NameInMap("sort_column")]
        [Validation(Required=false)]
        public string SortColumn { get; set; }

        // 取值范围：ASC（升序）、DESC（降序）
        [NameInMap("sort_type")]
        [Validation(Required=false)]
        public string SortType { get; set; }

        // page_num
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // page_size
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
