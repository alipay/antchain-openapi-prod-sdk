<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ListTransactionCorrectionsRequest extends Model
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

    // aaa
    /**
     * @var string
     */
    public $actionType;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // instanceId
    /**
     * @var string
     */
    public $instanceId;

    // id desc
    /**
     * @var OrderByParams[]
     */
    public $orderBy;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // 0 已提交 4 成功
    /**
     * @var string
     */
    public $state;

    // app_name
    /**
     * @var string
     */
    public $appName;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'actionType'        => 'action_type',
        'currentPage'       => 'current_page',
        'instanceId'        => 'instance_id',
        'orderBy'           => 'order_by',
        'pageSize'          => 'page_size',
        'state'             => 'state',
        'appName'           => 'app_name',
    ];

    public function validate()
    {
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('instanceId', $this->instanceId, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
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
        if (null !== $this->actionType) {
            $res['action_type'] = $this->actionType;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->instanceId) {
            $res['instance_id'] = $this->instanceId;
        }
        if (null !== $this->orderBy) {
            $res['order_by'] = [];
            if (null !== $this->orderBy && \is_array($this->orderBy)) {
                $n = 0;
                foreach ($this->orderBy as $item) {
                    $res['order_by'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListTransactionCorrectionsRequest
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
        if (isset($map['action_type'])) {
            $model->actionType = $map['action_type'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['instance_id'])) {
            $model->instanceId = $map['instance_id'];
        }
        if (isset($map['order_by'])) {
            if (!empty($map['order_by'])) {
                $model->orderBy = [];
                $n              = 0;
                foreach ($map['order_by'] as $item) {
                    $model->orderBy[$n++] = null !== $item ? OrderByParams::fromMap($item) : $item;
                }
            }
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }

        return $model;
    }
}
