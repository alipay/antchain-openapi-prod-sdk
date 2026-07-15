// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链Rest信息
    public class ALiYunChainRest : TeaModel {
        // access_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>access_id</para>
        /// </summary>
        [NameInMap("access_id")]
        [Validation(Required=false)]
        public string AccessId { get; set; }

        // create_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123123</para>
        /// </summary>
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // rest
        /// <summary>
        /// <b>Example:</b>
        /// <para>rest</para>
        /// </summary>
        [NameInMap("rest")]
        [Validation(Required=false)]
        public string Rest { get; set; }

        // update_time
        /// <summary>
        /// <b>Example:</b>
        /// <para>123123123</para>
        /// </summary>
        [NameInMap("update_time")]
        [Validation(Required=false)]
        public long? UpdateTime { get; set; }

        // REST开通结果
        /// <summary>
        /// <b>Example:</b>
        /// <para>OK</para>
        /// </summary>
        [NameInMap("result")]
        [Validation(Required=false)]
        public string Result { get; set; }

    }

}
