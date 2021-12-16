// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 订单信息VO
    public class MainOrderVO : TeaModel {
        // order_no
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // buyer
        [NameInMap("buyer")]
        [Validation(Required=true)]
        public string Buyer { get; set; }

        // seller
        [NameInMap("seller")]
        [Validation(Required=true)]
        public string Seller { get; set; }

        // sp_id
        [NameInMap("sp_id")]
        [Validation(Required=true)]
        public string SpId { get; set; }

        // login_account
        [NameInMap("login_account")]
        [Validation(Required=true)]
        public string LoginAccount { get; set; }

        // product_name
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // money
        [NameInMap("money")]
        [Validation(Required=true)]
        public MultiCurrencyMoneyVO Money { get; set; }

        // gmt_create
        [NameInMap("gmt_create")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtCreate { get; set; }

        // gmt_modified
        [NameInMap("gmt_modified")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtModified { get; set; }

        // gmt_close
        [NameInMap("gmt_close")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtClose { get; set; }

        // gmt_pay_success
        [NameInMap("gmt_pay_success")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string GmtPaySuccess { get; set; }

        // order_status
        [NameInMap("order_status")]
        [Validation(Required=true)]
        public string OrderStatus { get; set; }

        // order_type
        [NameInMap("order_type")]
        [Validation(Required=true)]
        public string OrderType { get; set; }

        // order_origin
        [NameInMap("order_origin")]
        [Validation(Required=true)]
        public string OrderOrigin { get; set; }

        // order_level
        [NameInMap("order_level")]
        [Validation(Required=true)]
        public string OrderLevel { get; set; }

        // pay_method
        [NameInMap("pay_method")]
        [Validation(Required=true)]
        public string PayMethod { get; set; }

        // orde_duration
        [NameInMap("order_duration")]
        [Validation(Required=true)]
        public string OrderDuration { get; set; }

        // parent_order_no
        [NameInMap("parent_order_no")]
        [Validation(Required=true)]
        public string ParentOrderNo { get; set; }

        // commodity_name
        [NameInMap("commodity_name")]
        [Validation(Required=true)]
        public string CommodityName { get; set; }

        // spec_code
        [NameInMap("spec_code")]
        [Validation(Required=true)]
        public string SpecCode { get; set; }

        // spec_name
        [NameInMap("spec_name")]
        [Validation(Required=true)]
        public string SpecName { get; set; }

        // spec_desc
        [NameInMap("spec_desc")]
        [Validation(Required=true)]
        public string SpecDesc { get; set; }

        // order_detail
        [NameInMap("order_detail")]
        [Validation(Required=true)]
        public string OrderDetail { get; set; }

        // sub_order_include
        [NameInMap("sub_order_include")]
        [Validation(Required=true)]
        public bool? SubOrderInclude { get; set; }

        // spec_props
        [NameInMap("spec_props")]
        [Validation(Required=true)]
        public List<Pair> SpecProps { get; set; }

        // ext_params
        [NameInMap("ext_params")]
        [Validation(Required=true)]
        public List<Pair> ExtParams { get; set; }

    }

}
