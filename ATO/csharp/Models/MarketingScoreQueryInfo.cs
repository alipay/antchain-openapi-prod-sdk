// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 营销分查询对象
    public class MarketingScoreQueryInfo : TeaModel {
        // 手机号码
        /// <summary>
        /// <b>Example:</b>
        /// <para>16677778888</para>
        /// </summary>
        [NameInMap("phone_num")]
        [Validation(Required=false)]
        public string PhoneNum { get; set; }

    }

}
