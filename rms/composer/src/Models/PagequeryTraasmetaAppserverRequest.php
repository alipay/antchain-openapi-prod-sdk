<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTraasmetaAppserverRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 每页大小
    /**
     * @var int
     */
    public $pageSize;

    // 当前页
    /**
     * @var int
     */
    public $currentPage;

    //
    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    //
    /**
     * @var string
     */
    public $tenantName;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // host_ip
    /**
     * @var string
     */
    public $hostIp;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // ip
    /**
     * @var string
     */
    public $ip;

    // hotsname
    /**
     * @var string
     */
    public $hotsname;

    // 是否是模糊搜索，默认为false
    /**
     * @var bool
     */
    public $search;
    protected $_name = [
        'authToken'     => 'auth_token',
        'pageSize'      => 'page_size',
        'currentPage'   => 'current_page',
        'tenantUuid'    => 'tenant_uuid',
        'tenantName'    => 'tenant_name',
        'workspaceName' => 'workspace_name',
        'hostIp'        => 'host_ip',
        'appName'       => 'app_name',
        'ip'            => 'ip',
        'hotsname'      => 'hotsname',
        'search'        => 'search',
    ];

    public function validate()
    {
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
        Model::validateRequired('search', $this->search, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->tenantUuid) {
            $res['tenant_uuid'] = $this->tenantUuid;
        }
        if (null !== $this->tenantName) {
            $res['tenant_name'] = $this->tenantName;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->hostIp) {
            $res['host_ip'] = $this->hostIp;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }
        if (null !== $this->hotsname) {
            $res['hotsname'] = $this->hotsname;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTraasmetaAppserverRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['tenant_uuid'])) {
            $model->tenantUuid = $map['tenant_uuid'];
        }
        if (isset($map['tenant_name'])) {
            $model->tenantName = $map['tenant_name'];
        }
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['host_ip'])) {
            $model->hostIp = $map['host_ip'];
        }
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }
        if (isset($map['hotsname'])) {
            $model->hotsname = $map['hotsname'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }

        return $model;
    }
}
