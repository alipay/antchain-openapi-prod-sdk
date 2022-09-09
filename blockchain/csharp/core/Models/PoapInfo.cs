// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // POAP徽章的详细信息
    public class PoapInfo : TeaModel {
        // 徽章ID，具有唯一性
        [NameInMap("poap_id")]
        [Validation(Required=true)]
        public string PoapId { get; set; }

        // 徽章名字
        [NameInMap("poap_name")]
        [Validation(Required=true)]
        public string PoapName { get; set; }

        // 徽章HASH
        [NameInMap("uni_hash")]
        [Validation(Required=true)]
        public string UniHash { get; set; }

        // 状态，枚举值
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 徽章资源 URL
        [NameInMap("poap_url")]
        [Validation(Required=true)]
        public string PoapUrl { get; set; }

        // 枚举值，2D_IMAGE--2D图片渲染；3D_OASISENGINE--3D模型渲染
        [NameInMap("render_type")]
        [Validation(Required=true)]
        public string RenderType { get; set; }

        // 3D模型降级使用的资源URL
        [NameInMap("fault_tolerance_url")]
        [Validation(Required=false)]
        public string FaultToleranceUrl { get; set; }

    }

}
