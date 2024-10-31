// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryDetailcarinfoPesonandlicRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集id，开发者提供
        // 
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 是否授权
        // 
        [NameInMap("user_authed")]
        [Validation(Required=true)]
        public bool? UserAuthed { get; set; }

        // 授权协议索引
        // 
        [NameInMap("file_index")]
        [Validation(Required=true)]
        public string FileIndex { get; set; }

        // 待核验车主姓名
        // 
        [NameInMap("user_name")]
        [Validation(Required=true)]
        public string UserName { get; set; }

        // 待核验车主身份证号
        // 
        [NameInMap("user_cert_no")]
        [Validation(Required=false)]
        public string UserCertNo { get; set; }

        // 号牌号码
        [NameInMap("license_no")]
        [Validation(Required=true)]
        public string LicenseNo { get; set; }

    }

}
