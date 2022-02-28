<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SP\Models;

use AlibabaCloud\Tea\Model;

class OrderResult extends Model
{
    // 实例Id
    /**
     * @example A0CSCMAYIBANKPWBATNA4F
     *
     * @var string
     */
    public $instanceId;

    // 是否生成成功
    /**
     * @example
     *
     * @var bool
     */
    public $success;
    protected $_name = [
        'instanceId' => 'instance_id',
        'success'    => 'success',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('success', $this->success, true);
        Model::validateMaxLength('instanceId', $this->instanceId, 10);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OrderResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }

        return $model;
    }
}
