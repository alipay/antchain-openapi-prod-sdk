// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class SyncOpdsOssRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // ossPath
        [NameInMap("oss_path")]
        [Validation(Required=true)]
        public string OssPath { get; set; }

        // ossFilename
        [NameInMap("oss_filename")]
        [Validation(Required=true)]
        public string OssFilename { get; set; }

        // ossDsId
        [NameInMap("oss_ds_id")]
        [Validation(Required=true)]
        public string OssDsId { get; set; }

        // ossDsName
        [NameInMap("oss_ds_name")]
        [Validation(Required=true)]
        public string OssDsName { get; set; }

        // odpsDsId
        [NameInMap("odps_ds_id")]
        [Validation(Required=true)]
        public string OdpsDsId { get; set; }

        // odpsDsName
        [NameInMap("odps_ds_name")]
        [Validation(Required=true)]
        public string OdpsDsName { get; set; }

        // odpsProjectName
        [NameInMap("odps_project_name")]
        [Validation(Required=true)]
        public string OdpsProjectName { get; set; }

        // odpsTableName
        [NameInMap("odps_table_name")]
        [Validation(Required=true)]
        public string OdpsTableName { get; set; }

        // odpsGuidTableName
        [NameInMap("odps_guid_table_name")]
        [Validation(Required=true)]
        public string OdpsGuidTableName { get; set; }

        // 分区条件
        [NameInMap("partition_condition")]
        [Validation(Required=true)]
        public string PartitionCondition { get; set; }

        // 过滤条件
        [NameInMap("where")]
        [Validation(Required=true)]
        public string Where { get; set; }

        // 字段列表
        [NameInMap("column_list")]
        [Validation(Required=true)]
        public List<string> ColumnList { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // 项目空间id
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // project_task_path
        [NameInMap("project_task_path")]
        [Validation(Required=true)]
        public string ProjectTaskPath { get; set; }

        // 租户id
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
