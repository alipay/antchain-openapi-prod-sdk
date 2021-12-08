// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 分页失败的展示日志（过滤器：待处理、成功、已忽略）
    public class CommonResponsePageableStructBody : TeaModel {
        // 页面规格
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public string PageSize { get; set; }

        // 当前页码
        [NameInMap("current")]
        [Validation(Required=false)]
        public string Current { get; set; }

        // 总条数
        [NameInMap("total")]
        [Validation(Required=false)]
        public string Total { get; set; }

        // 失败日志数组
        [NameInMap("list")]
        [Validation(Required=false)]
        public List<TriggerLogDTOStructBody> List { get; set; }

    }

}
