<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\IAM\Models;

use AlibabaCloud\Tea\Model;

class QueryPolicyRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 授权对象id
    /**
     * @var string
     */
    public $actorId;

    // 授权对象类型
    /**
     * @var string
     */
    public $actorType;

    // 当前页，默认值为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认值为10
    /**
     * @var int
     */
    public $pageSize;

    // 授权策略所属租户
    /**
     * @var string
     */
    public $tenant;
    protected $_name = [
        'authToken' => 'auth_token',
        'actorId'   => 'actor_id',
        'actorType' => 'actor_type',
        'pageNum'   => 'page_num',
        'pageSize'  => 'page_size',
        'tenant'    => 'tenant',
    ];

    public function validate()
    {
        Model::validateRequired('actorId', $this->actorId, true);
        Model::validateRequired('actorType', $this->actorType, true);
        Model::validateRequired('tenant', $this->tenant, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->actorId) {
            $res['actor_id'] = $this->actorId;
        }
        if (null !== $this->actorType) {
            $res['actor_type'] = $this->actorType;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryPolicyRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['actor_id'])) {
            $model->actorId = $map['actor_id'];
        }
        if (isset($map['actor_type'])) {
            $model->actorType = $map['actor_type'];
        }
        if (isset($map['page_num'])) {
            $model->pageNum = $map['page_num'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['tenant'])) {
            $model->tenant = $map['tenant'];
        }

        return $model;
    }
}
