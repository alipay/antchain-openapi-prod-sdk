<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\DTX\Models;

use AlibabaCloud\Tea\Model;

class ListTransactionDebugsRequest extends Model
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

    // 当前分页
    /**
     * @var int
     */
    public $currentPage;

    // 环境唯一标识
    /**
     * @var string
     */
    public $instanceId;

    // id  desc
    /**
     * @var OrderByParams[]
     */
    public $orderBy;

    // 分页大小
    /**
     * @var int
     */
    public $pageSize;

    // appname
    /**
     * @var string
     */
    public $appName;

    // 1.进行中 4.成功
    /**
     * @var string
     */
    public $state;

    // 1.发起方 2.参与者
    /**
     * @var string
     */
    public $debugType;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'currentPage'       => 'current_page',
        'instanceId'        => 'instance_id',
        'orderBy'           => 'order_by',
        'pageSize'          => 'page_size',
        'appName'           => 'app_name',
        'state'             => 'state',
        'debugType'         => 'debug_type',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->state) {
            $res['state'] = $this->state;
        }
        if (null !== $this->debugType) {
            $res['debug_type'] = $this->debugType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListTransactionDebugsRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['state'])) {
            $model->state = $map['state'];
        }
        if (isset($map['debug_type'])) {
            $model->debugType = $map['debug_type'];
        }

        return $model;
    }
}
