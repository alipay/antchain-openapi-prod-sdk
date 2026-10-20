// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IOTAGENT.Models
{
    public class ListfilesBlockchainBotIotagentSessionResponse : TeaModel {
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

        // 空间id
        [NameInMap("workspace_id")]
        [Validation(Required=false)]
        public string WorkspaceId { get; set; }

        // 文件列表
        [NameInMap("data")]
        [Validation(Required=false)]
        public List<FileInfo> Data { get; set; }

        // 总记录
        [NameInMap("total")]
        [Validation(Required=false)]
        public long? Total { get; set; }

        // 10
        [NameInMap("pages")]
        [Validation(Required=false)]
        public long? Pages { get; set; }

        // 当前页面
        [NameInMap("page_index")]
        [Validation(Required=false)]
        public long? PageIndex { get; set; }

        // 页面大小
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

    }

}
