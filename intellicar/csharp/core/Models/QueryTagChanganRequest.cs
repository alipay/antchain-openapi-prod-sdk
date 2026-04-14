// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryTagChanganRequest : TeaModel {
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

        // 授权token
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

        // 请求唯一ID（UUID生成即可）
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 系统
        [NameInMap("os")]
        [Validation(Required=false)]
        public string Os { get; set; }

        // 标签库组合：
        // 1表示基础标签
        // 2表示行业标签
        // 3表示基础标签+行业标签
        // 8表示自定义标签
        // 9表示基础标签+自定义标签
        // 10表示行业标签+自定义标签
        // 11表示基础标签+行业标签+自定义标签
        [NameInMap("type")]
        [Validation(Required=true)]
        public long? Type { get; set; }

        // 设备信息
        [NameInMap("device_info_list")]
        [Validation(Required=true)]
        public DeviceBean DeviceInfoList { get; set; }

        // 基础标签动态参数（对外编码）
        [NameInMap("base_tags")]
        [Validation(Required=false)]
        public List<string> BaseTags { get; set; }

        // 行业标签动态参数（对外编码）
        [NameInMap("industy_tags")]
        [Validation(Required=false)]
        public List<string> IndustyTags { get; set; }

        // 规则标签动态参数（对外编码）
        [NameInMap("business_tags")]
        [Validation(Required=false)]
        public List<string> BusinessTags { get; set; }

    }

}
