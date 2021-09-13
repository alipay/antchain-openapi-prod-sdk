// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    public class QueryComboOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID，租户ID和租户名称二选一必填
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // 租户名称，租户ID和租户名称二选一必填
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 订单状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 套餐编码
        [NameInMap("combo_code")]
        [Validation(Required=false)]
        public string ComboCode { get; set; }

        // 下单开始时间
        [NameInMap("begin_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string BeginTime { get; set; }

        // 下单结束时间
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

        // 每页数量，不传默认20
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 当前页数，不传则默认1
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

    }

}
