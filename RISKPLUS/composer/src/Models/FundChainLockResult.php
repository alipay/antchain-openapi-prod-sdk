<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class FundChainLockResult extends Model
{
    // 店铺名称
    /**
     * @example 某店铺
     *
     * @var string
     */
    public $name;

    // 店铺id
    /**
     * @example 2022091300001
     *
     * @var string
     */
    public $id;

    // 0:成功
    // 1:失败
    // 2:处理中
    /**
     * @example 0
     *
     * @var string
     */
    public $status;
    protected $_name = [
        'name'   => 'name',
        'id'     => 'id',
        'status' => 'status',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('status', $this->status, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return FundChainLockResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
