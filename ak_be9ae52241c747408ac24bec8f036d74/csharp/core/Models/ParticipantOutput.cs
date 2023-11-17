// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models
{
    // 参与方输出配置参数
    public class ParticipantOutput : TeaModel {
        // 授权至项目内的数据源ID
        [NameInMap("auth_datasource_id")]
        [Validation(Required=false)]
        public string AuthDatasourceId { get; set; }

        // 输出表名
        [NameInMap("table_name")]
        [Validation(Required=false)]
        public string TableName { get; set; }

        // 输出类型，本期仅支持FULL
        [NameInMap("write_type")]
        [Validation(Required=false)]
        public string WriteType { get; set; }

    }

}
