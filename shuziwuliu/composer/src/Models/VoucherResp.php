<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SHUZIWULIU\Models;

use AlibabaCloud\Tea\Model;

class VoucherResp extends Model
{
    // 消息
    /**
     * @example success
     *
     * @var string
     */
    public $msg;
    protected $_name = [
        'msg' => 'msg',
    ];

    public function validate()
    {
        Model::validateRequired('msg', $this->msg, true);
        Model::validateMaxLength('msg', $this->msg, 10);
        Model::validateMinLength('msg', $this->msg, 0);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return VoucherResp
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
