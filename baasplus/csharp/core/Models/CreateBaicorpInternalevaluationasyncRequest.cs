// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    public class CreateBaicorpInternalevaluationasyncRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 场景ID
        [NameInMap("biz_id")]
        [Validation(Required=true)]
        public string BizId { get; set; }

        // 内部的业务代码
        [NameInMap("biz_info")]
        [Validation(Required=true)]
        public BizInfo BizInfo { get; set; }

        // 回调地址。由于存在异步调用，部分结果通过回调返回数据。例如图片和视频。
        [NameInMap("callback")]
        [Validation(Required=false)]
        public string Callback { get; set; }

        // 回调参数
        [NameInMap("callback_param")]
        [Validation(Required=false)]
        public string CallbackParam { get; set; }

        // 业务自定义id，便于识别返回数据对应关系
        [NameInMap("custom_id")]
        [Validation(Required=true)]
        public string CustomId { get; set; }

        // 待检测内容RAW数据，目前仅用于text类型，entity_url和entity_data不可同时存在
        [NameInMap("entity_data")]
        [Validation(Required=false)]
        public string EntityData { get; set; }

        // 待评估内容类型
        [NameInMap("entity_type")]
        [Validation(Required=true)]
        public string EntityType { get; set; }

        // 检测内容url，支持HTTPS, entity_url和entity_data不可同时存在
        [NameInMap("entity_url")]
        [Validation(Required=false)]
        public string EntityUrl { get; set; }

    }

}
