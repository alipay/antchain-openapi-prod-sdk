<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UserOplogDO extends Model
{
    // 操作记录ID
    /**
     * @example 315
     *
     * @var int
     */
    public $id;

    // 表名
    /**
     * @example stackGeneratedConfig
     *
     * @var string
     */
    public $tableName;

    // 表实体对应ID
    /**
     * @example 8
     *
     * @var int
     */
    public $tableEntityId;

    // 操作类型(可以是CREATE、UPDATE、DELETE)
    /**
     * @example CREATE
     *
     * @var string
     */
    public $opType;

    // 操作时间 (直接取日志创建时间)
    /**
     * @example 1617245480725
     *
     * @var int
     */
    public $gmtCreate;

    // 操作人
    /**
     * @example the login name
     *
     * @var string
     */
    public $creater;

    // tableName+table_entity_id，方便查询
    /**
     * @example workspace-3
     *
     * @var string
     */
    public $combineQuery;

    // 实体类型
    /**
     * @example cms
     *
     * @var string
     */
    public $entityType;

    // 名称
    /**
     * @example the cms name
     *
     * @var string
     */
    public $name;

    // 操作前的内容 (JSON String)
    /**
     * @example {"id":3,"name":"FIN-DEV-AKE2.0","displayName":"FIN-DEV-AKE2.0","outsideWsId":"73040000000007","tenantId":1,"outsideTenantId":"paas_outsidetenant_id"}
     *
     * @var string
     */
    public $opBeforeContext;

    // 操作后的内容 (JSON String)
    /**
     * @example {"id":3,"name":"FIN-DEV-AKE2.0","displayName":"FIN-DEV-AKE2.0","outsideWsId":"73040000000007","tenantId":1,"outsideTenantId":"paas_outsidetenant_id"}
     *
     * @var string
     */
    public $opAfterContext;
    protected $_name = [
        'id'              => 'id',
        'tableName'       => 'table_name',
        'tableEntityId'   => 'table_entity_id',
        'opType'          => 'op_type',
        'gmtCreate'       => 'gmt_create',
        'creater'         => 'creater',
        'combineQuery'    => 'combine_query',
        'entityType'      => 'entity_type',
        'name'            => 'name',
        'opBeforeContext' => 'op_before_context',
        'opAfterContext'  => 'op_after_context',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('tableName', $this->tableName, true);
        Model::validateRequired('tableEntityId', $this->tableEntityId, true);
        Model::validateRequired('opType', $this->opType, true);
        Model::validateRequired('gmtCreate', $this->gmtCreate, true);
        Model::validateRequired('creater', $this->creater, true);
        Model::validateRequired('combineQuery', $this->combineQuery, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->tableName) {
            $res['table_name'] = $this->tableName;
        }
        if (null !== $this->tableEntityId) {
            $res['table_entity_id'] = $this->tableEntityId;
        }
        if (null !== $this->opType) {
            $res['op_type'] = $this->opType;
        }
        if (null !== $this->gmtCreate) {
            $res['gmt_create'] = $this->gmtCreate;
        }
        if (null !== $this->creater) {
            $res['creater'] = $this->creater;
        }
        if (null !== $this->combineQuery) {
            $res['combine_query'] = $this->combineQuery;
        }
        if (null !== $this->entityType) {
            $res['entity_type'] = $this->entityType;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->opBeforeContext) {
            $res['op_before_context'] = $this->opBeforeContext;
        }
        if (null !== $this->opAfterContext) {
            $res['op_after_context'] = $this->opAfterContext;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UserOplogDO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['table_name'])) {
            $model->tableName = $map['table_name'];
        }
        if (isset($map['table_entity_id'])) {
            $model->tableEntityId = $map['table_entity_id'];
        }
        if (isset($map['op_type'])) {
            $model->opType = $map['op_type'];
        }
        if (isset($map['gmt_create'])) {
            $model->gmtCreate = $map['gmt_create'];
        }
        if (isset($map['creater'])) {
            $model->creater = $map['creater'];
        }
        if (isset($map['combine_query'])) {
            $model->combineQuery = $map['combine_query'];
        }
        if (isset($map['entity_type'])) {
            $model->entityType = $map['entity_type'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['op_before_context'])) {
            $model->opBeforeContext = $map['op_before_context'];
        }
        if (isset($map['op_after_context'])) {
            $model->opAfterContext = $map['op_after_context'];
        }

        return $model;
    }
}
