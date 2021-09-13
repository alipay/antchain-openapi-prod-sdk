// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TRADE.Models
{
    // 套餐结构
    public class Combo : TeaModel {
        // 套餐名称
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 套餐编码
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 套餐版本号
        [NameInMap("vid")]
        [Validation(Required=true)]
        public string Vid { get; set; }

        // 套餐描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 扩展信息，JSON结构，包含标签、个性化配置等数据
        [NameInMap("extends_config")]
        [Validation(Required=true)]
        public string ExtendsConfig { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 套餐内商品列表
        [NameInMap("commodities")]
        [Validation(Required=true)]
        public List<ComboCommodity> Commodities { get; set; }

    }

}
