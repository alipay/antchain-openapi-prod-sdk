// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CREATIVE.Models
{
    public class QueryArkassetListResponse : TeaModel {
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

        // {"ResponseMetadata":{"RequestId":"202405142130001A2B3C4D5E6F708192","Action":"ListAssets","Version":"2024-01-01","Service":"ark","Region":"cn-beijing"},"Result":{"Items":[{"Id":"asset-20240514212750-a3f8k","Name":"demo-portrait-image","URL":"https://ark-asset.cn-beijing.volcengine.com/asset-20240514212750-a3f8k.jpg?X-Amz-Expires=43200","GroupId":"group-20240514212750-b5e9m","AssetType":"Image","Status":"Active","Moderation":{"Strategy":"Default"},"Error":{"Code":"","Message":""},"ProjectName":"default","CreateTime":"2024-05-14T21:27:50Z","UpdateTime":"2024-05-14T21:30:00Z","LastInferenceTime":"2024-05-14T22:15:30Z"}],"NextToken":"****bmNyeXB0ZWRfY3Vyc29yIjoiLi4****"}}
        [NameInMap("response_body")]
        [Validation(Required=false)]
        public string ResponseBody { get; set; }

    }

}
