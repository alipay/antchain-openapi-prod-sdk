// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    public class SubmitDatapinTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 任务描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // operator
        [NameInMap("operator")]
        [Validation(Required=true)]
        public string Operator { get; set; }

        // projectId
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // projectTaskPath
        [NameInMap("project_task_path")]
        [Validation(Required=true)]
        public string ProjectTaskPath { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // params
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

        // ossDsId
        [NameInMap("oss_ds_id")]
        [Validation(Required=false)]
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
        [Validation(Required=false)]
        public string OdpsDsName { get; set; }

        // odpsProjectName
        [NameInMap("odps_project_name")]
        [Validation(Required=true)]
        public string OdpsProjectName { get; set; }

        // odpsTableName
        [NameInMap("odps_table_name")]
        [Validation(Required=false)]
        public string OdpsTableName { get; set; }

        // odpsGuidTableName
        [NameInMap("odps_guid_table_name")]
        [Validation(Required=true)]
        public string OdpsGuidTableName { get; set; }

        // partitionCondition
        [NameInMap("partition_condition")]
        [Validation(Required=false)]
        public string PartitionCondition { get; set; }

        // where
        [NameInMap("where")]
        [Validation(Required=false)]
        public string Where { get; set; }

        // columnList
        [NameInMap("column_list")]
        [Validation(Required=false)]
        public List<string> ColumnList { get; set; }

        // ossPath
        [NameInMap("oss_path")]
        [Validation(Required=true)]
        public string OssPath { get; set; }

        // ossFilename
        [NameInMap("oss_filename")]
        [Validation(Required=true)]
        public string OssFilename { get; set; }

    }

}
