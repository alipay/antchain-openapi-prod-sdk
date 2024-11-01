<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DEMOSDKSY\Models;

use AlibabaCloud\Tea\Model;

class QueryBbbCccRequest extends Model
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

    // 姓名
    /**
     * @var string
     */
    public $name;

    // fd
    /**
     * @var string
     */
    public $tes;

    // 测试
    /**
     * @var TessReq
     */
    public $testReq;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'name'              => 'name',
        'tes'               => 'tes',
        'testReq'           => 'test_req',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('testReq', $this->testReq, true);
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->tes) {
            $res['tes'] = $this->tes;
        }
        if (null !== $this->testReq) {
            $res['test_req'] = null !== $this->testReq ? $this->testReq->toMap() : null;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryBbbCccRequest
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
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['tes'])) {
            $model->tes = $map['tes'];
        }
        if (isset($map['test_req'])) {
            $model->testReq = TessReq::fromMap($map['test_req']);
        }

        return $model;
    }
}
