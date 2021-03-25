// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    public class ExecConsumecardOrdertrywithdrawRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求参数
        [NameInMap("base_request")]
        [Validation(Required=true)]
        public BaseRequest BaseRequest { get; set; }

        // 需要提现的订单分布的区块结束高度
        [NameInMap("end_block_number")]
        [Validation(Required=false)]
        public long? EndBlockNumber { get; set; }

        // 需要提现的订单Id列表(不要超过100个Id)
        [NameInMap("order_id_list")]
        [Validation(Required=false)]
        public List<string> OrderIdList { get; set; }

        // 需要提现的订单分布的区块起始高度
        [NameInMap("start_block_number")]
        [Validation(Required=false)]
        public long? StartBlockNumber { get; set; }

    }

}
