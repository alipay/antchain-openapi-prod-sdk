<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

class QueryABCRequest extends Model
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

    // 测试字段
    /**
     * @var DemoClass
     */
    public $test;

    // trse
    /**
     * @var AnotherClass
     */
    public $idcard;

    // 1
    /**
     * @var PersonInfo
     */
    public $person;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'test'              => 'test',
        'idcard'            => 'idcard',
        'person'            => 'person',
    ];

    public function validate()
    {
        Model::validateRequired('test', $this->test, true);
        Model::validateRequired('idcard', $this->idcard, true);
        Model::validateRequired('person', $this->person, true);
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
        if (null !== $this->test) {
            $res['test'] = null !== $this->test ? $this->test->toMap() : null;
        }
        if (null !== $this->idcard) {
            $res['idcard'] = null !== $this->idcard ? $this->idcard->toMap() : null;
        }
        if (null !== $this->person) {
            $res['person'] = null !== $this->person ? $this->person->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryABCRequest
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
        if (isset($map['test'])) {
            $model->test = DemoClass::fromMap($map['test']);
        }
        if (isset($map['idcard'])) {
            $model->idcard = AnotherClass::fromMap($map['idcard']);
        }
        if (isset($map['person'])) {
            $model->person = PersonInfo::fromMap($map['person']);
        }

        return $model;
    }
}
