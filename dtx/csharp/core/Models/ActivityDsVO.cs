// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 页面展示的发起方数据源信息
    public class ActivityDsVO : TeaModel {
        // 9
        [NameInMap("action_table_index_end")]
        [Validation(Required=true)]
        public long? ActionTableIndexEnd { get; set; }

        // 0
        [NameInMap("action_table_index_start")]
        [Validation(Required=true)]
        public long? ActionTableIndexStart { get; set; }

        // .
        [NameInMap("action_table_name_format")]
        [Validation(Required=true)]
        public string ActionTableNameFormat { get; set; }

        // activity_table_index_end
        [NameInMap("activity_table_index_end")]
        [Validation(Required=true)]
        public long? ActivityTableIndexEnd { get; set; }

        // a
        [NameInMap("activity_table_index_start")]
        [Validation(Required=true)]
        public long? ActivityTableIndexStart { get; set; }

        // 主事务表
        [NameInMap("activity_table_name_format")]
        [Validation(Required=true)]
        public string ActivityTableNameFormat { get; set; }

        // DB最小连接数
        [NameInMap("db_connect_min")]
        [Validation(Required=true)]
        public long? DbConnectMin { get; set; }

        // DB最大连接数
        [NameInMap("db_conn_max")]
        [Validation(Required=true)]
        public long? DbConnMax { get; set; }

        // 数据库类型
        [NameInMap("db_type")]
        [Validation(Required=true)]
        public long? DbType { get; set; }

        // 统一数据源索引结束值
        [NameInMap("ds_index_end")]
        [Validation(Required=true)]
        public long? DsIndexEnd { get; set; }

        // 统一数据源索引起始值
        [NameInMap("ds_index_start")]
        [Validation(Required=true)]
        public long? DsIndexStart { get; set; }

        // 统一数据源
        [NameInMap("ds_name_format")]
        [Validation(Required=true)]
        public string DsNameFormat { get; set; }

        // 唯一id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 部署模式
        // true：rzone部署，false：gzone部署
        [NameInMap("is_ldc")]
        [Validation(Required=true)]
        public bool? IsLdc { get; set; }

        // true：数据源配置在dtap数据库，false：数据源配置在dds/zdc里。
        [NameInMap("is_local_ds")]
        [Validation(Required=true)]
        public bool? IsLocalDs { get; set; }

        // gzone部署，国际IPAY站点使用
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

        // .
        [NameInMap("task_name_format")]
        [Validation(Required=true)]
        public string TaskNameFormat { get; set; }

        // .
        [NameInMap("task_index_start")]
        [Validation(Required=false)]
        public long? TaskIndexStart { get; set; }

        // .
        [NameInMap("task_index_end")]
        [Validation(Required=false)]
        public long? TaskIndexEnd { get; set; }

    }

}
