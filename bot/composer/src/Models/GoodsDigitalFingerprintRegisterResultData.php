<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BOT\Models;

use AlibabaCloud\Tea\Model;

class GoodsDigitalFingerprintRegisterResultData extends Model
{
    // 指纹图片入库是否成功
    /**
     * @example true
     *
     * @var bool
     */
    public $success;

    // 失败原因
    /**
     * @example describe
     *
     * @var string
     */
    public $describe;
    protected $_name = [
        'success'  => 'success',
        'describe' => 'describe',
    ];

    public function validate()
    {
        Model::validateRequired('success', $this->success, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->success) {
            $res['success'] = $this->success;
        }
        if (null !== $this->describe) {
            $res['describe'] = $this->describe;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GoodsDigitalFingerprintRegisterResultData
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['success'])) {
            $model->success = $map['success'];
        }
        if (isset($map['describe'])) {
            $model->describe = $map['describe'];
        }

        return $model;
    }
}
