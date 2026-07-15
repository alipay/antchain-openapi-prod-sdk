// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约类型
    public class ContractTypeListResp : TeaModel {
        // 名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>存证合约</para>
        /// </summary>
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 值
        /// <summary>
        /// <b>Example:</b>
        /// <para>DEPOSITE</para>
        /// </summary>
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

    }

}
