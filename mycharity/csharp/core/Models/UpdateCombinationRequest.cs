// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MYCHARITY.Models
{
    public class UpdateCombinationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 实施内容id
        [NameInMap("id")]
        [Validation(Required=true, MaxLength=50)]
        public string Id { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false, MaxLength=20)]
        public string Name { get; set; }

        // 实施内容类型：0善款类，1实物类、2服务类
        [NameInMap("type")]
        [Validation(Required=false)]
        public long? Type { get; set; }

        // 单位
        [NameInMap("unit")]
        [Validation(Required=false, MaxLength=10)]
        public string Unit { get; set; }

        // 说明
        [NameInMap("note")]
        [Validation(Required=false, MaxLength=1000)]
        public string Note { get; set; }

        // 单价是否固定，0:不固定，1:固定
        [NameInMap("price_determined_flag")]
        [Validation(Required=false)]
        public long? PriceDeterminedFlag { get; set; }

        // 单位分，预估单价
        [NameInMap("price")]
        [Validation(Required=false)]
        public long? Price { get; set; }

        // 预估发放数量
        [NameInMap("total_num")]
        [Validation(Required=false)]
        public long? TotalNum { get; set; }

    }

}
