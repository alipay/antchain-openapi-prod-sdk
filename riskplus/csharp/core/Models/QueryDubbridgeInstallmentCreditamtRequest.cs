// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeInstallmentCreditamtRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单号：request请求单号，每次请求唯一，如uuid
        [NameInMap("order_no")]
        [Validation(Required=true)]
        public string OrderNo { get; set; }

        // 1：现金贷、2：分期付
        [NameInMap("prod_type")]
        [Validation(Required=true)]
        public string ProdType { get; set; }

        // 资产方用户唯一标识
        [NameInMap("open_id")]
        [Validation(Required=true)]
        public string OpenId { get; set; }

        // 手机号
        [NameInMap("mobile")]
        [Validation(Required=true)]
        public string Mobile { get; set; }

        // 项目编号
        [NameInMap("project_code")]
        [Validation(Required=true)]
        public string ProjectCode { get; set; }

        // 交易金额，单位：元，如199.88（用于筛选额度充足的机构）
        [NameInMap("trade_amount")]
        [Validation(Required=true)]
        public string TradeAmount { get; set; }

        // 身份证号
        [NameInMap("card_no")]
        [Validation(Required=false)]
        public string CardNo { get; set; }

        // 客户姓名
        [NameInMap("customer_name")]
        [Validation(Required=false)]
        public string CustomerName { get; set; }

    }

}
