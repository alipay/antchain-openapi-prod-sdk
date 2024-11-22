// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CreateInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商户的订单号，后续用作和保单结果交互
        [NameInMap("order_id")]
        [Validation(Required=true)]
        public string OrderId { get; set; }

        // 风控业务流水号
        [NameInMap("risk_flow_id")]
        [Validation(Required=true)]
        public string RiskFlowId { get; set; }

        // 保险公司枚举，PA：平安保险
        [NameInMap("insure_company_type")]
        [Validation(Required=true)]
        public string InsureCompanyType { get; set; }

        // 保险类型枚举，PERFORMANCE：履约
        [NameInMap("insure_product_type")]
        [Validation(Required=true)]
        public string InsureProductType { get; set; }

        // 投保商品信息列表
        [NameInMap("product_info_list")]
        [Validation(Required=true)]
        public List<InsureProductInfo> ProductInfoList { get; set; }

        // 发货方式枚举，可选值：
        // EXPRESS-物流发货
        // OFFLINE-线下交易
        [NameInMap("delivery_type")]
        [Validation(Required=true, MaxLength=64)]
        public string DeliveryType { get; set; }

        // 公司联系人姓名，RSA 加密传输
        [NameInMap("contact_name")]
        [Validation(Required=true, MaxLength=2000)]
        public string ContactName { get; set; }

        // 公司联系人手机号，RSA 加密传输
        [NameInMap("contact_mobile")]
        [Validation(Required=true, MaxLength=2000)]
        public string ContactMobile { get; set; }

        // 实人认证业务流水号
        [NameInMap("facevrf_flow_id")]
        [Validation(Required=false)]
        public string FacevrfFlowId { get; set; }

        // 物流单号，非必填参数。如果选择的物流发货方式为 EXPRESS（物流发货），则该字段必填。
        [NameInMap("logistics_number")]
        [Validation(Required=false, MaxLength=64)]
        public string LogisticsNumber { get; set; }

        // 交易时间，非必填参数。如果发货方式为 OFFLINE（线下交易），则该字段必填。
        [NameInMap("trade_time")]
        [Validation(Required=false)]
        public string TradeTime { get; set; }

    }

}
