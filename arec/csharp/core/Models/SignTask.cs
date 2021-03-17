// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 签署任务
    public class SignTask : TeaModel {
        // 文件路径
        [NameInMap("file_path")]
        [Validation(Required=true)]
        public string FilePath { get; set; }

        // 签署信息列表
        [NameInMap("sign_info_list")]
        [Validation(Required=true)]
        public List<SignInfo> SignInfoList { get; set; }

        // 签署文档类型，支持类型：APPLY_FORM("申请表")、INQUIRY_FORM("询问表")、MORT_CONTACT("抵押合同")、OTHER_CONTACT("其他合同")
        [NameInMap("sign_document_type")]
        [Validation(Required=true)]
        public string SignDocumentType { get; set; }

    }

}
