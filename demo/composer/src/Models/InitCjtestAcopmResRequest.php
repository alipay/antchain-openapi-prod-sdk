<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class InitCjtestAcopmResRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 111
    /**
     * @var int
     */
    public $timeout;

    // 11111
    /**
     * @var string
     */
    public $msg;

    // 111
    /**
     * @var string[]
     */
    public $timeout111;

    // 34134
    /**
     * @var AutoCodeModel
     */
    public $msg1111;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'timeout'           => 'timeout',
        'msg'               => 'msg',
        'timeout111'        => 'timeout111',
        'msg1111'           => 'msg1111',
    ];

    public function validate()
    {
        Model::validateRequired('timeout', $this->timeout, true);
        Model::validateRequired('msg', $this->msg, true);
        Model::validateRequired('timeout111', $this->timeout111, true);
        Model::validateRequired('msg1111', $this->msg1111, true);
        Model::validatePattern('msg', $this->msg, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->msg) {
            $res['msg'] = $this->msg;
        }
        if (null !== $this->timeout111) {
            $res['timeout111'] = $this->timeout111;
        }
        if (null !== $this->msg1111) {
            $res['msg1111'] = null !== $this->msg1111 ? $this->msg1111->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return InitCjtestAcopmResRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['msg'])) {
            $model->msg = $map['msg'];
        }
        if (isset($map['timeout111'])) {
            if (!empty($map['timeout111'])) {
                $model->timeout111 = $map['timeout111'];
            }
        }
        if (isset($map['msg1111'])) {
            $model->msg1111 = AutoCodeModel::fromMap($map['msg1111']);
        }

        return $model;
    }
}
