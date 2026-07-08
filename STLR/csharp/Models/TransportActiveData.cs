// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    // 运输信息
    public class TransportActiveData : TeaModel {
        // 运输方式编码
        /// <summary>
        /// <b>Example:</b>
        /// <para>5201000000</para>
        /// </summary>
        [NameInMap("transport_code")]
        [Validation(Required=true)]
        public string TransportCode { get; set; }

        // 运输设备
        /// <summary>
        /// <b>Example:</b>
        /// <para>KCTC</para>
        /// </summary>
        [NameInMap("equipment")]
        [Validation(Required=true)]
        public string Equipment { get; set; }

        // 运输里程
        /// <summary>
        /// <b>Example:</b>
        /// <para>200</para>
        /// </summary>
        [NameInMap("distance")]
        [Validation(Required=true)]
        public string Distance { get; set; }

        // 是否空载
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("is_empty_load")]
        [Validation(Required=false)]
        public bool? IsEmptyLoad { get; set; }

    }

}
