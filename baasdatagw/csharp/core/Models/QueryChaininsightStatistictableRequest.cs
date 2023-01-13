// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    public class QueryChaininsightStatistictableRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 链ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 自定义统计的指标ID
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 多个维度名称，空表示所有维度
        [NameInMap("dimensions")]
        [Validation(Required=false)]
        public List<string> Dimensions { get; set; }

        // 分页大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 页码
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

    }

}
