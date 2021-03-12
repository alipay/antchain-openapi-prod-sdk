<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class AccountMappingResult extends Model
{
    // 该账户在链上的唯一标示
    /**
     * @example 1234:1234:123
     *
     * @var string
     */
    public $baccount;

    // 当前账户映射结果描述语句
    /**
     * @example 成功
     *
     * @var string
     */
    public $message;

    // 状态描述符
    /**
     * @example success
     *
     * @var string
     */
    public $status;

    // 自有系统中该账户唯一标示
    /**
     * @example 1234
     *
     * @var string
     */
    public $uid;
    protected $_name = [
        'baccount' => 'baccount',
        'message'  => 'message',
        'status'   => 'status',
        'uid'      => 'uid',
    ];

    public function validate()
    {
        Model::validateRequired('baccount', $this->baccount, true);
        Model::validateRequired('message', $this->message, true);
        Model::validateRequired('status', $this->status, true);
        Model::validateRequired('uid', $this->uid, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->baccount) {
            $res['baccount'] = $this->baccount;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->uid) {
            $res['uid'] = $this->uid;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AccountMappingResult
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['baccount'])) {
            $model->baccount = $map['baccount'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['uid'])) {
            $model->uid = $map['uid'];
        }

        return $model;
    }
}
