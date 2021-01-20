<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryAppPlanRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'appName' => 'app_name',
        'orders' => 'orders',
        'orderId' => 'order_id',
        'pageNum' => 'page_num',
        'pageSize' => 'page_size',
        'stateList' => 'state_list',
        'workspace' => 'workspace',
        'workspaceIds' => 'workspace_ids',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->orders) {
            $res['orders'] = $this->orders;
        }
        if (null !== $this->orderId) {
            $res['order_id'] = $this->orderId;
        }
        if (null !== $this->pageNum) {
            $res['page_num'] = $this->pageNum;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->stateList) {
            $res['state_list'] = $this->stateList;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAppPlanRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['orders'])){
            if(!empty($map['orders'])){
                $model->orders = $map['orders'];
            }
        }
        if(isset($map['order_id'])){
            $model->orderId = $map['order_id'];
        }
        if(isset($map['page_num'])){
            $model->pageNum = $map['page_num'];
        }
        if(isset($map['page_size'])){
            $model->pageSize = $map['page_size'];
        }
        if(isset($map['state_list'])){
            if(!empty($map['state_list'])){
                $model->stateList = $map['state_list'];
            }
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
        }
        if(isset($map['workspace_ids'])){
            if(!empty($map['workspace_ids'])){
                $model->workspaceIds = $map['workspace_ids'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 应用名称
    /**
     * @var string
     */
    public $appName;

    // 排序规则数组，默认为 UTC_CREATED_DESC，即 根据创建时间降序排序
    /**
     * @var string[]
     */
    public $orders;

    // 发布单 order_id
    /**
     * @var string
     */
    public $orderId;

    // 当前页码，从1开始，默认为1
    /**
     * @var int
     */
    public $pageNum;

    // 分页大小，默认为10
    /**
     * @var int
     */
    public $pageSize;

    // 状态筛选列表
    /**
     * @var string[]
     */
    public $stateList;

    // 工作空间名称
    /**
     * @var string
     */
    public $workspace;

    // 工作空间 id 列表
    /**
     * @var string[]
     */
    public $workspaceIds;

}
