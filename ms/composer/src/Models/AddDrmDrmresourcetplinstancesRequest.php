<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MS\Models;

use AlibabaCloud\Tea\Model;

class AddDrmDrmresourcetplinstancesRequest extends Model
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

    // 资源信息列表
    /**
     * @var string
     */
    public $params;

    // tpl id
    /**
     * @var int
     */
    public $tplId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'instanceId'        => 'instance_id',
        'params'            => 'params',
        'tplId'             => 'tpl_id',
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
        if (null !== $this->params) {
            $res['params'] = $this->params;
        }
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return AddDrmDrmresourcetplinstancesRequest
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
        if (isset($map['params'])) {
            $model->params = $map['params'];
        }
        if (isset($map['tpl_id'])) {
            $model->tplId = $map['tpl_id'];
        }

        return $model;
    }
}
