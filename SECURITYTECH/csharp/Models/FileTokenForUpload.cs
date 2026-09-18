// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 终端安全-Android加固-Response
    public class FileTokenForUpload : TeaModel {
        // .
        /// <summary>
        /// <b>Example:</b>
        /// <para>.</para>
        /// </summary>
        [NameInMap("access_id")]
        [Validation(Required=true)]
        public string AccessId { get; set; }

        // dir
        /// <summary>
        /// <b>Example:</b>
        /// <para>dir</para>
        /// </summary>
        [NameInMap("dir")]
        [Validation(Required=true)]
        public string Dir { get; set; }

        // expire
        /// <summary>
        /// <b>Example:</b>
        /// <para>expire</para>
        /// </summary>
        [NameInMap("expire")]
        [Validation(Required=true)]
        public string Expire { get; set; }

        // host
        /// <summary>
        /// <b>Example:</b>
        /// <para>host</para>
        /// </summary>
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        // policy
        /// <summary>
        /// <b>Example:</b>
        /// <para>policy</para>
        /// </summary>
        [NameInMap("policy")]
        [Validation(Required=true)]
        public string Policy { get; set; }

        // signature
        /// <summary>
        /// <b>Example:</b>
        /// <para>signature</para>
        /// </summary>
        [NameInMap("signature")]
        [Validation(Required=true)]
        public string Signature { get; set; }

    }

}
