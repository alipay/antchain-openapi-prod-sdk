// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveBiznewInvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 货代did
        [NameInMap("forwarder_did")]
        [Validation(Required=true)]
        public string ForwarderDid { get; set; }

        // 发票唯一标识
        [NameInMap("invoice_code")]
        [Validation(Required=true)]
        public string InvoiceCode { get; set; }

        // 发票税务号 [业务必填]
        [NameInMap("invoice_tax_code")]
        [Validation(Required=false)]
        public string InvoiceTaxCode { get; set; }

        // 发票号 [业务必填]
        [NameInMap("invoice_number")]
        [Validation(Required=false)]
        public string InvoiceNumber { get; set; }

        // 发票类型 [业务必填]
        [NameInMap("invoice_type")]
        [Validation(Required=false)]
        public string InvoiceType { get; set; }

        // 开票类型 pay/receipt (应付/应收) [业务必填]
        // 
        // 
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 校验码
        // 
        // 
        [NameInMap("check_code")]
        [Validation(Required=false)]
        public string CheckCode { get; set; }

        // 开票方名称 [业务必填]
        // 
        // 
        [NameInMap("drawer_name")]
        [Validation(Required=false)]
        public string DrawerName { get; set; }

        // 开票纳税人识别号 [业务必填]
        // 
        // 
        [NameInMap("drawer_taxpayer_code")]
        [Validation(Required=false)]
        public string DrawerTaxpayerCode { get; set; }

        // 受票方企业名称 [业务必填]
        // 
        // 
        [NameInMap("invoice_header_name")]
        [Validation(Required=false)]
        public string InvoiceHeaderName { get; set; }

        // 受票方企业信用证代码 [业务必填]
        // 
        // 
        [NameInMap("invoice_header_social_no")]
        [Validation(Required=false)]
        public string InvoiceHeaderSocialNo { get; set; }

        // 开票时间 [业务必填]
        // 
        // 
        [NameInMap("make_invoice_date")]
        [Validation(Required=false)]
        public long? MakeInvoiceDate { get; set; }

        // 发票金额 [业务必填]
        // 
        // 
        [NameInMap("amount")]
        [Validation(Required=false)]
        public string Amount { get; set; }

        // 币种 [业务必填]
        [NameInMap("currency")]
        [Validation(Required=false)]
        public string Currency { get; set; }

        // 美元 
        [NameInMap("dollar_amount")]
        [Validation(Required=false)]
        public string DollarAmount { get; set; }

        // 不含税金额 [业务必填]
        [NameInMap("untaxed_price")]
        [Validation(Required=false)]
        public string UntaxedPrice { get; set; }

        // 发票文件ID [业务必填]
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 发票文件hash [业务必填]
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

    }

}
