<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqConnectorrecordRequest extends Model
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

    // 任务执行摘要
    /**
     * @var InstanceDigest
     */
    public $digest;

    // 任务名称
    /**
     * @var string
     */
    public $name;

    // 时间，本字段已经废除，不需要传递
    /**
     * @var string
     */
    public $date;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'digest'            => 'digest',
        'name'              => 'name',
        'date'              => 'date',
    ];

    public function validate()
    {
        Model::validateRequired('digest', $this->digest, true);
        Model::validateRequired('name', $this->name, true);
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
        if (null !== $this->digest) {
            $res['digest'] = null !== $this->digest ? $this->digest->toMap() : null;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->date) {
            $res['date'] = $this->date;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqConnectorrecordRequest
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
        if (isset($map['digest'])) {
            $model->digest = InstanceDigest::fromMap($map['digest']);
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['date'])) {
            $model->date = $map['date'];
        }

        return $model;
    }
}
