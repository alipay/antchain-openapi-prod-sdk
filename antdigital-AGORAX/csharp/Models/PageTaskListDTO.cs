// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AGORAX.Models
{
    // 任务列表分页结构体
    public class PageTaskListDTO : TeaModel {
        // 任务列表集合
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<TaskListInfoDTO> Content { get; set; }

        // 总记录条目
        /// <summary>
        /// <b>Example:</b>
        /// <para>6</para>
        /// </summary>
        [NameInMap("total_elements")]
        [Validation(Required=true)]
        public long? TotalElements { get; set; }

        // 记录总页数
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("total_pages")]
        [Validation(Required=true)]
        public long? TotalPages { get; set; }

        // 页码
        /// <summary>
        /// <b>Example:</b>
        /// <para>0</para>
        /// </summary>
        [NameInMap("number")]
        [Validation(Required=true)]
        public long? Number { get; set; }

        // 每页记录条目
        /// <summary>
        /// <b>Example:</b>
        /// <para>6</para>
        /// </summary>
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 每页元素个数
        [NameInMap("number_of_elements")]
        [Validation(Required=true)]
        public long? NumberOfElements { get; set; }

    }

}
