// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 发票信息
    public class InvoiceInfo : TeaModel {
        // 发票类型 InvoiceTypeEnum目前只支持普票
        // (NORMAL,ELC,普票)
        // (SPECIAL,VAT,专票)
        /// <summary>
        /// <b>Example:</b>
        /// <para>NORMAL</para>
        /// </summary>
        [NameInMap("invoice_type")]
        [Validation(Required=true)]
        public string InvoiceType { get; set; }

        // 发票抬头（著作权人之一）
        /// <summary>
        /// <b>Example:</b>
        /// <para>000</para>
        /// </summary>
        [NameInMap("invoice_header")]
        [Validation(Required=true)]
        public string InvoiceHeader { get; set; }

        // 纳税人识别号（机构必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>纳税人识别号</para>
        /// </summary>
        [NameInMap("taxpayer_number")]
        [Validation(Required=false)]
        public string TaxpayerNumber { get; set; }

        // 注册地址（专票必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>注册地址</para>
        /// </summary>
        [NameInMap("registered_address")]
        [Validation(Required=false)]
        public string RegisteredAddress { get; set; }

        // 注册电话（专票必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>注册电话</para>
        /// </summary>
        [NameInMap("registered_tel")]
        [Validation(Required=false)]
        public string RegisteredTel { get; set; }

        // 开户电话（专票必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户电话</para>
        /// </summary>
        [NameInMap("open_account_tel")]
        [Validation(Required=false)]
        public string OpenAccountTel { get; set; }

        // 开户银行（专票必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>开户银行</para>
        /// </summary>
        [NameInMap("open_account_bank")]
        [Validation(Required=false)]
        public string OpenAccountBank { get; set; }

        // 银行账号（专票必填）
        /// <summary>
        /// <b>Example:</b>
        /// <para>银行账号</para>
        /// </summary>
        [NameInMap("bank_account")]
        [Validation(Required=false)]
        public string BankAccount { get; set; }

    }

}
