// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_320bc483f2434f39a3af9ec9f04d3cc0.Models
{
    // 签署任务信息
    public class CaSignTaskRequest : TeaModel {
        // 子业务流水号
        [NameInMap("sub_biz_no")]
        [Validation(Required=true)]
        public string SubBizNo { get; set; }

        // 任务描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 签署人信息
        [NameInMap("sign_user_info_request_list")]
        [Validation(Required=true)]
        public List<CaSignUserInfoRequest> SignUserInfoRequestList { get; set; }

        // 待签署文件列表
        [NameInMap("sign_file_request_list")]
        [Validation(Required=false)]
        public List<CaSignFileRequest> SignFileRequestList { get; set; }

    }

}
