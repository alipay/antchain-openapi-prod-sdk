// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NFTC.Models
{
    public class QueryResourcePatchlistResponse : TeaModel {
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

        // 差量包生成状态，包括PATCHING（生成中）和FINISHED（生成完成）
        [NameInMap("patch_status")]
        [Validation(Required=false)]
        public string PatchStatus { get; set; }

        // 全量包下载地址
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 资源ID
        [NameInMap("resource_id")]
        [Validation(Required=false)]
        public string ResourceId { get; set; }

        // 全量包版本号
        [NameInMap("version")]
        [Validation(Required=false)]
        public long? Version { get; set; }

        // 全量包md5摘要值
        [NameInMap("md5")]
        [Validation(Required=false)]
        public string Md5 { get; set; }

        // 全量包文件大小
        [NameInMap("size")]
        [Validation(Required=false)]
        public long? Size { get; set; }

        // 差量包文件信息列表
        [NameInMap("patch_list")]
        [Validation(Required=false)]
        public List<GeneralResourcePatch> PatchList { get; set; }

    }

}
