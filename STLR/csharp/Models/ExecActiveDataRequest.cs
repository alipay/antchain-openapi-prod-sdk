// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.STLR.Models
{
    public class ExecActiveDataRequest : TeaModel {
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

        // 产品规格
        [NameInMap("specification")]
        [Validation(Required=true)]
        public string Specification { get; set; }

        // 填报维度，`PRODUCT` 表示产品维度，`UNIT` 表示单元维度
        [NameInMap("data_dimension")]
        [Validation(Required=false)]
        public string DataDimension { get; set; }

        // 是否按照单元过程录入；`true` 表示按单元过程，`false` 表示汇总录入
        [NameInMap("input_by_process")]
        [Validation(Required=false)]
        public bool? InputByProcess { get; set; }

        // 活动数据项列表
        [NameInMap("item_list")]
        [Validation(Required=true)]
        public List<ActiveDataItem> ItemList { get; set; }

    }

}
