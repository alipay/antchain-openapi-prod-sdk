// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // SCRealEstateQueryRequestPayload
    public class SCRealEstateQueryRequestPayload : TeaModel {
        // xm
        /// <summary>
        /// <b>Example:</b>
        /// <para>张三</para>
        /// </summary>
        [NameInMap("xm")]
        [Validation(Required=true)]
        public string Xm { get; set; }

        // sfz
        /// <summary>
        /// <b>Example:</b>
        /// <para>51382219970820817X</para>
        /// </summary>
        [NameInMap("sfz")]
        [Validation(Required=true)]
        public string Sfz { get; set; }

    }

}
