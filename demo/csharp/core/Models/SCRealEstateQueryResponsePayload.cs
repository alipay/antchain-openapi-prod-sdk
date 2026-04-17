// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // SCRealEstateQueryResponsePayload
    public class SCRealEstateQueryResponsePayload : TeaModel {
        // code
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SCRealEstateQueryResponseData> Data { get; set; }

        // uuid
        /// <summary>
        /// <b>Example:</b>
        /// <para>uuid</para>
        /// </summary>
        [NameInMap("uuid")]
        [Validation(Required=true)]
        public string Uuid { get; set; }

        // ret_msg
        /// <summary>
        /// <b>Example:</b>
        /// <para>ret_msg</para>
        /// </summary>
        [NameInMap("ret_msg")]
        [Validation(Required=true)]
        public string RetMsg { get; set; }

    }

}
