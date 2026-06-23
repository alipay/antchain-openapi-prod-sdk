// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // PopularDocument
    public class PopularDocument : TeaModel {
        // popular_document_title
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("popular_document_title")]
        [Validation(Required=false)]
        public string PopularDocumentTitle { get; set; }

        // popular_document_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("popular_document_id")]
        [Validation(Required=false)]
        public string PopularDocumentId { get; set; }

        // popular_document_info
        /// <summary>
        /// <b>Example:</b>
        /// <para>&quot;&quot;</para>
        /// </summary>
        [NameInMap("popular_document_info")]
        [Validation(Required=false)]
        public string PopularDocumentInfo { get; set; }

        // children
        [NameInMap("children")]
        [Validation(Required=true)]
        public List<CategoryVO> Children { get; set; }

    }

}
