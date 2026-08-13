// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryTdiaiworkshopcloudBatchRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 商品码（事件码）蚂蚁侧提供
        [NameInMap("event_code")]
        [Validation(Required=true)]
        public string EventCode { get; set; }

        // 产品code
        [NameInMap("disp_model_code")]
        [Validation(Required=true)]
        public string DispModelCode { get; set; }

        // 要查询的dataIdList
        [NameInMap("query_data_id_list")]
        [Validation(Required=true)]
        public List<string> QueryDataIdList { get; set; }

    }

}
