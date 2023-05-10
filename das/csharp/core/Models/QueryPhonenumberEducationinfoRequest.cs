// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryPhonenumberEducationinfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据源id
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 用户是否已授权
        [NameInMap("user_authed")]
        [Validation(Required=true)]
        public bool? UserAuthed { get; set; }

        // 该接口对应的授权协议索引号
        [NameInMap("file_index")]
        [Validation(Required=true)]
        public string FileIndex { get; set; }

        // 用户姓名
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 用户手机号
        [NameInMap("user_tel")]
        [Validation(Required=false)]
        public string UserTel { get; set; }

        // 身份证号
        [NameInMap("user_cert_no")]
        [Validation(Required=false)]
        public string UserCertNo { get; set; }

        // 类型指示码
        [NameInMap("type_code")]
        [Validation(Required=true)]
        public string TypeCode { get; set; }

    }

}
