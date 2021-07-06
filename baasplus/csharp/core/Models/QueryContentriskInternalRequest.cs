// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class QueryContentriskInternalRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 内容业务ID，用于进行异步识别结果的索引查询
        [NameInMap("app_scene_data_id")]
        [Validation(Required=true)]
        public string AppSceneDataId { get; set; }

        // 内部参数
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 内容检测事件id，根据此id查询异步检测结果
        [NameInMap("event_id")]
        [Validation(Required=false)]
        public string EventId { get; set; }

    }

}
