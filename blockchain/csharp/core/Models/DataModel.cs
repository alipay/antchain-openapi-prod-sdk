// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 授权服务数据模型结构体
    public class DataModel : TeaModel {
        // 业务系统唯一标示
        [NameInMap("biz_uid")]
        [Validation(Required=false)]
        public string BizUid { get; set; }

        // 空间ID
        [NameInMap("space_id")]
        [Validation(Required=true)]
        public string SpaceId { get; set; }

        // 创建时间
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 数据模型描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 模型字段详细信息
        [NameInMap("field_detail")]
        [Validation(Required=true)]
        public string FieldDetail { get; set; }

        // 数据模型业务ID
        [NameInMap("model_biz_id")]
        [Validation(Required=false)]
        public string ModelBizId { get; set; }

        // 数据模型ID
        [NameInMap("model_id")]
        [Validation(Required=true)]
        public string ModelId { get; set; }

        // 数据模型名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 提交人
        [NameInMap("submitter")]
        [Validation(Required=true)]
        public Participant Submitter { get; set; }

        // 更新时间
        [NameInMap("update_time")]
        [Validation(Required=true)]
        public long? UpdateTime { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
