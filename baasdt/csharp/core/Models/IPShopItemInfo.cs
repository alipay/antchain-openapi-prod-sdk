// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // IP商家的店铺宝贝详细数据
    public class IPShopItemInfo : TeaModel {
        // 商品数字id
        [NameInMap("num_id")]
        [Validation(Required=true)]
        public long? NumId { get; set; }

        // 商品标题,不能超过60字节
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 卖家昵称
        [NameInMap("nick")]
        [Validation(Required=true)]
        public string Nick { get; set; }

        // 价格
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 商品类型(fixed:一口价;auction:拍卖)注：取消团购
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 商品属性 格式：pid:vid;pid:vid
        [NameInMap("props")]
        [Validation(Required=false)]
        public string Props { get; set; }

        // 用户自行输入的子属性名和属性值，结构:"父属性值;一级子属性名;一级子属性值;二级子属性名;自定义输入值,....",如：“耐克;耐克系列;科比系列;科比系列;2K5”，input_str需要与input_pids一一对应，注：通常一个类目下用户可输入的关键属性不超过1个。所有属性别名加起来不能超过 3999字节。
        [NameInMap("input_str")]
        [Validation(Required=false)]
        public string InputStr { get; set; }

        // 商品描述, 字数要大于5个字节，小于25000个字节
        [NameInMap("desc")]
        [Validation(Required=false)]
        public string Desc { get; set; }

    }

}
