// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ListDataauthorizationAuthorizationPageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权时间终点
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 授权人ID
        [NameInMap("issuer_id")]
        [Validation(Required=false)]
        public string IssuerId { get; set; }

        // 授权人名字
        [NameInMap("issuer_name")]
        [Validation(Required=false)]
        public string IssuerName { get; set; }

        // 页码
        [NameInMap("page_num")]
        [Validation(Required=true)]
        public long? PageNum { get; set; }

        // 每页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 授权时间起点
        [NameInMap("start_ime")]
        [Validation(Required=false)]
        public long? StartIme { get; set; }

        // 被授权人ID
        [NameInMap("subject_id")]
        [Validation(Required=false)]
        public string SubjectId { get; set; }

        // 被授权人名字
        [NameInMap("subject_name")]
        [Validation(Required=false)]
        public string SubjectName { get; set; }

        // 数据资产ID
        [NameInMap("data_id")]
        [Validation(Required=false)]
        public string DataId { get; set; }

        // 数据模型ID
        [NameInMap("data_model_id")]
        [Validation(Required=false)]
        public string DataModelId { get; set; }

    }

}
