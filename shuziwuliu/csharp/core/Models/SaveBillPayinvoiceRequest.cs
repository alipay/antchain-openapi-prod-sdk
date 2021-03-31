// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBillPayinvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 操作动作,为空为新增或更新，UPDATE为更新，DELETE为删除
        [NameInMap("action")]
        [Validation(Required=false)]
        public string Action { get; set; }

        // 总金额 业务必填
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 校验码后六位
        [NameInMap("check_code")]
        [Validation(Required=false)]
        public string CheckCode { get; set; }

        // 币种 CNY/USD [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 美元金额
        [NameInMap("dollar_amount")]
        [Validation(Required=false)]
        public string DollarAmount { get; set; }

        // 开票方名称  业务必填
        [NameInMap("drawer_name")]
        [Validation(Required=false)]
        public string DrawerName { get; set; }

        // 开票纳税人识别号 业务必填
        [NameInMap("drawer_taxpayer_code")]
        [Validation(Required=false)]
        public string DrawerTaxpayerCode { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 发票唯一标识
        [NameInMap("invoice_code")]
        [Validation(Required=true)]
        public string InvoiceCode { get; set; }

        // 发票抬头did[业务必填]
        [NameInMap("invoice_header_did")]
        [Validation(Required=false)]
        public string InvoiceHeaderDid { get; set; }

        // 发票抬头企业名称[业务必填]
        [NameInMap("invoice_header_name")]
        [Validation(Required=false)]
        public string InvoiceHeaderName { get; set; }

        // 发票抬头企业信用代码[业务必填]
        [NameInMap("invoice_header_social_no")]
        [Validation(Required=false)]
        public string InvoiceHeaderSocialNo { get; set; }

        // 发票号码 业务必填
        [NameInMap("invoice_number")]
        [Validation(Required=false)]
        public string InvoiceNumber { get; set; }

        // 发票税务号
        [NameInMap("invoice_tax_code")]
        [Validation(Required=false)]
        public string InvoiceTaxCode { get; set; }

        // 开票类型 业务必填
        [NameInMap("invoice_type")]
        [Validation(Required=false)]
        public string InvoiceType { get; set; }

        // 开票日期 业务必填
        [NameInMap("make_invoice_date")]
        [Validation(Required=false)]
        public long? MakeInvoiceDate { get; set; }

        // 账单关联项目
        [NameInMap("pay_bill_invoice_params")]
        [Validation(Required=false)]
        public List<PayBillInvoiceParam> PayBillInvoiceParams { get; set; }

        // 资费项发票 业务必填
        [NameInMap("pay_tariff_invoice_params")]
        [Validation(Required=false)]
        public List<PayTariffInvoiceParam> PayTariffInvoiceParams { get; set; }

        // 不含税金额 业务必填
        [NameInMap("untaxed_price")]
        [Validation(Required=false)]
        public string UntaxedPrice { get; set; }

    }

}
