// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 用户资源收藏状态
    public class UserFavoriteVO : TeaModel {
        // 收藏资源 ID
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 收藏资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

        // 用户收藏的 ID
        [NameInMap("user_favorite_id")]
        [Validation(Required=true)]
        public long? UserFavoriteId { get; set; }

    }

}
