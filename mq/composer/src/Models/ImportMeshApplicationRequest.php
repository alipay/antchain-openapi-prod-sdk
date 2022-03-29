<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ImportMeshApplicationRequest extends Model
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

    // 应用id
    /**
     * @var int
     */
    public $id;

    // 应用名
    /**
     * @var string
     */
    public $name;

    // 服务端get队列
    /**
     * @var string
     */
    public $pubGetQueue;

    // 服务端put队列
    /**
     * @var string
     */
    public $pubPutQueue;

    // 服务端rpc开关
    /**
     * @var int
     */
    public $pubRpcStatus;

    // 客户端get队列
    /**
     * @var string
     */
    public $subGetQueue;

    // 客户端put队列
    /**
     * @var string
     */
    public $subPutQueue;

    // 客户端rpc分流比例
    /**
     * @var int
     */
    public $subRpcScale;

    // 服务类型
    /**
     * @var string
     */
    public $type;

    // 服务id列表
    /**
     * @var ApplicationServiceDTO[]
     */
    public $list;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'id'                => 'id',
        'name'              => 'name',
        'pubGetQueue'       => 'pub_get_queue',
        'pubPutQueue'       => 'pub_put_queue',
        'pubRpcStatus'      => 'pub_rpc_status',
        'subGetQueue'       => 'sub_get_queue',
        'subPutQueue'       => 'sub_put_queue',
        'subRpcScale'       => 'sub_rpc_scale',
        'type'              => 'type',
        'list'              => 'list',
    ];

    public function validate()
    {
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('type', $this->type, true);
        Model::validateRequired('list', $this->list, true);
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pubGetQueue) {
            $res['pub_get_queue'] = $this->pubGetQueue;
        }
        if (null !== $this->pubPutQueue) {
            $res['pub_put_queue'] = $this->pubPutQueue;
        }
        if (null !== $this->pubRpcStatus) {
            $res['pub_rpc_status'] = $this->pubRpcStatus;
        }
        if (null !== $this->subGetQueue) {
            $res['sub_get_queue'] = $this->subGetQueue;
        }
        if (null !== $this->subPutQueue) {
            $res['sub_put_queue'] = $this->subPutQueue;
        }
        if (null !== $this->subRpcScale) {
            $res['sub_rpc_scale'] = $this->subRpcScale;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->list) {
            $res['list'] = [];
            if (null !== $this->list && \is_array($this->list)) {
                $n = 0;
                foreach ($this->list as $item) {
                    $res['list'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportMeshApplicationRequest
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
        if (isset($map['id'])) {
            $model->id = $map['id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['pub_get_queue'])) {
            $model->pubGetQueue = $map['pub_get_queue'];
        }
        if (isset($map['pub_put_queue'])) {
            $model->pubPutQueue = $map['pub_put_queue'];
        }
        if (isset($map['pub_rpc_status'])) {
            $model->pubRpcStatus = $map['pub_rpc_status'];
        }
        if (isset($map['sub_get_queue'])) {
            $model->subGetQueue = $map['sub_get_queue'];
        }
        if (isset($map['sub_put_queue'])) {
            $model->subPutQueue = $map['sub_put_queue'];
        }
        if (isset($map['sub_rpc_scale'])) {
            $model->subRpcScale = $map['sub_rpc_scale'];
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['list'])) {
            if (!empty($map['list'])) {
                $model->list = [];
                $n           = 0;
                foreach ($map['list'] as $item) {
                    $model->list[$n++] = null !== $item ? ApplicationServiceDTO::fromMap($item) : $item;
                }
            }
        }

        return $model;
    }
}
