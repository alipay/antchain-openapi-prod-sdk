// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateHighwayInvoiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 发票号码，8位发票号码
        [NameInMap("invoice_no")]
        [Validation(Required=true)]
        public string InvoiceNo { get; set; }

        // 发票代码，10位或者12位发票代码
        [NameInMap("invoice_code")]
        [Validation(Required=true)]
        public string InvoiceCode { get; set; }

        // 发票校验码后6位
        [NameInMap("verify_code")]
        [Validation(Required=false)]
        public string VerifyCode { get; set; }

        // 收款方did，出票方，需要出票收钱的
        [NameInMap("payee_did")]
        [Validation(Required=true)]
        public string PayeeDid { get; set; }

        // 付款方did，收票方，需要收票付钱的
        [NameInMap("payer_did")]
        [Validation(Required=true)]
        public string PayerDid { get; set; }

        // 发票含税金额， 不超过2位小数的数字
        [NameInMap("invoice_contains_tax")]
        [Validation(Required=true)]
        public string InvoiceContainsTax { get; set; }

        // 发票不含税金额，不超过2位小数的数字
        [NameInMap("invoice_without_tax")]
        [Validation(Required=true)]
        public string InvoiceWithoutTax { get; set; }

        // 开票日期，格式为yyyy-mm-dd
        [NameInMap("invoice_date")]
        [Validation(Required=true)]
        public string InvoiceDate { get; set; }

        // 发票类型，以下二选一填写：应收发票、应付发票
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 影像件ID，发票上传蚂蚁oss的文件ID。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // 影像件hash，上传蚂蚁oss的文件hash。注意：影像件id和影像件hash，必须都填写或都不填，不可只填其中一项
        [NameInMap("file_hash")]
        [Validation(Required=false)]
        public string FileHash { get; set; }

        // 发票归属平台did，用以区分是哪家平台/企业的发票
        [NameInMap("platform_did")]
        [Validation(Required=true)]
        public string PlatformDid { get; set; }

        // 发票种类，以下四选一填写（可填VAT_SPECIAL_INVOICE、VAT_NORMAL_INVOICE、VAT_ROLL_INVOICE、ELECTRONIC_INVOICE）。注：以上分别表示增值税专票、增值税普票、增值税卷票、电子发票
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
