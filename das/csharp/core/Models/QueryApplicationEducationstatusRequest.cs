// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationEducationstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 需求ID
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 用户是否已经授权
        [NameInMap("user_authed")]
        [Validation(Required=true)]
        public bool? UserAuthed { get; set; }

        // 授权文件索引
        [NameInMap("file_index")]
        [Validation(Required=true)]
        public string FileIndex { get; set; }

        // 姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 身份证号
        [NameInMap("user_cert_no")]
        [Validation(Required=true)]
        public string UserCertNo { get; set; }

    }

}
