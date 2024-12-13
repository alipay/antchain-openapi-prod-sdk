// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MICSERVICE.Models
{
    // 搜索到的结果元素
    public class SearchedItem : TeaModel {
        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 业务流程唯一id
        [NameInMap("biz_id")]
        [Validation(Required=false)]
        public string BizId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=false)]
        public string SceneId { get; set; }

        // 如余弦相似度(-1,1)
        [NameInMap("similarity")]
        [Validation(Required=true)]
        public string Similarity { get; set; }

        // 扩展字段，string类型，json格式
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
