// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryAppmarketCommondataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 实体编码：WeatherData、WeatherWarning、BiddingSpace
        [NameInMap("entity_code")]
        [Validation(Required=true)]
        public string EntityCode { get; set; }

        // 实体数据结构版本
        [NameInMap("schema_version")]
        [Validation(Required=true)]
        public string SchemaVersion { get; set; }

        // JSON 对象字符串，放实体自身的查询条件
        [NameInMap("query_json")]
        [Validation(Required=true)]
        public string QueryJson { get; set; }

        // 页码，默认 1
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 每页条数，默认 200，最大建议 1000
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
