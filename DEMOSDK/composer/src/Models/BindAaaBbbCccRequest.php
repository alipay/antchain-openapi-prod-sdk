<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class BindAaaBbbCccRequest extends Model
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

    // 123
    /**
     * @var string
     */
    public $date;

    // 123
    /**
     * @var string
     */
    public $data;

    // 测试参数
    /**
     * @var DemoClass
     */
    public $demoClass;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'date'              => 'date',
        'data'              => 'data',
        'demoClass'         => 'demo_class',
    ];

    public function validate()
    {
        Model::validateRequired('date', $this->date, true);
        Model::validateRequired('data', $this->data, true);
        Model::validateRequired('demoClass', $this->demoClass, true);
        Model::validatePattern('date', $this->date, '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})');
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
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        if (null !== $this->demoClass) {
            $res['demo_class'] = null !== $this->demoClass ? $this->demoClass->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return BindAaaBbbCccRequest
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
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }
        if (isset($map['data'])) {
            $model->data = $map['data'];
        }
        if (isset($map['demo_class'])) {
            $model->demoClass = DemoClass::fromMap($map['demo_class']);
        }

        return $model;
    }
}
