// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MDIP.Models
{
    // 批量请求响应的结构体
    public class ResItem : TeaModel {
        // 客户侧样本唯一id用于映射
        /// <summary>
        /// <b>Example:</b>
        /// <para>077e5fc68135bd8e8223a094029d4cee</para>
        /// </summary>
        [NameInMap("sample_id")]
        [Validation(Required=true)]
        public string SampleId { get; set; }

        // 蚂蚁侧对应样本唯一id，与客户侧形成映射关系，查询时需要携带该id
        /// <summary>
        /// <b>Example:</b>
        /// <para>46052e46721417297df682ef88a8ab91</para>
        /// </summary>
        [NameInMap("data_id")]
        [Validation(Required=true)]
        public string DataId { get; set; }

    }

}
