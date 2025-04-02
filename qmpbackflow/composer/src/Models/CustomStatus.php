<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RISKPLUS\Models;

use AlibabaCloud\Tea\Model;

class CustomStatus extends Model
{
    // 是否进行过授信申请
    /**
     * @example true, false
     *
     * @var bool
     */
    public $applyFlag;

    // 0:通过； 1:拒绝； 2:处理中；
    /**
     * @example 0
     *
     * @var string
     */
    public $status;

    // 拒绝原因
    /**
     * @example xxxxxxxx
     *
     * @var string
     */
    public $msg;
    protected $_name = [
        'applyFlag' => 'apply_flag',
        'status'    => 'status',
        'msg'       => 'msg',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->applyFlag) {
            $res['apply_flag'] = $this->applyFlag;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CustomStatus
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['apply_flag'])) {
            $model->applyFlag = $map['apply_flag'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }

        return $model;
    }
}
