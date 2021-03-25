// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 可兑换商品列表
    public class ExchangeableEquityList : TeaModel {
        // 页面上数据在总数据中的结束位置（第几个数据）
        [NameInMap("end_row")]
        [Validation(Required=true)]
        public long? EndRow { get; set; }

        // 权益信息列表
        [NameInMap("equity_list")]
        [Validation(Required=true)]
        public List<EquityDetail> EquityList { get; set; }

        // 第一页页码
        [NameInMap("first_page")]
        [Validation(Required=true)]
        public long? FirstPage { get; set; }

        // 是否有下一页
        [NameInMap("has_next_page")]
        [Validation(Required=true)]
        public bool? HasNextPage { get; set; }

        // 是否有前一页
        [NameInMap("has_previous_page")]
        [Validation(Required=true)]
        public bool? HasPreviousPage { get; set; }

        // 是否第一页
        [NameInMap("is_first_page")]
        [Validation(Required=true)]
        public bool? IsFirstPage { get; set; }

        // 是否最后一页
        [NameInMap("is_last_page")]
        [Validation(Required=true)]
        public bool? IsLastPage { get; set; }

        // 最后一页页码
        [NameInMap("last_page")]
        [Validation(Required=true)]
        public long? LastPage { get; set; }

        // 下一页页码
        [NameInMap("next_page")]
        [Validation(Required=true)]
        public long? NextPage { get; set; }

        // 排序规则
        [NameInMap("order_by")]
        [Validation(Required=true)]
        public string OrderBy { get; set; }

        // 可兑换的权益总页数
        [NameInMap("pages")]
        [Validation(Required=true)]
        public long? Pages { get; set; }

        // 当前页码
        [NameInMap("page_number")]
        [Validation(Required=true)]
        public long? PageNumber { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 前一页页码
        [NameInMap("pre_page")]
        [Validation(Required=true)]
        public long? PrePage { get; set; }

        // 页面中实际数量
        [NameInMap("size")]
        [Validation(Required=true)]
        public long? Size { get; set; }

        // 页面上数据在总数据中的开始位置（第几个数据）
        [NameInMap("start_row")]
        [Validation(Required=true)]
        public long? StartRow { get; set; }

        // 可兑换的权益总数
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

    }

}
