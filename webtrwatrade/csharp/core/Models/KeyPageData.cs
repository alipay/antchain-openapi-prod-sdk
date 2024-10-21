// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.WEBTRWATRADE.Models
{
    // 密钥分页列表
    public class KeyPageData : TeaModel {
        // 总记录
        [NameInMap("total")]
        [Validation(Required=true)]
        public long? Total { get; set; }

        // 总页数
        [NameInMap("page_count")]
        [Validation(Required=true)]
        public long? PageCount { get; set; }

        // 当前页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 密钥列表
        [NameInMap("records")]
        [Validation(Required=true)]
        public List<KeyVO> Records { get; set; }

    }

}
