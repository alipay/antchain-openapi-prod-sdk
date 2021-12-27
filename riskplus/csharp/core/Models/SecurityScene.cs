// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 安全场景参数
    public class SecurityScene : TeaModel {
        // 接入渠道
        [NameInMap("access_channel")]
        [Validation(Required=false)]
        public string AccessChannel { get; set; }

        // 事件信息
        [NameInMap("ctu_params")]
        [Validation(Required=false)]
        public string CtuParams { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 产品节点
        [NameInMap("product_node")]
        [Validation(Required=false)]
        public string ProductNode { get; set; }

        // 扩展参数
        [NameInMap("security_scene_params")]
        [Validation(Required=false)]
        public string SecuritySceneParams { get; set; }

        // 系统名称
        [NameInMap("system_name")]
        [Validation(Required=false)]
        public string SystemName { get; set; }

        // 总金额
        [NameInMap("total_fee")]
        [Validation(Required=false)]
        public string TotalFee { get; set; }

    }

}
