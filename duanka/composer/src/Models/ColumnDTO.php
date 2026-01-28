<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DUANKA\Models;

use AlibabaCloud\Tea\Model;

class ColumnDTO extends Model
{
    // tableGuid
    /**
     * @example tableGuid
     *
     * @var string
     */
    public $tableGuid;

    // name
    /**
     * @example name
     *
     * @var string
     */
    public $name;

    // desc
    /**
     * @example desc
     *
     * @var string
     */
    public $desc;

    // dataType
    /**
     * @example dataType
     *
     * @var string
     */
    public $dataType;

    // columnSeq
    /**
     * @example columnSeq
     *
     * @var int
     */
    public $columnSeq;

    // securityLevel
    /**
     * @example securityLevel
     *
     * @var string
     */
    public $securityLevel;

    // true, false
    /**
     * @example true, false
     *
     * @var bool
     */
    public $isPK;

    // isPartition
    /**
     * @example isPartition
     *
     * @var bool
     */
    public $isPartition;

    // columnId
    /**
     * @example columnId
     *
     * @var string
     */
    public $columnId;

    // code
    /**
     * @example code
     *
     * @var string
     */
    public $code;

    // visitCount
    /**
     * @example visitCount
     *
     * @var int
     */
    public $visitCount;
    protected $_name = [
        'tableGuid'     => 'table_guid',
        'name'          => 'name',
        'desc'          => 'desc',
        'dataType'      => 'data_type',
        'columnSeq'     => 'column_seq',
        'securityLevel' => 'security_level',
        'isPK'          => 'is_p_k',
        'isPartition'   => 'is_partition',
        'columnId'      => 'column_id',
        'code'          => 'code',
        'visitCount'    => 'visit_count',
    ];

    public function validate()
    {
        Model::validateRequired('tableGuid', $this->tableGuid, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('desc', $this->desc, true);
        Model::validateRequired('dataType', $this->dataType, true);
        Model::validateRequired('columnSeq', $this->columnSeq, true);
        Model::validateRequired('securityLevel', $this->securityLevel, true);
        Model::validateRequired('isPK', $this->isPK, true);
        Model::validateRequired('isPartition', $this->isPartition, true);
        Model::validateRequired('columnId', $this->columnId, true);
        Model::validateRequired('code', $this->code, true);
        Model::validateRequired('visitCount', $this->visitCount, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->tableGuid) {
            $res['table_guid'] = $this->tableGuid;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->desc) {
            $res['desc'] = $this->desc;
        }
        if (null !== $this->dataType) {
            $res['data_type'] = $this->dataType;
        }
        if (null !== $this->columnSeq) {
            $res['column_seq'] = $this->columnSeq;
        }
        if (null !== $this->securityLevel) {
            $res['security_level'] = $this->securityLevel;
        }
        if (null !== $this->isPK) {
            $res['is_p_k'] = $this->isPK;
        }
        if (null !== $this->isPartition) {
            $res['is_partition'] = $this->isPartition;
        }
        if (null !== $this->columnId) {
            $res['column_id'] = $this->columnId;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->visitCount) {
            $res['visit_count'] = $this->visitCount;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ColumnDTO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['table_guid'])) {
            $model->tableGuid = $map['table_guid'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['desc'])) {
            $model->desc = $map['desc'];
        }
        if (isset($map['data_type'])) {
            $model->dataType = $map['data_type'];
        }
        if (isset($map['column_seq'])) {
            $model->columnSeq = $map['column_seq'];
        }
        if (isset($map['security_level'])) {
            $model->securityLevel = $map['security_level'];
        }
        if (isset($map['is_p_k'])) {
            $model->isPK = $map['is_p_k'];
        }
        if (isset($map['is_partition'])) {
            $model->isPartition = $map['is_partition'];
        }
        if (isset($map['column_id'])) {
            $model->columnId = $map['column_id'];
        }
        if (isset($map['code'])) {
            $model->code = $map['code'];
        }
        if (isset($map['visit_count'])) {
            $model->visitCount = $map['visit_count'];
        }

        return $model;
    }
}
