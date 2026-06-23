// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DD.Models
{
    // 分页返参
    public class PaginationResult : TeaModel {
        // 查询结果
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ChargeBillVO> Data { get; set; }

        // 当前页
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("current_page")]
        [Validation(Required=true)]
        public long? CurrentPage { get; set; }

        // 分页大小
        /// <summary>
        /// <b>Example:</b>
        /// <para>20</para>
        /// </summary>
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 查询结果总数
        /// <summary>
        /// <b>Example:</b>
        /// <para>12</para>
        /// </summary>
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

        // 状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("success")]
        [Validation(Required=true)]
        public bool? Success { get; set; }

    }

}
