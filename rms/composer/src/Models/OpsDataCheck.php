<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class OpsDataCheck extends Model
{
    // id
    /**
     * @example 1
     *
     * @var int
     */
    public $id;

    // 指标名称
    /**
     * @example 系统指标
     *
     * @var string
     */
    public $targetName;

    // 指标类型
    /**
     * @example CUSTOM
     *
     * @var string
     */
    public $targetType;

    // 0：异常 1：正常
    /**
     * @example 状态
     *
     * @var int
     */
    public $status;

    // check_result
    /**
     * @example {"checkPoints":[{"threshold":95.0,"expect":2,"actual":2,"attend":100.0,"checkType":"attend"}],"errMsg":"{}"}
     *
     * @var string
     */
    public $checkResult;
    protected $_name = [
        'id'          => 'id',
        'targetName'  => 'target_name',
        'targetType'  => 'target_type',
        'status'      => 'status',
        'checkResult' => 'check_result',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('targetName', $this->targetName, true);
        Model::validateRequired('targetType', $this->targetType, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('checkResult', $this->checkResult, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->targetName) {
            $res['target_name'] = $this->targetName;
        }
        if (null !== $this->targetType) {
            $res['target_type'] = $this->targetType;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->checkResult) {
            $res['check_result'] = $this->checkResult;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpsDataCheck
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['target_name'])) {
            $model->targetName = $map['target_name'];
        }
        if (isset($map['target_type'])) {
            $model->targetType = $map['target_type'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['check_result'])) {
            $model->checkResult = $map['check_result'];
        }

        return $model;
    }
}
