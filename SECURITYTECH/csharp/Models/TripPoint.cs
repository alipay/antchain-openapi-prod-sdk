// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 行程轨迹点
    public class TripPoint : TeaModel {
        // 经度
        /// <summary>
        /// <b>Example:</b>
        /// <para>121.503052</para>
        /// </summary>
        [NameInMap("longitude")]
        [Validation(Required=false)]
        public string Longitude { get; set; }

        // 维度
        /// <summary>
        /// <b>Example:</b>
        /// <para>31.218412</para>
        /// </summary>
        [NameInMap("latitude")]
        [Validation(Required=false)]
        public string Latitude { get; set; }

    }

}
