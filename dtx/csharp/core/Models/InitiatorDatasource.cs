// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTX.Models
{
    // 发起方数据源
    public class InitiatorDatasource : TeaModel {
        // 分支事务表索引结束点
        [NameInMap("action_table_index_end")]
        [Validation(Required=false)]
        public long? ActionTableIndexEnd { get; set; }

        // 分支事务表索引起始点
        [NameInMap("action_table_index_start")]
        [Validation(Required=false)]
        public long? ActionTableIndexStart { get; set; }

        // 分支事务表模板
        [NameInMap("action_table_name_format")]
        [Validation(Required=false)]
        public string ActionTableNameFormat { get; set; }

        // 主事务表索引结束点
        [NameInMap("activity_table_index_end")]
        [Validation(Required=false)]
        public long? ActivityTableIndexEnd { get; set; }

        // 主事务表索引起始点
        [NameInMap("activity_table_index_start")]
        [Validation(Required=false)]
        public long? ActivityTableIndexStart { get; set; }

        // 主事务表模板
        [NameInMap("activity_table_name_format")]
        [Validation(Required=false)]
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

        // 数据源索引结束点
        [NameInMap("ds_index_end")]
        [Validation(Required=false)]
        public long? DsIndexEnd { get; set; }

        // 数据源索引起始点
        [NameInMap("ds_index_start")]
        [Validation(Required=false)]
        public long? DsIndexStart { get; set; }

        // 数据源名字
        [NameInMap("ds_name_format")]
        [Validation(Required=false)]
        public string DsNameFormat { get; set; }

        // 唯一键，更新时需要
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // 环境唯一标识
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

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

    }

}
