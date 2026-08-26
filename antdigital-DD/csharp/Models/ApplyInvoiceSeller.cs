// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 销方信息
    public class ApplyInvoiceSeller : TeaModel {
        // 地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>上海市黄浦区</para>
        /// </summary>
        [NameInMap("seller_address")]
        [Validation(Required=false)]
        public string SellerAddress { get; set; }

        // 银行账号
        /// <summary>
        /// <b>Example:</b>
        /// <para>323422244555</para>
        /// </summary>
        [NameInMap("seller_bank_account")]
        [Validation(Required=true)]
        public string SellerBankAccount { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商很行</para>
        /// </summary>
        [NameInMap("seller_bank_name")]
        [Validation(Required=true)]
        public string SellerBankName { get; set; }

        // 公司名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>蚂蚁区块链</para>
        /// </summary>
        [NameInMap("seller_company_name")]
        [Validation(Required=true)]
        public string SellerCompanyName { get; set; }

        // 税号
        /// <summary>
        /// <b>Example:</b>
        /// <para>33453344556</para>
        /// </summary>
        [NameInMap("seller_tax_no")]
        [Validation(Required=true)]
        public string SellerTaxNo { get; set; }

        // 电话
        /// <summary>
        /// <b>Example:</b>
        /// <para>0571-978655</para>
        /// </summary>
        [NameInMap("seller_telephone")]
        [Validation(Required=true)]
        public string SellerTelephone { get; set; }

        // 销方机构id
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZL6</para>
        /// </summary>
        [NameInMap("seller_inst_id")]
        [Validation(Required=true)]
        public string SellerInstId { get; set; }

    }

}
