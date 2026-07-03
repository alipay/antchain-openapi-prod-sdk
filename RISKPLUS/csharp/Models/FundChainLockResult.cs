// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 商户资金链锁定结果
    public class FundChainLockResult : TeaModel {
        // 店铺名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>某店铺</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 店铺id
        /// <summary>
        /// <b>Example:</b>
        /// <para>2022091300001</para>
        /// </summary>
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 0:成功
        // 1:失败
        // 2:处理中
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
