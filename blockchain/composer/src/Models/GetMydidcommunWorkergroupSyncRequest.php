<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\BLOCKCHAIN\Models;

use AlibabaCloud\Tea\Model;

class GetMydidcommunWorkergroupSyncRequest extends Model
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

    // 计算集群群组代号
    /**
     * @var string
     */
    public $groupCode;

    // 环境名称
    /**
     * @var string
     */
    public $env;

    // 主节点
    /**
     * @var string
     */
    public $masterNode;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'groupCode'         => 'group_code',
        'env'               => 'env',
        'masterNode'        => 'master_node',
    ];

    public function validate()
    {
        Model::validateRequired('groupCode', $this->groupCode, true);
        Model::validateRequired('env', $this->env, true);
        Model::validateRequired('masterNode', $this->masterNode, true);
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
        if (null !== $this->groupCode) {
            $res['group_code'] = $this->groupCode;
        }
        if (null !== $this->env) {
            $res['env'] = $this->env;
        }
        if (null !== $this->masterNode) {
            $res['master_node'] = $this->masterNode;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return GetMydidcommunWorkergroupSyncRequest
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
        if (isset($map['group_code'])) {
            $model->groupCode = $map['group_code'];
        }
        if (isset($map['env'])) {
            $model->env = $map['env'];
        }
        if (isset($map['master_node'])) {
            $model->masterNode = $map['master_node'];
        }

        return $model;
    }
}
