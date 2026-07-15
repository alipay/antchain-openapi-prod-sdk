// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 派生DID的具体参数
    public class DeriveDid : TeaModel {
        // 派生的子did
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxx</para>
        /// </summary>
        [NameInMap("childdid")]
        [Validation(Required=true)]
        public string Childdid { get; set; }

        // 子did 的did doc
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxx</para>
        /// </summary>
        [NameInMap("childdiddoc")]
        [Validation(Required=true)]
        public string Childdiddoc { get; set; }

        // 用户输入用于派生子did的派生码
        /// <summary>
        /// <b>Example:</b>
        /// <para>asdfghj</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

    }

}
