<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\Ldc\Models;

use AlibabaCloud\Tea\Model;

class ServiceWeight extends Model
{
    // 统一接入名称
    /**
     * @example test
     *
     * @var string
     */
    public $ingressName;

    // 蓝区流量权重，取值0-100
    /**
     * @example 100
     *
     * @var int
     */
    public $blue;

    // 绿区流量权重，取值0-100
    /**
     * @example 0
     *
     * @var int
     */
    public $green;

    // 状态：succeed、updating、fail
    /**
     * @example succeed
     *
     * @var string
     */
    public $status;

    // 错误信息
    /**
     * @example error
     *
     * @var string
     */
    public $message;
    protected $_name = [
        'ingressName' => 'ingress_name',
        'blue'        => 'blue',
        'green'       => 'green',
        'status'      => 'status',
        'message'     => 'message',
    ];

    public function validate()
    {
        Model::validateRequired('ingressName', $this->ingressName, true);
        Model::validateRequired('blue', $this->blue, true);
        Model::validateRequired('green', $this->green, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->ingressName) {
            $res['ingress_name'] = $this->ingressName;
        }
        if (null !== $this->blue) {
            $res['blue'] = $this->blue;
        }
        if (null !== $this->green) {
            $res['green'] = $this->green;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        if (null !== $this->message) {
            $res['message'] = $this->message;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ServiceWeight
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['ingress_name'])) {
            $model->ingressName = $map['ingress_name'];
        }
        if (isset($map['blue'])) {
            $model->blue = $map['blue'];
        }
        if (isset($map['green'])) {
            $model->green = $map['green'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }
        if (isset($map['message'])) {
            $model->message = $map['message'];
        }

        return $model;
    }
}
