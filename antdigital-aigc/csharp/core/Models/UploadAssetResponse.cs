// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIGC.Models
{
    public class UploadAssetResponse : TeaModel {
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

        // 资产ID
        [NameInMap("asset_id")]
        [Validation(Required=false)]
        public string AssetId { get; set; }

        // 任务状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 资产类型
        [NameInMap("asset_type")]
        [Validation(Required=false)]
        public string AssetType { get; set; }

        // 扩展信息 JSON
        [NameInMap("ext_info")]
        [Validation(Required=false)]
        public string ExtInfo { get; set; }

    }

}
