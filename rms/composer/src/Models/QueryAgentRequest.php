<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class QueryAgentRequest extends Model
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

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页码
    /**
     * @var int
     */
    public $currentPage;

    // agent部署类型：容器CONTAINER、经典MACHINE
    /**
     * @var string
     */
    public $deployType;

    // 模糊搜索关键字
    /**
     * @var string
     */
    public $keyword;

    // app 模糊搜索关键字
    /**
     * @var string
     */
    public $appKeyword;

    // 服务 IP 模糊搜索关键字
    /**
     * @var string
     */
    public $serviceIpKeyword;

    // 主机 IP 模糊搜索关键字
    /**
     * @var string
     */
    public $hostIpKeyword;

    // agent 状态
    /**
     * @var int
     */
    public $status;
    protected $_name = [
        'authToken'        => 'auth_token',
        'workspaceName'    => 'workspace_name',
        'pageSize'         => 'page_size',
        'currentPage'      => 'current_page',
        'deployType'       => 'deploy_type',
        'keyword'          => 'keyword',
        'appKeyword'       => 'app_keyword',
        'serviceIpKeyword' => 'service_ip_keyword',
        'hostIpKeyword'    => 'host_ip_keyword',
        'status'           => 'status',
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
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->deployType) {
            $res['deploy_type'] = $this->deployType;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        if (null !== $this->appKeyword) {
            $res['app_keyword'] = $this->appKeyword;
        }
        if (null !== $this->serviceIpKeyword) {
            $res['service_ip_keyword'] = $this->serviceIpKeyword;
        }
        if (null !== $this->hostIpKeyword) {
            $res['host_ip_keyword'] = $this->hostIpKeyword;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryAgentRequest
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
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['deploy_type'])) {
            $model->deployType = $map['deploy_type'];
        }
        if (isset($map['keyword'])) {
            $model->keyword = $map['keyword'];
        }
        if (isset($map['app_keyword'])) {
            $model->appKeyword = $map['app_keyword'];
        }
        if (isset($map['service_ip_keyword'])) {
            $model->serviceIpKeyword = $map['service_ip_keyword'];
        }
        if (isset($map['host_ip_keyword'])) {
            $model->hostIpKeyword = $map['host_ip_keyword'];
        }
        if (isset($map['status'])) {
            $model->status = $map['status'];
        }

        return $model;
    }
}
