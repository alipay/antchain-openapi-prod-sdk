// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 用户操作记录
    public class UserOplogDO : TeaModel {
        // 操作记录ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 表名
        [NameInMap("table_name")]
        [Validation(Required=true)]
        public string TableName { get; set; }

        // 表实体对应ID
        [NameInMap("table_entity_id")]
        [Validation(Required=true)]
        public long? TableEntityId { get; set; }

        // 操作类型(可以是CREATE、UPDATE、DELETE)
        [NameInMap("op_type")]
        [Validation(Required=true)]
        public string OpType { get; set; }

        // 操作时间 (直接取日志创建时间)
        [NameInMap("gmt_create")]
        [Validation(Required=true)]
        public long? GmtCreate { get; set; }

        // 操作人
        [NameInMap("creater")]
        [Validation(Required=true)]
        public string Creater { get; set; }

        // tableName+table_entity_id，方便查询
        [NameInMap("combine_query")]
        [Validation(Required=true)]
        public string CombineQuery { get; set; }

        // 实体类型
        [NameInMap("entity_type")]
        [Validation(Required=false)]
        public string EntityType { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 操作前的内容 (JSON String)
        [NameInMap("op_before_context")]
        [Validation(Required=false)]
        public string OpBeforeContext { get; set; }

        // 操作后的内容 (JSON String)
        [NameInMap("op_after_context")]
        [Validation(Required=false)]
        public string OpAfterContext { get; set; }

    }

}
