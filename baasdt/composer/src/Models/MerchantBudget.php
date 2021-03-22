<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BAASDT\Models;

use AlibabaCloud\Tea\Model;

class MerchantBudget extends Model
{
    // 积分库代码
    /**
     * @example 1234546
     *
     * @var string
     */
    public $pointLibCode;

    // 预算库代码
    /**
     * @example 1234567
     *
     * @var string
     */
    public $budgetCode;

    // 预算库描述
    /**
     * @example budget
     *
     * @var string
     */
    public $budgetDesc;

    // 预算库启用时间
    /**
     * @example 2020-06-01-20:20:20
     *
     * @var string
     */
    public $budgetStartTime;

    // 预算库截止时间
    /**
     * @example 2020-06-01-20:20:20
     *
     * @var string
     */
    public $budgetEndTime;
    protected $_name = [
        'pointLibCode'    => 'point_lib_code',
        'budgetCode'      => 'budget_code',
        'budgetDesc'      => 'budget_desc',
        'budgetStartTime' => 'budget_start_time',
        'budgetEndTime'   => 'budget_end_time',
    ];

    public function validate()
    {
        Model::validateRequired('pointLibCode', $this->pointLibCode, true);
        Model::validateRequired('budgetCode', $this->budgetCode, true);
        Model::validateRequired('budgetDesc', $this->budgetDesc, true);
        Model::validateRequired('budgetStartTime', $this->budgetStartTime, true);
        Model::validateRequired('budgetEndTime', $this->budgetEndTime, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->pointLibCode) {
            $res['point_lib_code'] = $this->pointLibCode;
        }
        if (null !== $this->budgetCode) {
            $res['budget_code'] = $this->budgetCode;
        }
        if (null !== $this->budgetDesc) {
            $res['budget_desc'] = $this->budgetDesc;
        }
        if (null !== $this->budgetStartTime) {
            $res['budget_start_time'] = $this->budgetStartTime;
        }
        if (null !== $this->budgetEndTime) {
            $res['budget_end_time'] = $this->budgetEndTime;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return MerchantBudget
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['point_lib_code'])) {
            $model->pointLibCode = $map['point_lib_code'];
        }
        if (isset($map['budget_code'])) {
            $model->budgetCode = $map['budget_code'];
        }
        if (isset($map['budget_desc'])) {
            $model->budgetDesc = $map['budget_desc'];
        }
        if (isset($map['budget_start_time'])) {
            $model->budgetStartTime = $map['budget_start_time'];
        }
        if (isset($map['budget_end_time'])) {
            $model->budgetEndTime = $map['budget_end_time'];
        }

        return $model;
    }
}
