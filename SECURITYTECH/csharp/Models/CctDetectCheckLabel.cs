// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 内容安全response
    public class CctDetectCheckLabel : TeaModel {
        // label
        /// <summary>
        /// <b>Example:</b>
        /// <para>label</para>
        /// </summary>
        [NameInMap("label")]
        [Validation(Required=true)]
        public string Label { get; set; }

        // rate
        /// <summary>
        /// <b>Example:</b>
        /// <para>rate</para>
        /// </summary>
        [NameInMap("rate")]
        [Validation(Required=true)]
        public long? Rate { get; set; }

        // subLabels
        [NameInMap("sub_labels")]
        [Validation(Required=true)]
        public List<CctSubCheckLabel> SubLabels { get; set; }

        // details
        /// <summary>
        /// <b>Example:</b>
        /// <para>details</para>
        /// </summary>
        [NameInMap("details")]
        [Validation(Required=true)]
        public string Details { get; set; }

    }

}
