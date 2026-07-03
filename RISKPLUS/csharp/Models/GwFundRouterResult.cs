// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 资金方信息
    public class GwFundRouterResult : TeaModel {
        // 资金方代码
        /// <summary>
        /// <b>Example:</b>
        /// <para>D2024082100001</para>
        /// </summary>
        [NameInMap("fund_code")]
        [Validation(Required=true)]
        public string FundCode { get; set; }

        // 资金方简称
        /// <summary>
        /// <b>Example:</b>
        /// <para>杭银消金</para>
        /// </summary>
        [NameInMap("abbre_fund_name")]
        [Validation(Required=true)]
        public string AbbreFundName { get; set; }

    }

}
