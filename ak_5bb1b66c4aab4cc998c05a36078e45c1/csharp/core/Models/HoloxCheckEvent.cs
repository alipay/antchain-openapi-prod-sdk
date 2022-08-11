// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_5bb1b66c4aab4cc998c05a36078e45c1.Models
{
    // 大安全接口结构体
    public class HoloxCheckEvent : TeaModel {
        // 是否成功
        [NameInMap("sucess")]
        [Validation(Required=true)]
        public bool? Sucess { get; set; }

        // 123
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 12
        [NameInMap("app_code")]
        [Validation(Required=true)]
        public string AppCode { get; set; }

        // 123
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 12
        [NameInMap("product_code")]
        [Validation(Required=false)]
        public string ProductCode { get; set; }

        // 123
        [NameInMap("channel")]
        [Validation(Required=true)]
        public string Channel { get; set; }

        // 123
        [NameInMap("app_scene_data_id")]
        [Validation(Required=false)]
        public string AppSceneDataId { get; set; }

        // 123
        [NameInMap("account_type")]
        [Validation(Required=false)]
        public string AccountType { get; set; }

        // 123
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 123
        [NameInMap("reciever_id")]
        [Validation(Required=true)]
        public string RecieverId { get; set; }

        // 123
        [NameInMap("publish_date")]
        [Validation(Required=true)]
        public string PublishDate { get; set; }

        // 123
        [NameInMap("is_test")]
        [Validation(Required=true)]
        public bool? IsTest { get; set; }

        // 123
        [NameInMap("is_load_test")]
        [Validation(Required=true)]
        public bool? IsLoadTest { get; set; }

        // 123
        [NameInMap("is_fusing")]
        [Validation(Required=true)]
        public bool? IsFusing { get; set; }

        // 123
        [NameInMap("scene_type")]
        [Validation(Required=true)]
        public string SceneType { get; set; }

        // 123
        [NameInMap("content_data")]
        [Validation(Required=true)]
        public string ContentData { get; set; }

        // 123
        [NameInMap("event_data")]
        [Validation(Required=true)]
        public string EventData { get; set; }

    }

}
