// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class GetApplicationPackageResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 应用发布包所属应用名字
        [NameInMap("app_name")]
        [Validation(Required=false)]
        public string AppName { get; set; }

        // 应用发布包创建时间
        [NameInMap("creation_time")]
        [Validation(Required=false)]
        public string CreationTime { get; set; }

        // 应用发布包下载地址
        [NameInMap("download_url")]
        [Validation(Required=false)]
        public string DownloadUrl { get; set; }

        // 应用发布包的校验码
        [NameInMap("etag")]
        [Validation(Required=false)]
        public string Etag { get; set; }

        // 应用发布包名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 应用发布包备注
        [NameInMap("version_memo")]
        [Validation(Required=false)]
        public string VersionMemo { get; set; }

        // 应用发布包版本
        [NameInMap("version_no")]
        [Validation(Required=false)]
        public string VersionNo { get; set; }

        // 应用发布包所属环境
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
