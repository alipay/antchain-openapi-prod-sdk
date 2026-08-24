// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    // 城市集合
    public class City : TeaModel {
        // 省份id
        /// <summary>
        /// <b>Example:</b>
        /// <para>省份id</para>
        /// </summary>
        [NameInMap("pid")]
        [Validation(Required=true)]
        public string Pid { get; set; }

        // 城市id
        /// <summary>
        /// <b>Example:</b>
        /// <para>城市id</para>
        /// </summary>
        [NameInMap("cid")]
        [Validation(Required=true)]
        public string Cid { get; set; }

        // 城市名
        /// <summary>
        /// <b>Example:</b>
        /// <para>xxxx</para>
        /// </summary>
        [NameInMap("cname")]
        [Validation(Required=true)]
        public string Cname { get; set; }

    }

}
