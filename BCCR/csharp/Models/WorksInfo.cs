// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品信息
    public class WorksInfo : TeaModel {
        // 作品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>我的作品</para>
        /// </summary>
        [NameInMap("works_name")]
        [Validation(Required=true)]
        public string WorksName { get; set; }

        // 作品类型
        /// <summary>
        /// <b>Example:</b>
        /// <para>视频</para>
        /// </summary>
        [NameInMap("works_type")]
        [Validation(Required=false)]
        public string WorksType { get; set; }

        // 作品类型英文标识
        /// <summary>
        /// <b>Example:</b>
        /// <para>MODEL</para>
        /// </summary>
        [NameInMap("works_type_en")]
        [Validation(Required=false)]
        public string WorksTypeEn { get; set; }

    }

}
