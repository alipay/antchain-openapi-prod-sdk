// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    // 场景分页查询结果
    public class ScenePageResponse : TeaModel {
        // 页数
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("page_index")]
        [Validation(Required=true)]
        public long? PageIndex { get; set; }

        // 页码
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 总记录数
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>100</para>
        /// </summary>
        [NameInMap("total_size")]
        [Validation(Required=true)]
        public long? TotalSize { get; set; }

        // 总页数
        // 
        /// <summary>
        /// <b>Example:</b>
        /// <para>10</para>
        /// </summary>
        [NameInMap("total_pages")]
        [Validation(Required=true)]
        public long? TotalPages { get; set; }

        // 数据
        /// <summary>
        /// <b>Example:</b>
        /// <para>{...}</para>
        /// </summary>
        [NameInMap("page_data")]
        [Validation(Required=true)]
        public List<SceneModel> PageData { get; set; }

    }

}
