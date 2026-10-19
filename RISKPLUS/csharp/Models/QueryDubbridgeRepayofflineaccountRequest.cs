// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeRepayofflineaccountRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求唯一id
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 关联的天枢用信申请订单号
        [NameInMap("use_credit_order_no")]
        [Validation(Required=true)]
        public string UseCreditOrderNo { get; set; }

        // 开始日期
        [NameInMap("start_date")]
        [Validation(Required=true)]
        public string StartDate { get; set; }

        // 结束日期
        [NameInMap("end_date")]
        [Validation(Required=true)]
        public string EndDate { get; set; }

        // 账号
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 借贷标识:D-借,C-贷
        [NameInMap("dc_flag")]
        [Validation(Required=false)]
        public string DcFlag { get; set; }

        // 当前页码
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public string CurrentPage { get; set; }

        // 每页记录数
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public string PageNum { get; set; }

    }

}
