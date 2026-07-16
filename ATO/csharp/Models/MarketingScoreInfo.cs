// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销分对象
    public class MarketingScoreInfo : TeaModel {
        // 手机号
        /// <summary>
        /// <b>Example:</b>
        /// <para>16677778888</para>
        /// </summary>
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

        // 营销分
        /// <summary>
        /// <b>Example:</b>
        /// <para>55.5</para>
        /// </summary>
        [NameInMap("score")]
        [Validation(Required=false)]
        public string Score { get; set; }

    }

}
