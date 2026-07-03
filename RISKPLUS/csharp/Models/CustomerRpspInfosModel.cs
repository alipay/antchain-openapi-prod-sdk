// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 查询结果
    public class CustomerRpspInfosModel : TeaModel {
        // 归属用户的混合分层决策结果
        [NameInMap("rpsp_results")]
        [Validation(Required=true)]
        public List<RpspInfoModel> RpspResults { get; set; }

        // 用户凭证
        /// <summary>
        /// <b>Example:</b>
        /// <para>8002c3d97e7d4d20a0647c75dfab1efe</para>
        /// </summary>
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

    }

}
