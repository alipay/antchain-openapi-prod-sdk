// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 阿里云区块链资源类型信息
    public class ALiYunChainResouceType : TeaModel {
        // type_id
        /// <summary>
        /// <b>Example:</b>
        /// <para>type_id</para>
        /// </summary>
        [NameInMap("type_id")]
        [Validation(Required=false)]
        public long? TypeId { get; set; }

        // cpu
        /// <summary>
        /// <b>Example:</b>
        /// <para>24</para>
        /// </summary>
        [NameInMap("cpu")]
        [Validation(Required=false)]
        public long? Cpu { get; set; }

        // memory
        /// <summary>
        /// <b>Example:</b>
        /// <para>24</para>
        /// </summary>
        [NameInMap("memory")]
        [Validation(Required=false)]
        public long? Memory { get; set; }

        // disk
        /// <summary>
        /// <b>Example:</b>
        /// <para>500</para>
        /// </summary>
        [NameInMap("disk")]
        [Validation(Required=false)]
        public long? Disk { get; set; }

    }

}
