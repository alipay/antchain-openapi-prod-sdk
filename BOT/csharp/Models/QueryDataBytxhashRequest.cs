// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class QueryDataBytxhashRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene")]
        [Validation(Required=true)]
        public string Scene { get; set; }

        // 链上交易hash
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

        // 上链类型枚举： 
        // REGISTER_DEVICE	设备注册
        // DISTRIBUTE_DEVICE	设备发行
        // LABEL_DATA	标签流转数据收集
        // COLLECT_DATA	设备数据收集
        // DEVICE_BIZ_DATA	设备业务订单数据收集
        // REGISTER_PERIPHERAL_DEVICE	外围设备注册
        [NameInMap("contract_method")]
        [Validation(Required=true)]
        public string ContractMethod { get; set; }

    }

}
