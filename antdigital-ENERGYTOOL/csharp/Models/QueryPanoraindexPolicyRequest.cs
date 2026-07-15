// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryPanoraindexPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 根据标题模糊搜搜
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

        // 根据标题或地区模糊搜索
        [NameInMap("titleorregionlike")]
        [Validation(Required=false)]
        public string Titleorregionlike { get; set; }

        // 一页数据量，最大100
        [NameInMap("pagesize")]
        [Validation(Required=false)]
        public long? Pagesize { get; set; }

        // 排序字段
        [NameInMap("orderby")]
        [Validation(Required=false)]
        public string Orderby { get; set; }

        // 排序方向（ASC/DESC，默认为DESC）
        [NameInMap("orderdirection")]
        [Validation(Required=false)]
        public string Orderdirection { get; set; }

        // 最小id，用于游标翻页
        [NameInMap("minid")]
        [Validation(Required=false)]
        public long? Minid { get; set; }

        // 页号
        [NameInMap("pagenum")]
        [Validation(Required=false)]
        public long? Pagenum { get; set; }

        // 来源网站code码，可批量查询最多填15个
        [NameInMap("websitecode")]
        [Validation(Required=false)]
        public List<string> Websitecode { get; set; }

    }

}
