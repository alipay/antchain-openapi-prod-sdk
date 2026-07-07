// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // dci权利信息
    public class DciRightInfo : TeaModel {
        // 作品权利范围
        /// <summary>
        /// <b>Example:</b>
        /// <para>PUBLICATION</para>
        /// </summary>
        [NameInMap("right_scope")]
        [Validation(Required=true)]
        public string RightScope { get; set; }

        // 权利取得方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>ORIGINAL</para>
        /// </summary>
        [NameInMap("right_obtain_way")]
        [Validation(Required=true)]
        public string RightObtainWay { get; set; }

        // 权利归属方式
        /// <summary>
        /// <b>Example:</b>
        /// <para>PERSONAL</para>
        /// </summary>
        [NameInMap("ownership_way")]
        [Validation(Required=true)]
        public string OwnershipWay { get; set; }

    }

}
