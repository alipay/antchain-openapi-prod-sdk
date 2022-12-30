<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TAM\Models;

use AlibabaCloud\Tea\Model;

class ResultOncall extends Model
{
    // 是否成功
    /**
     * @example
     *
     * @var string
     */
    public $success;

    // 提示信息
    /**
     * @example
     *
     * @var string
     */
    public $resultMsg;

    // 保存的工单主键id（成功才有）
    /**
     * @example
     *
     * @var string
     */
    public $id;
    protected $_name = [
        'success'   => 'success',
        'resultMsg' => 'result_msg',
        'id'        => 'id',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
        Model::validateRequired('resultMsg', $this->resultMsg, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ResultOncall
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['result_msg'])) {
            $model->resultMsg = $map['result_msg'];
        }
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }

        return $model;
    }
}
