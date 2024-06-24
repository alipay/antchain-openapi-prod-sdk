// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models
{
    public class SyncAntchainAtoTradeFinanceloanapplyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 订单id 
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 订单所属商户的社会信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=64)]
        public string MerchantId { get; set; }

        // 融资放款申请接口
        [NameInMap("merchant_name")]
        [Validation(Required=true)]
        public string MerchantName { get; set; }

        // 资方的社会信用代码
        [NameInMap("fund_id")]
        [Validation(Required=false, MaxLength=64)]
        public string FundId { get; set; }

        // 类型
        // ● 默认为：ORDER, 单订单申请
        // ● PACKAGE_ORDER , 资产包订单模式
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 资产包id
        // type = PACKAGE_ORDER ， 必填
        [NameInMap("asset_package_id")]
        [Validation(Required=false, MaxLength=50)]
        public string AssetPackageId { get; set; }

        // type = PACKAGE_ORDER ， 必填
        // 
        // ● APPEND: 追加订单列表
        // ● FINIISH : 结束
        [NameInMap("stage")]
        [Validation(Required=false)]
        public string Stage { get; set; }

        // 订单id列表的jsonArray
        [NameInMap("order_id_list")]
        [Validation(Required=false)]
        public string OrderIdList { get; set; }

    }

}
