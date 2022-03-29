// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // 链路搜索的数据库配置
    public class TraceSpanSearchDbConfig : TeaModel {
        // tracer插件名
        [NameInMap("tracer_plugin_name")]
        [Validation(Required=true)]
        public string TracerPluginName { get; set; }

        // 数据源tag key
        [NameInMap("datasource_key")]
        [Validation(Required=true)]
        public string DatasourceKey { get; set; }

        // 数据库tag key
        [NameInMap("database_key")]
        [Validation(Required=true)]
        public string DatabaseKey { get; set; }

        // 支持的数据库类型列表
        [NameInMap("supported_db_types")]
        [Validation(Required=true)]
        public List<string> SupportedDbTypes { get; set; }

    }

}
