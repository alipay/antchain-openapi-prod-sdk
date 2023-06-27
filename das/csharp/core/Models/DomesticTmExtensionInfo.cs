// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    // 国内商标扩展信息
    public class DomesticTmExtensionInfo : TeaModel {
        // 商标logo URL地址
        [NameInMap("tm_logo_url")]
        [Validation(Required=false)]
        public string TmLogoUrl { get; set; }

        // 商品与服务信息列表
        [NameInMap("goods_info")]
        [Validation(Required=false)]
        public List<DomesticTmGoodsInfo> GoodsInfo { get; set; }

    }

}
