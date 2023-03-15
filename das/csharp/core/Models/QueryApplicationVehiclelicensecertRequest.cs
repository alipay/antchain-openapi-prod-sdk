// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DAS.Models
{
    public class QueryApplicationVehiclelicensecertRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 数据集id，开发者提供
        [NameInMap("data_set_id")]
        [Validation(Required=true)]
        public string DataSetId { get; set; }

        // 是否授权
        [NameInMap("user_authed")]
        [Validation(Required=true)]
        public bool? UserAuthed { get; set; }

        // 授权协议索引
        [NameInMap("file_index")]
        [Validation(Required=true)]
        public string FileIndex { get; set; }

        // 车牌号
        [NameInMap("plate_number")]
        [Validation(Required=true)]
        public string PlateNumber { get; set; }

        // 号牌种类，枚举
        [NameInMap("plate_type")]
        [Validation(Required=true)]
        public string PlateType { get; set; }

        // 所有人姓名
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

    }

}
