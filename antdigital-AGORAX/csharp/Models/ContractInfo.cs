// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 合约信息
    public class ContractInfo : TeaModel {
        // 合约地址
        /// <summary>
        /// <b>Example:</b>
        /// <para>ac01ceb0d8df822e042e5ea3b677201655250dbf54b9bd0c364de6f3f2a1dc7e</para>
        /// </summary>
        [NameInMap("contract")]
        [Validation(Required=false)]
        public string Contract { get; set; }

        // 部署hash
        /// <summary>
        /// <b>Example:</b>
        /// <para>1c625b49992ed3b55abaac677f964a35c4151d4112da8204ac874b6497bf1143</para>
        /// </summary>
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 合约部署时间
        /// <summary>
        /// <b>Example:</b>
        /// <para>1573401600000</para>
        /// </summary>
        [NameInMap("timestamp")]
        [Validation(Required=false)]
        public long? Timestamp { get; set; }

    }

}
