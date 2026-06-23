// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 内容对象
    public class ContentObjVO : TeaModel {
        // novice_must_sees
        [NameInMap("novice_must_sees")]
        [Validation(Required=false)]
        public List<NoviceMustSee> NoviceMustSees { get; set; }

        // popular_document
        [NameInMap("popular_document")]
        [Validation(Required=false)]
        public List<PopularDocument> PopularDocument { get; set; }

        // product_presentation
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("product_presentation")]
        [Validation(Required=false)]
        public string ProductPresentation { get; set; }

    }

}
