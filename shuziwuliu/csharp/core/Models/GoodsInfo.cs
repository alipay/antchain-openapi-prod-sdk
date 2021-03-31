// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 货物信息
    public class GoodsInfo : TeaModel {
        // 货物ID [业务必填]
        [NameInMap("goods_id")]
        [Validation(Required=false)]
        public string GoodsId { get; set; }

        // 唛头
        // 
        // 
        [NameInMap("marks")]
        [Validation(Required=false)]
        public string Marks { get; set; }

        // 货物名称
        [NameInMap("goods")]
        [Validation(Required=false)]
        public string Goods { get; set; }

        // 货物类型
        [NameInMap("goods_type")]
        [Validation(Required=false)]
        public string GoodsType { get; set; }

        // 货物重量
        [NameInMap("weight")]
        [Validation(Required=false)]
        public string Weight { get; set; }

        // 件数
        [NameInMap("number")]
        [Validation(Required=false)]
        public string Number { get; set; }

    }

}
