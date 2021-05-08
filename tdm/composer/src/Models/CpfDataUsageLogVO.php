<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class CpfDataUsageLogVO extends Model
{
    // 使用方名称
    /**
     * @example 招商银行
     *
     * @var string
     */
    public $userName;

    // 使用时间
    /**
     * @example 2021-05-06 20:54:29
     *
     * @var string
     */
    public $usageTime;

    // 数据项描述
    /**
     * @example 缴存证明
     *
     * @var string
     */
    public $dataDesc;

    // 用途
    /**
     * @example 住房贷款
     *
     * @var string
     */
    public $purpose;

    // 业务流水号
    /**
     * @example 20201125010000RD831500012865
     *
     * @var string
     */
    public $bizId;
    protected $_name = [
        'userName'  => 'user_name',
        'usageTime' => 'usage_time',
        'dataDesc'  => 'data_desc',
        'purpose'   => 'purpose',
        'bizId'     => 'biz_id',
    ];

    public function validate()
    {
        Model::validateRequired('userName', $this->userName, true);
        Model::validateRequired('usageTime', $this->usageTime, true);
        Model::validateRequired('dataDesc', $this->dataDesc, true);
        Model::validateRequired('purpose', $this->purpose, true);
        Model::validateRequired('bizId', $this->bizId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->userName) {
            $res['user_name'] = $this->userName;
        }
        if (null !== $this->usageTime) {
            $res['usage_time'] = $this->usageTime;
        }
        if (null !== $this->dataDesc) {
            $res['data_desc'] = $this->dataDesc;
        }
        if (null !== $this->purpose) {
            $res['purpose'] = $this->purpose;
        }
        if (null !== $this->bizId) {
            $res['biz_id'] = $this->bizId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CpfDataUsageLogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['user_name'])) {
            $model->userName = $map['user_name'];
        }
        if (isset($map['usage_time'])) {
            $model->usageTime = $map['usage_time'];
        }
        if (isset($map['data_desc'])) {
            $model->dataDesc = $map['data_desc'];
        }
        if (isset($map['purpose'])) {
            $model->purpose = $map['purpose'];
        }
        if (isset($map['biz_id'])) {
            $model->bizId = $map['biz_id'];
        }

        return $model;
    }
}
