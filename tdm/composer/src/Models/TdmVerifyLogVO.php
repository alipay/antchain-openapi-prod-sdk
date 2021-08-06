<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TDM\Models;

use AlibabaCloud\Tea\Model;

class TdmVerifyLogVO extends Model
{
    // 1:核身创建成功 2:核身验证通过 3:核身验证失败
    /**
     * @example 1
     *
     * @var string
     */
    public $status;

    // 核身结果描述信息
    /**
     * @example 核身失败
     *
     * @var string
     */
    public $remark;
    protected $_name = [
        'status' => 'status',
        'remark' => 'remark',
    ];

    public function validate()
    {
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('remark', $this->remark, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->remark) {
            $res['remark'] = $this->remark;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return TdmVerifyLogVO
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['remark'])) {
            $model->remark = $map['remark'];
        }

        return $model;
    }
}
