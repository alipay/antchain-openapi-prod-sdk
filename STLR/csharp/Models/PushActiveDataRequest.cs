// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class PushActiveDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 生产单元名称
        [NameInMap("location_name")]
        [Validation(Required=true)]
        public string LocationName { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 规格型号
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 是否按照单元过程录入
        [NameInMap("input_by_process")]
        [Validation(Required=false)]
        public bool? InputByProcess { get; set; }

        // lca活动数据项列表
        [NameInMap("item_list")]
        [Validation(Required=true)]
        public List<ActiveDataItem> ItemList { get; set; }

        // 填报维度，PRODUCT，UNIT
        [NameInMap("data_dimension")]
        [Validation(Required=false)]
        public string DataDimension { get; set; }

    }

}
