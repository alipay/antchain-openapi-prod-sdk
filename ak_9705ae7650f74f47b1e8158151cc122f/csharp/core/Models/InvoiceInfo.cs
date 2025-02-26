// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    // 发票信息
    public class InvoiceInfo : TeaModel {
        // 发票类型 InvoiceTypeEnum目前只支持普票
        // (NORMAL,ELC,普票)
        // (SPECIAL,VAT,专票)
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票抬头（著作权人之一）
        [NameInMap("invoice_header")]
        [Validation(Required=true)]
        public string InvoiceHeader { get; set; }

        // 纳税人识别号（机构必填）
        [NameInMap("taxpayer_number")]
        [Validation(Required=false)]
        public string TaxpayerNumber { get; set; }

        // 注册地址（专票必填）
        [NameInMap("registered_address")]
        [Validation(Required=false)]
        public string RegisteredAddress { get; set; }

        // 注册电话（专票必填）
        [NameInMap("registered_tel")]
        [Validation(Required=false)]
        public string RegisteredTel { get; set; }

        // 开户电话（专票必填）
        [NameInMap("open_account_tel")]
        [Validation(Required=false)]
        public string OpenAccountTel { get; set; }

        // 开户银行（专票必填）
        [NameInMap("open_account_bank")]
        [Validation(Required=false)]
        public string OpenAccountBank { get; set; }

        // 银行账号（专票必填）
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

    }

}
