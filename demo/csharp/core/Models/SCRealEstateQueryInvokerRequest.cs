// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // SCRealEstateQuery
    public class SCRealEstateQueryInvokerRequest : TeaModel {
        // header
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;header&quot;: {}</para>
        /// </summary>
        [NameInMap("header")]
        [Validation(Required=true)]
        public Header Header { get; set; }

        // body
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;body&quot;:{}</para>
        /// </summary>
        [NameInMap("body")]
        [Validation(Required=true)]
        public SCRealEstateQueryBody Body { get; set; }

    }

}
