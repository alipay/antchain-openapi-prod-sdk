<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class TableDTO extends Model
{
    // tableId
    /**
     * @example tableId
     *
     * @var string
     */
    public $tableId;

    // subType
    /**
     * @example subType
     *
     * @var string
     */
    public $subType;

    // tableType
    /**
     * @example tableType
     *
     * @var string
     */
    public $tableType;

    // phyFileSize
    /**
     * @example phyFileSize
     *
     * @var int
     */
    public $phyFileSize;

    // tableLifeCycle
    /**
     * @example tableLifeCycle
     *
     * @var string
     */
    public $tableLifeCycle;

    // createTime
    /**
     * @example createTime
     *
     * @var string
     */
    public $createTime;

    // lastDdlTime
    /**
     * @example lastDdlTime
     *
     * @var string
     */
    public $lastDdlTime;

    // nodeIds
    /**
     * @example nodeIds
     *
     * @var string
     */
    public $nodeIds;

    // lastViewTime
    /**
     * @example lastViewTime
     *
     * @var string
     */
    public $lastViewTime;

    // appId
    /**
     * @example appId
     *
     * @var string
     */
    public $appId;

    // partitionKey
    /**
     * @example partitionKey
     *
     * @var string
     */
    public $partitionKey;

    // primaryKey
    /**
     * @example primaryKey
     *
     * @var string
     */
    public $primaryKey;

    // dataLayer
    /**
     * @example dataLayer
     *
     * @var string
     */
    public $dataLayer;

    // owner
    /**
     * @example owner
     *
     * @var string
     */
    public $owner;

    // ownerName
    /**
     * @example ownerName
     *
     * @var string
     */
    public $ownerName;

    // visitCnt3m
    /**
     * @example visitCnt3m
     *
     * @var string
     */
    public $visitCnt3m;

    // env
    /**
     * @example env
     *
     * @var string
     */
    public $env;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // nameCn
    /**
     * @example nameCn
     *
     * @var string
     */
    public $nameCn;

    // gmtDataUpdateTime
    /**
     * @example gmtDataUpdateTime
     *
     * @var string
     */
    public $gmtDataUpdateTime;

    // desc
    /**
     * @example desc
     *
     * @var string
     */
    public $desc;

    // guid
    /**
     * @example guid
     *
     * @var string
     */
    public $guid;

    // logicSubType
    /**
     * @example logicSubType
     *
     * @var string
     */
    public $logicSubType;

    // tenantId
    /**
     * @example tenantId
     *
     * @var string
     */
    public $tenantId;

    // bizUnitId
    /**
     * @example bizUnitId
     *
     * @var string
     */
    public $bizUnitId;

    // bizUnitName
    /**
     * @example bizUnitName
     *
     * @var string
     */
    public $bizUnitName;

    // dataCellId
    /**
     * @example dataCellId
     *
     * @var string
     */
    public $dataCellJd;

    // dataCellName
    /**
     * @example dataCellName
     *
     * @var string
     */
    public $dataCellName;

    // projectId
    /**
     * @example projectId
     *
     * @var string
     */
    public $projectId;

    // projectName
    /**
     * @example projectName
     *
     * @var string
     */
    public $projectName;

    // developMode
    /**
     * @example developMode
     *
     * @var string
     */
    public $developMode;

    // modelType
    /**
     * @example modelType
     *
     * @var string
     */
    public $modelType;

    // parentModelId
    /**
     * @example parentModelId
     *
     * @var string
     */
    public $parentModelId;

    // fileId
    /**
     * @example fileId
     *
     * @var string
     */
    public $fileId;

    // columns
    /**
     * @example columns
     *
     * @var ColumnDTO[]
     */
    public $columns;
    protected $_name = [
        'tableId'           => 'table_id',
        'subType'           => 'sub_type',
        'tableType'         => 'table_type',
        'phyFileSize'       => 'phy_file_size',
        'tableLifeCycle'    => 'table_life_cycle',
        'createTime'        => 'create_time',
        'lastDdlTime'       => 'last_ddl_time',
        'nodeIds'           => 'node_ids',
        'lastViewTime'      => 'last_view_time',
        'appId'             => 'app_id',
        'partitionKey'      => 'partition_key',
        'primaryKey'        => 'primary_key',
        'dataLayer'         => 'data_layer',
        'owner'             => 'owner',
        'ownerName'         => 'owner_name',
        'visitCnt3m'        => 'visit_cnt3m',
        'env'               => 'env',
        'name'              => 'name',
        'nameCn'            => 'name_cn',
        'gmtDataUpdateTime' => 'gmt_data_update_time',
        'desc'              => 'desc',
        'guid'              => 'guid',
        'logicSubType'      => 'logic_sub_type',
        'tenantId'          => 'tenant_id',
        'bizUnitId'         => 'biz_unit_id',
        'bizUnitName'       => 'biz_unit_name',
        'dataCellJd'        => 'data_cell_jd',
        'dataCellName'      => 'data_cell_name',
        'projectId'         => 'project_id',
        'projectName'       => 'project_name',
        'developMode'       => 'develop_mode',
        'modelType'         => 'model_type',
        'parentModelId'     => 'parent_model_id',
        'fileId'            => 'file_id',
        'columns'           => 'columns',
    ];

    public function validate()
    {
        Model::validateRequired('tableId', $this->tableId, true);
        Model::validateRequired('subType', $this->subType, true);
        Model::validateRequired('tableType', $this->tableType, true);
        Model::validateRequired('phyFileSize', $this->phyFileSize, true);
        Model::validateRequired('tableLifeCycle', $this->tableLifeCycle, true);
        Model::validateRequired('createTime', $this->createTime, true);
        Model::validateRequired('lastDdlTime', $this->lastDdlTime, true);
        Model::validateRequired('nodeIds', $this->nodeIds, true);
        Model::validateRequired('lastViewTime', $this->lastViewTime, true);
        Model::validateRequired('appId', $this->appId, true);
        Model::validateRequired('partitionKey', $this->partitionKey, true);
        Model::validateRequired('primaryKey', $this->primaryKey, true);
        Model::validateRequired('dataLayer', $this->dataLayer, true);
        Model::validateRequired('owner', $this->owner, true);
        Model::validateRequired('ownerName', $this->ownerName, true);
        Model::validateRequired('visitCnt3m', $this->visitCnt3m, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('nameCn', $this->nameCn, true);
        Model::validateRequired('gmtDataUpdateTime', $this->gmtDataUpdateTime, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('guid', $this->guid, true);
        Model::validateRequired('logicSubType', $this->logicSubType, true);
        Model::validateRequired('tenantId', $this->tenantId, true);
        Model::validateRequired('bizUnitId', $this->bizUnitId, true);
        Model::validateRequired('bizUnitName', $this->bizUnitName, true);
        Model::validateRequired('dataCellJd', $this->dataCellJd, true);
        Model::validateRequired('dataCellName', $this->dataCellName, true);
        Model::validateRequired('projectId', $this->projectId, true);
        Model::validateRequired('projectName', $this->projectName, true);
        Model::validateRequired('developMode', $this->developMode, true);
        Model::validateRequired('modelType', $this->modelType, true);
        Model::validateRequired('parentModelId', $this->parentModelId, true);
        Model::validateRequired('fileId', $this->fileId, true);
        Model::validateRequired('columns', $this->columns, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tableId) {
            $res['table_id'] = $this->tableId;
        }
        if (null !== $this->subType) {
            $res['sub_type'] = $this->subType;
        }
        if (null !== $this->tableType) {
            $res['table_type'] = $this->tableType;
        }
        if (null !== $this->phyFileSize) {
            $res['phy_file_size'] = $this->phyFileSize;
        }
        if (null !== $this->tableLifeCycle) {
            $res['table_life_cycle'] = $this->tableLifeCycle;
        }
        if (null !== $this->createTime) {
            $res['create_time'] = $this->createTime;
        }
        if (null !== $this->lastDdlTime) {
            $res['last_ddl_time'] = $this->lastDdlTime;
        }
        if (null !== $this->nodeIds) {
            $res['node_ids'] = $this->nodeIds;
        }
        if (null !== $this->lastViewTime) {
            $res['last_view_time'] = $this->lastViewTime;
        }
        if (null !== $this->appId) {
            $res['app_id'] = $this->appId;
        }
        if (null !== $this->partitionKey) {
            $res['partition_key'] = $this->partitionKey;
        }
        if (null !== $this->primaryKey) {
            $res['primary_key'] = $this->primaryKey;
        }
        if (null !== $this->dataLayer) {
            $res['data_layer'] = $this->dataLayer;
        }
        if (null !== $this->owner) {
            $res['owner'] = $this->owner;
        }
        if (null !== $this->ownerName) {
            $res['owner_name'] = $this->ownerName;
        }
        if (null !== $this->visitCnt3m) {
            $res['visit_cnt3m'] = $this->visitCnt3m;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->nameCn) {
            $res['name_cn'] = $this->nameCn;
        }
        if (null !== $this->gmtDataUpdateTime) {
            $res['gmt_data_update_time'] = $this->gmtDataUpdateTime;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->guid) {
            $res['guid'] = $this->guid;
        }
        if (null !== $this->logicSubType) {
            $res['logic_sub_type'] = $this->logicSubType;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->bizUnitId) {
            $res['biz_unit_id'] = $this->bizUnitId;
        }
        if (null !== $this->bizUnitName) {
            $res['biz_unit_name'] = $this->bizUnitName;
        }
        if (null !== $this->dataCellJd) {
            $res['data_cell_jd'] = $this->dataCellJd;
        }
        if (null !== $this->dataCellName) {
            $res['data_cell_name'] = $this->dataCellName;
        }
        if (null !== $this->projectId) {
            $res['project_id'] = $this->projectId;
        }
        if (null !== $this->projectName) {
            $res['project_name'] = $this->projectName;
        }
        if (null !== $this->developMode) {
            $res['develop_mode'] = $this->developMode;
        }
        if (null !== $this->modelType) {
            $res['model_type'] = $this->modelType;
        }
        if (null !== $this->parentModelId) {
            $res['parent_model_id'] = $this->parentModelId;
        }
        if (null !== $this->fileId) {
            $res['file_id'] = $this->fileId;
        }
        if (null !== $this->columns) {
            $res['columns'] = [];
            if (null !== $this->columns && \is_array($this->columns)) {
                $n = 0;
                foreach ($this->columns as $item) {
                    $res['columns'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TableDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['table_id'])) {
            $model->tableId = $map['table_id'];
        }
        if (isset($map['sub_type'])) {
            $model->subType = $map['sub_type'];
        }
        if (isset($map['table_type'])) {
            $model->tableType = $map['table_type'];
        }
        if (isset($map['phy_file_size'])) {
            $model->phyFileSize = $map['phy_file_size'];
        }
        if (isset($map['table_life_cycle'])) {
            $model->tableLifeCycle = $map['table_life_cycle'];
        }
        if (isset($map['create_time'])) {
            $model->createTime = $map['create_time'];
        }
        if (isset($map['last_ddl_time'])) {
            $model->lastDdlTime = $map['last_ddl_time'];
        }
        if (isset($map['node_ids'])) {
            $model->nodeIds = $map['node_ids'];
        }
        if (isset($map['last_view_time'])) {
            $model->lastViewTime = $map['last_view_time'];
        }
        if (isset($map['app_id'])) {
            $model->appId = $map['app_id'];
        }
        if (isset($map['partition_key'])) {
            $model->partitionKey = $map['partition_key'];
        }
        if (isset($map['primary_key'])) {
            $model->primaryKey = $map['primary_key'];
        }
        if (isset($map['data_layer'])) {
            $model->dataLayer = $map['data_layer'];
        }
        if (isset($map['owner'])) {
            $model->owner = $map['owner'];
        }
        if (isset($map['owner_name'])) {
            $model->ownerName = $map['owner_name'];
        }
        if (isset($map['visit_cnt3m'])) {
            $model->visitCnt3m = $map['visit_cnt3m'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['name_cn'])) {
            $model->nameCn = $map['name_cn'];
        }
        if (isset($map['gmt_data_update_time'])) {
            $model->gmtDataUpdateTime = $map['gmt_data_update_time'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['guid'])) {
            $model->guid = $map['guid'];
        }
        if (isset($map['logic_sub_type'])) {
            $model->logicSubType = $map['logic_sub_type'];
        }
        if (isset($map['tenant_id'])) {
            $model->tenantId = $map['tenant_id'];
        }
        if (isset($map['biz_unit_id'])) {
            $model->bizUnitId = $map['biz_unit_id'];
        }
        if (isset($map['biz_unit_name'])) {
            $model->bizUnitName = $map['biz_unit_name'];
        }
        if (isset($map['data_cell_jd'])) {
            $model->dataCellJd = $map['data_cell_jd'];
        }
        if (isset($map['data_cell_name'])) {
            $model->dataCellName = $map['data_cell_name'];
        }
        if (isset($map['project_id'])) {
            $model->projectId = $map['project_id'];
        }
        if (isset($map['project_name'])) {
            $model->projectName = $map['project_name'];
        }
        if (isset($map['develop_mode'])) {
            $model->developMode = $map['develop_mode'];
        }
        if (isset($map['model_type'])) {
            $model->modelType = $map['model_type'];
        }
        if (isset($map['parent_model_id'])) {
            $model->parentModelId = $map['parent_model_id'];
        }
        if (isset($map['file_id'])) {
            $model->fileId = $map['file_id'];
        }
        if (isset($map['columns'])) {
            if (!empty($map['columns'])) {
                $model->columns = [];
                $n              = 0;
                foreach ($map['columns'] as $item) {
                    $model->columns[$n++] = null !== $item ? ColumnDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
