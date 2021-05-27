// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    public class NotifyCmportLogisticsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 融资编号 	
        // 
        [NameInMap("financial_no")]
        [Validation(Required=true)]
        public string FinancialNo { get; set; }

        // 货权编号	
        // 
        [NameInMap("cargo_right_no")]
        [Validation(Required=true)]
        public string CargoRightNo { get; set; }

        // 获物品名	
        // 
        [NameInMap("goods_type_name")]
        [Validation(Required=true)]
        public string GoodsTypeName { get; set; }

        // 运输条款	
        // 
        [NameInMap("transit_clause")]
        [Validation(Required=true)]
        public string TransitClause { get; set; }

        // 箱子数量	
        // 
        [NameInMap("box_num")]
        [Validation(Required=true)]
        public long? BoxNum { get; set; }

        // 箱型	
        // 
        [NameInMap("box_type")]
        [Validation(Required=false)]
        public string BoxType { get; set; }

        // 运单信息详情列表	
        [NameInMap("order_info_list")]
        [Validation(Required=true)]
        public List<OrderInfo> OrderInfoList { get; set; }

        // 上链账户
        [NameInMap("user_did")]
        [Validation(Required=true)]
        public string UserDid { get; set; }

        // 联盟id
        [NameInMap("union_id")]
        [Validation(Required=true)]
        public long? UnionId { get; set; }

        // 渠道名称
        [NameInMap("channel_name")]
        [Validation(Required=true)]
        public string ChannelName { get; set; }

    }

}
