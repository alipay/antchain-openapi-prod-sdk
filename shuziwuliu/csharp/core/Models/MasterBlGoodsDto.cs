// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    // 提单货物数据
    public class MasterBlGoodsDto : TeaModel {
        // 唛头
        [NameInMap("marks")]
        [Validation(Required=false)]
        public string Marks { get; set; }

        // 货物
        [NameInMap("goods")]
        [Validation(Required=true)]
        public string Goods { get; set; }

        // 货物类型
        [NameInMap("goods_type")]
        [Validation(Required=true)]
        public string GoodsType { get; set; }

        // 包装类型
        [NameInMap("package_type")]
        [Validation(Required=false)]
        public string PackageType { get; set; }

        // 委托件数
        [NameInMap("number")]
        [Validation(Required=true)]
        public string Number { get; set; }

        // 委托重量
        [NameInMap("weight")]
        [Validation(Required=true)]
        public string Weight { get; set; }

        // 委托体积
        [NameInMap("volume")]
        [Validation(Required=true)]
        public string Volume { get; set; }

    }

}
