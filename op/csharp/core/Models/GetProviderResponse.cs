// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.OP.Models
{
    public class GetProviderResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // API前缀
        [NameInMap("api_name_prefix")]
        [Validation(Required=false)]
        public string ApiNamePrefix { get; set; }

        // 描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 是否在开发者中心展示
        [NameInMap("developer_center_display")]
        [Validation(Required=false)]
        public bool? DeveloperCenterDisplay { get; set; }

        // Proivder名称，等同于产品码
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 产品别名
        [NameInMap("name_alias")]
        [Validation(Required=false)]
        public string NameAlias { get; set; }

        // 组织机构
        [NameInMap("organization")]
        [Validation(Required=false)]
        public string Organization { get; set; }

        // 产品类型
        [NameInMap("provider_type")]
        [Validation(Required=false)]
        public string ProviderType { get; set; }

        // 产品状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 产品简介
        [NameInMap("summary")]
        [Validation(Required=false)]
        public string Summary { get; set; }

    }

}
