// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class QueryMaasAssetResponse : TeaModel {
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

        // 资产 ID
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=false)]
        public string AssetType { get; set; }

        // 资产访问 URL，仅在已取得可访问地址时返回
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 素材名称，可选
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 创建时间，Unix 秒级时间戳，可选
        [NameInMap("created_at")]
        [Validation(Required=false)]
        public string CreatedAt { get; set; }

        // 更新时间，Unix 秒级时间戳，可选
        [NameInMap("updated_at")]
        [Validation(Required=false)]
        public string UpdatedAt { get; set; }

        // 处理失败时返回，包含 code / message
        [NameInMap("error")]
        [Validation(Required=false)]
        public Error Error { get; set; }

    }

}
