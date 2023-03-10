// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AIIDENTIFY.Models
{
    public class OperateFileuploadGetsignedurlResponse : TeaModel {
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

        // 文件ID(用于 提交数据进行AI鉴定 时图片对应的属性值)
        [NameInMap("file_id")]
        [Validation(Required=false)]
        public string FileId { get; set; }

        // oss上传文件链接
        [NameInMap("oss_url")]
        [Validation(Required=false)]
        public string OssUrl { get; set; }

        // oss上传文件时的ossKey值 
        [NameInMap("oss_key")]
        [Validation(Required=false)]
        public string OssKey { get; set; }

    }

}
