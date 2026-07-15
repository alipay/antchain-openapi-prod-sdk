// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 结算银行卡信息
    public class SettleCardInfo : TeaModel {
        // 开户支行名
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行杭州高新支行</para>
        /// </summary>
        [NameInMap("account_branch_name")]
        [Validation(Required=true)]
        public string AccountBranchName { get; set; }

        // 卡户名
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("account_holder_name")]
        [Validation(Required=true)]
        public string AccountHolderName { get; set; }

        // 开户行所在地-市
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭州市</para>
        /// </summary>
        [NameInMap("account_inst_city")]
        [Validation(Required=true)]
        public string AccountInstCity { get; set; }

        // 开户行简称缩写
        /// <summary>
        /// <b>Example:</b>
        /// <para>CMB</para>
        /// </summary>
        [NameInMap("account_inst_id")]
        [Validation(Required=true)]
        public string AccountInstId { get; set; }

        // 银行名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>招商银行</para>
        /// </summary>
        [NameInMap("account_inst_name")]
        [Validation(Required=true)]
        public string AccountInstName { get; set; }

        // 开户行所在地-省
        /// <summary>
        /// <b>Example:</b>
        /// <para>浙江省</para>
        /// </summary>
        [NameInMap("account_inst_province")]
        [Validation(Required=true)]
        public string AccountInstProvince { get; set; }

        // 银行卡号
        /// <summary>
        /// <b>Example:</b>
        /// <para>6214855710610408</para>
        /// </summary>
        [NameInMap("account_no")]
        [Validation(Required=true)]
        public string AccountNo { get; set; }

        // 卡类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>DC</para>
        /// </summary>
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 账号使用类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>01</para>
        /// </summary>
        [NameInMap("usage_type")]
        [Validation(Required=true)]
        public string UsageType { get; set; }

    }

}
