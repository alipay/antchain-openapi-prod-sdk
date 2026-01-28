// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DUANKA.Models
{
    // TableDTO
    public class TableDTO : TeaModel {
        // tableId
        [NameInMap("table_id")]
        [Validation(Required=true)]
        public string TableId { get; set; }

        // subType
        [NameInMap("sub_type")]
        [Validation(Required=true)]
        public string SubType { get; set; }

        // tableType
        [NameInMap("table_type")]
        [Validation(Required=true)]
        public string TableType { get; set; }

        // phyFileSize
        [NameInMap("phy_file_size")]
        [Validation(Required=true)]
        public long? PhyFileSize { get; set; }

        // tableLifeCycle
        [NameInMap("table_life_cycle")]
        [Validation(Required=true)]
        public string TableLifeCycle { get; set; }

        // createTime
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public string CreateTime { get; set; }

        // lastDdlTime
        [NameInMap("last_ddl_time")]
        [Validation(Required=true)]
        public string LastDdlTime { get; set; }

        // nodeIds
        [NameInMap("node_ids")]
        [Validation(Required=true)]
        public string NodeIds { get; set; }

        // lastViewTime
        [NameInMap("last_view_time")]
        [Validation(Required=true)]
        public string LastViewTime { get; set; }

        // appId
        [NameInMap("app_id")]
        [Validation(Required=true)]
        public string AppId { get; set; }

        // partitionKey
        [NameInMap("partition_key")]
        [Validation(Required=true)]
        public string PartitionKey { get; set; }

        // primaryKey
        [NameInMap("primary_key")]
        [Validation(Required=true)]
        public string PrimaryKey { get; set; }

        // dataLayer
        [NameInMap("data_layer")]
        [Validation(Required=true)]
        public string DataLayer { get; set; }

        // owner
        [NameInMap("owner")]
        [Validation(Required=true)]
        public string Owner { get; set; }

        // ownerName
        [NameInMap("owner_name")]
        [Validation(Required=true)]
        public string OwnerName { get; set; }

        // visitCnt3m
        [NameInMap("visit_cnt3m")]
        [Validation(Required=true)]
        public string VisitCnt3m { get; set; }

        // env
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // nameCn
        [NameInMap("name_cn")]
        [Validation(Required=true)]
        public string NameCn { get; set; }

        // gmtDataUpdateTime
        [NameInMap("gmt_data_update_time")]
        [Validation(Required=true)]
        public string GmtDataUpdateTime { get; set; }

        // desc
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

        // guid
        [NameInMap("guid")]
        [Validation(Required=true)]
        public string Guid { get; set; }

        // logicSubType
        [NameInMap("logic_sub_type")]
        [Validation(Required=true)]
        public string LogicSubType { get; set; }

        // tenantId
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // bizUnitId
        [NameInMap("biz_unit_id")]
        [Validation(Required=true)]
        public string BizUnitId { get; set; }

        // bizUnitName
        [NameInMap("biz_unit_name")]
        [Validation(Required=true)]
        public string BizUnitName { get; set; }

        // dataCellId
        [NameInMap("data_cell_jd")]
        [Validation(Required=true)]
        public string DataCellJd { get; set; }

        // dataCellName
        [NameInMap("data_cell_name")]
        [Validation(Required=true)]
        public string DataCellName { get; set; }

        // projectId
        [NameInMap("project_id")]
        [Validation(Required=true)]
        public string ProjectId { get; set; }

        // projectName
        [NameInMap("project_name")]
        [Validation(Required=true)]
        public string ProjectName { get; set; }

        // developMode
        [NameInMap("develop_mode")]
        [Validation(Required=true)]
        public string DevelopMode { get; set; }

        // modelType
        [NameInMap("model_type")]
        [Validation(Required=true)]
        public string ModelType { get; set; }

        // parentModelId
        [NameInMap("parent_model_id")]
        [Validation(Required=true)]
        public string ParentModelId { get; set; }

        // fileId
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

        // columns
        [NameInMap("columns")]
        [Validation(Required=true)]
        public List<ColumnDTO> Columns { get; set; }

    }

}
