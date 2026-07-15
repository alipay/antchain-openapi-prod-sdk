// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // did详情
    public class DidDetail : TeaModel {
        // 控制者的did描述符
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxx</para>
        /// </summary>
        [NameInMap("controller")]
        [Validation(Required=true)]
        public string Controller { get; set; }

        // did描述符
        /// <summary>
        /// <b>Example:</b>
        /// <para>did:mychain:xxxxx</para>
        /// </summary>
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // did doc
        /// <summary>
        /// <b>Example:</b>
        /// <para>json字段</para>
        /// </summary>
        [NameInMap("did_doc")]
        [Validation(Required=true)]
        public string DidDoc { get; set; }

    }

}
