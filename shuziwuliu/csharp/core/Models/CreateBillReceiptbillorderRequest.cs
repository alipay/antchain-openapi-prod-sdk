// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateBillReceiptbillorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实际收款结算公司
        [NameInMap("actual_settle_company")]
        [Validation(Required=false)]
        public string ActualSettleCompany { get; set; }

        // 实际收款结算公司企业信用号
        [NameInMap("actual_settle_company_cert_no")]
        [Validation(Required=false)]
        public string ActualSettleCompanyCertNo { get; set; }

        // 实际收款结算公司did
        [NameInMap("actual_settle_company_did")]
        [Validation(Required=false)]
        public string ActualSettleCompanyDid { get; set; }

        // 确认时间  业务必填
        [NameInMap("apply_date")]
        [Validation(Required=false)]
        public long? ApplyDate { get; set; }

        // 揽货类型
        [NameInMap("client_type")]
        [Validation(Required=false)]
        public string ClientType { get; set; }

        // 币种 业务必填
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 开票抬头
        [NameInMap("invoice_title")]
        [Validation(Required=false)]
        public string InvoiceTitle { get; set; }

        // 含税价
        [NameInMap("price_including_tax")]
        [Validation(Required=false)]
        public string PriceIncludingTax { get; set; }

        // 收款账号
        [NameInMap("receipt_account")]
        [Validation(Required=false)]
        public string ReceiptAccount { get; set; }

        // 收款总额 业务必填
        [NameInMap("receipt_amount")]
        [Validation(Required=false)]
        public string ReceiptAmount { get; set; }

        // 收款账单编号
        [NameInMap("receipt_bill_order_code")]
        [Validation(Required=true)]
        public string ReceiptBillOrderCode { get; set; }

        // 应收资费项账单 业务必填
        [NameInMap("receipt_bill_tariff_params")]
        [Validation(Required=false)]
        public List<ReceiptBillTariffParam> ReceiptBillTariffParams { get; set; }

        // 结算客户名称
        [NameInMap("settle_client")]
        [Validation(Required=false)]
        public string SettleClient { get; set; }

        // 结算客户企业信用号
        [NameInMap("settle_client_cert_no")]
        [Validation(Required=false)]
        public string SettleClientCertNo { get; set; }

        // 结算客户名称did
        [NameInMap("settle_client_did")]
        [Validation(Required=false)]
        public string SettleClientDid { get; set; }

        // 结算公司
        [NameInMap("settle_company")]
        [Validation(Required=false)]
        public string SettleCompany { get; set; }

        // 结算公司企业信用号
        [NameInMap("settle_company_cert_no")]
        [Validation(Required=false)]
        public string SettleCompanyCertNo { get; set; }

        // 结算公司did
        [NameInMap("settle_company_did")]
        [Validation(Required=false)]
        public string SettleCompanyDid { get; set; }

        // 账单结算周期
        [NameInMap("settle_cycle")]
        [Validation(Required=false)]
        public string SettleCycle { get; set; }

        // 税金
        [NameInMap("taxes")]
        [Validation(Required=false)]
        public string Taxes { get; set; }

        // 未税价
        [NameInMap("untaxed_price")]
        [Validation(Required=false)]
        public string UntaxedPrice { get; set; }

    }

}
