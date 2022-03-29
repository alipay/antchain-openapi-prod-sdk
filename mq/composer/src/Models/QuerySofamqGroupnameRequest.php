<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class QuerySofamqGroupnameRequest extends Model
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

    // 实例id
    /**
     * @var string
     */
    public $instanceId;

    // 查询最大数量
    /**
     * @var int
     */
    public $num;

    // 用于模糊搜索的 groupId 关键字
    /**
     * @var string
     */
    public $groupId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'num'               => 'num',
        'groupId'           => 'group_id',
    ];

    public function validate()
    {
        Model::validateRequired('instanceId', $this->instanceId, true);
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
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->num) {
            $res['num'] = $this->num;
        }
        if (null !== $this->groupId) {
            $res['group_id'] = $this->groupId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QuerySofamqGroupnameRequest
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
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['num'])) {
            $model->num = $map['num'];
        }
        if (isset($map['group_id'])) {
            $model->groupId = $map['group_id'];
        }

        return $model;
    }
}
