<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class OpenTokenRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 申请事项，描述一个事情即可，
    /**
     * @var string
     */
    public $action;

    // 单位为秒
    /**
     * @var int
     */
    public $timeout;

    // 额外的描述信息
    /**
     * @var MapStringToStringEntity[]
     */
    public $options;

    // 此Token用途API对应的入参，应该是一个简单Object
    /**
     * @var string
     */
    public $param;
    protected $_name = [
        'authToken' => 'auth_token',
        'action'    => 'action',
        'timeout'   => 'timeout',
        'options'   => 'options',
        'param'     => 'param',
    ];

    public function validate()
    {
        Model::validateRequired('action', $this->action, true);
        Model::validateRequired('param', $this->param, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->action) {
            $res['action'] = $this->action;
        }
        if (null !== $this->timeout) {
            $res['timeout'] = $this->timeout;
        }
        if (null !== $this->options) {
            $res['options'] = [];
            if (null !== $this->options && \is_array($this->options)) {
                $n = 0;
                foreach ($this->options as $item) {
                    $res['options'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->param) {
            $res['param'] = $this->param;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return OpenTokenRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['action'])) {
            $model->action = $map['action'];
        }
        if (isset($map['timeout'])) {
            $model->timeout = $map['timeout'];
        }
        if (isset($map['options'])) {
            if (!empty($map['options'])) {
                $model->options = [];
                $n              = 0;
                foreach ($map['options'] as $item) {
                    $model->options[$n++] = null !== $item ? MapStringToStringEntity::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['param'])) {
            $model->param = $map['param'];
        }

        return $model;
    }
}
