// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_9705ae7650f74f47b1e8158151cc122f.Models
{
    // 数登上传文件结构体
    public class AdditionalFileInfo : TeaModel {
        // 内容梗概文件fileId
        [NameInMap("content_summary_file_id")]
        [Validation(Required=false)]
        public string ContentSummaryFileId { get; set; }

        // 权利归属证明文件
        [NameInMap("ownership_file_ids")]
        [Validation(Required=false)]
        public List<string> OwnershipFileIds { get; set; }

        // 肖像权授权文件fileId
        [NameInMap("portrait_auth_file_id")]
        [Validation(Required=false)]
        public string PortraitAuthFileId { get; set; }

        // 他人作品授权文件fileId
        [NameInMap("others_work_auth_file_id")]
        [Validation(Required=false)]
        public string OthersWorkAuthFileId { get; set; }

        // 其他文件fileId列表
        [NameInMap("other_file_id_list")]
        [Validation(Required=false)]
        public List<string> OtherFileIdList { get; set; }

        // 商用授权字体授权文件fileId
        [NameInMap("font_authorize_file_id")]
        [Validation(Required=false)]
        public string FontAuthorizeFileId { get; set; }

    }

}
