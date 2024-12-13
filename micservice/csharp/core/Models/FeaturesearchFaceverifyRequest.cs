// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MICSERVICE.Models
{
    public class FeaturesearchFaceverifyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用户id
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 业务流程的唯一id
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 场景id
        [NameInMap("scene_id")]
        [Validation(Required=true)]
        public string SceneId { get; set; }

        // 特征类型
        [NameInMap("feature_type")]
        [Validation(Required=true)]
        public string FeatureType { get; set; }

        // 特征向量，维度要求128/256/512
        [NameInMap("feature_vector")]
        [Validation(Required=true)]
        public List<string> FeatureVector { get; set; }

        // 扩展字段，string类型，json格式
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
