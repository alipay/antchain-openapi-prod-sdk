<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryOpsCheckRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    //
    // 页面大小
    /**
     * @var int
     */
    public $pageSize;

    // 应用名
    /**
     * @var string
     */
    public $app;

    // 应用监控指标状态 0：异常 1：正常 不传：全部
    /**
     * @var int
     */
    public $appStatus;

    // 自定义监控指标状态 0：异常 1：正常 不传：全部
    /**
     * @var int
     */
    public $customStatus;
    protected $_name = [
        'authToken'     => 'auth_token',
        'workspaceName' => 'workspace_name',
        'currentPage'   => 'current_page',
        'pageSize'      => 'page_size',
        'app'           => 'app',
        'appStatus'     => 'app_status',
        'customStatus'  => 'custom_status',
    ];

    public function validate()
    {
        Model::validateRequired('workspaceName', $this->workspaceName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->app) {
            $res['app'] = $this->app;
        }
        if (null !== $this->appStatus) {
            $res['app_status'] = $this->appStatus;
        }
        if (null !== $this->customStatus) {
            $res['custom_status'] = $this->customStatus;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryOpsCheckRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['app'])) {
            $model->app = $map['app'];
        }
        if (isset($map['app_status'])) {
            $model->appStatus = $map['app_status'];
        }
        if (isset($map['custom_status'])) {
            $model->customStatus = $map['custom_status'];
        }

        return $model;
    }
}
