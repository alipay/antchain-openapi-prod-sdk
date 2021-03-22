// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class QueryConsumecardCounterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 基础结构体
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 查询的类别（0 商家，1 商品）
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 查询的id（type：0 为accountId 1为goodsId）
        [NameInMap("query_id")]
        [Validation(Required=true)]
        public string QueryId { get; set; }

        // 查询的时间戳对应的counter
        [NameInMap("query_time_in_mills")]
        [Validation(Required=true)]
        public long? QueryTimeInMills { get; set; }

    }

}
