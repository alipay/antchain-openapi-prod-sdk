// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models
{
    // 核审场景
    public class GwVerifyScene : TeaModel {
        // 调用方系统名
        [NameInMap("system_name")]
        [Validation(Required=true)]
        public string SystemName { get; set; }

        // 业务方产品
        [NameInMap("biz_product")]
        [Validation(Required=true)]
        public string BizProduct { get; set; }

        // 业务产品节点
        [NameInMap("biz_prod_node")]
        [Validation(Required=true)]
        public string BizProdNode { get; set; }

        // 业务接入渠道
        [NameInMap("access_channel")]
        [Validation(Required=true)]
        public string AccessChannel { get; set; }

        // 业务调用场景的语言版本、CHINESE("中文", "chi")、ENG("英文", "en")
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

    }

}
