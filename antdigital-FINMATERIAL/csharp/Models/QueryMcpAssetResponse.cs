// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.FINMATERIAL.Models
{
    public class QueryMcpAssetResponse : TeaModel {
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

        // 资产类别
        [NameInMap("asset_type")]
        [Validation(Required=false)]
        public string AssetType { get; set; }

        // 资产名称
        [NameInMap("asset_name")]
        [Validation(Required=false)]
        public string AssetName { get; set; }

        // 跟踪指数代码
        [NameInMap("track_index_code")]
        [Validation(Required=false)]
        public string TrackIndexCode { get; set; }

        // 跟踪指数简称
        [NameInMap("track_index_abbr")]
        [Validation(Required=false)]
        public string TrackIndexAbbr { get; set; }

        // 排序
        [NameInMap("sort_order")]
        [Validation(Required=false)]
        public long? SortOrder { get; set; }

    }

}
