// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENERGYTOOL.Models
{
    public class QueryElectricCommondataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 主数据实体稳定编码
        [NameInMap("entity_code")]
        [Validation(Required=true)]
        public string EntityCode { get; set; }

        // 实体结构版本
        [NameInMap("schema_version")]
        [Validation(Required=true)]
        public string SchemaVersion { get; set; }

        // JSON 查询条件；无条件时传 {}
        [NameInMap("query_json")]
        [Validation(Required=true)]
        public string QueryJson { get; set; }

        // 页码，默认1，最小1
        [NameInMap("page_no")]
        [Validation(Required=false)]
        public long? PageNo { get; set; }

        // 每页数量，默认200，最大1000
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
