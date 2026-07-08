// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 账户信息
    public class CarbonAccountInfo : TeaModel {
        // 账户did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:private:xxx</para>
        /// </summary>
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 账户名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx企业</para>
        /// </summary>
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

    }

}
