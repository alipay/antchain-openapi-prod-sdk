// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 资源包余量结构体
    public class RespackegeBanlanceVO : TeaModel {
        // 资源包商品编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZLPTFM01221964</para>
        /// </summary>
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 资源包模板编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>ZNHYFM01222350_Deadline</para>
        /// </summary>
        [NameInMap("tempalte_name")]
        [Validation(Required=true)]
        public string TempalteName { get; set; }

        // 资源包展示名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>credits资源包(加油包)</para>
        /// </summary>
        [NameInMap("display_name")]
        [Validation(Required=true)]
        public string DisplayName { get; set; }

        // 初始容量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("initial_capacity")]
        [Validation(Required=true)]
        public string InitialCapacity { get; set; }

        // 当前余量
        /// <summary>
        /// <b>Example:</b>
        /// <para>10000</para>
        /// </summary>
        [NameInMap("current_capacity")]
        [Validation(Required=true)]
        public string CurrentCapacity { get; set; }

        // 总金额
        [NameInMap("total_fund")]
        [Validation(Required=true)]
        public MultiCurrencyMoney TotalFund { get; set; }

        // 剩余金额
        // 
        [NameInMap("remain_fund")]
        [Validation(Required=true)]
        public MultiCurrencyMoney RemainFund { get; set; }

    }

}
