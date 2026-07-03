// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 指纹图片入库是否成功
    public class GoodsDigitalFingerprintRegisterResultData : TeaModel {
        // 指纹图片入库是否成功
        /// <summary>
        /// <b>Example:</b>
        /// <para>true</para>
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

        // 失败原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>describe</para>
        /// </summary>
        [NameInMap("describe")]
        [Validation(Required=false)]
        public string Describe { get; set; }

    }

}
