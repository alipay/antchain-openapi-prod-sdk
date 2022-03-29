<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\MQ\Models;

use AlibabaCloud\Tea\Model;

class ListSofamqAdminapiRequest extends Model
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

    // 是否显示创建接口
    /**
     * @var bool
     */
    public $showCreate;

    // 是否显示删除接口
    /**
     * @var bool
     */
    public $showDelete;

    // 是否显示查询接口
    /**
     * @var bool
     */
    public $showRetrieve;

    // 是否显示更新接口
    /**
     * @var bool
     */
    public $showUpdate;

    // 是否显示操作类接口
    /**
     * @var bool
     */
    public $showOperation;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'showCreate'        => 'show_create',
        'showDelete'        => 'show_delete',
        'showRetrieve'      => 'show_retrieve',
        'showUpdate'        => 'show_update',
        'showOperation'     => 'show_operation',
    ];

    public function validate()
    {
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
        if (null !== $this->showCreate) {
            $res['show_create'] = $this->showCreate;
        }
        if (null !== $this->showDelete) {
            $res['show_delete'] = $this->showDelete;
        }
        if (null !== $this->showRetrieve) {
            $res['show_retrieve'] = $this->showRetrieve;
        }
        if (null !== $this->showUpdate) {
            $res['show_update'] = $this->showUpdate;
        }
        if (null !== $this->showOperation) {
            $res['show_operation'] = $this->showOperation;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListSofamqAdminapiRequest
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
        if (isset($map['show_create'])) {
            $model->showCreate = $map['show_create'];
        }
        if (isset($map['show_delete'])) {
            $model->showDelete = $map['show_delete'];
        }
        if (isset($map['show_retrieve'])) {
            $model->showRetrieve = $map['show_retrieve'];
        }
        if (isset($map['show_update'])) {
            $model->showUpdate = $map['show_update'];
        }
        if (isset($map['show_operation'])) {
            $model->showOperation = $map['show_operation'];
        }

        return $model;
    }
}
