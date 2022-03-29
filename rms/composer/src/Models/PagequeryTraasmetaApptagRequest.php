<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTraasmetaApptagRequest extends Model
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

    // tenant_uuid
    /**
     * @var string
     */
    public $tenantUuid;

    // tenant_name
    /**
     * @var string
     */
    public $tenantName;

    // app_name
    /**
     * @var string
     */
    public $appName;

    // 是否是模糊搜索，默认为false
    /**
     * @var bool
     */
    public $search;
    protected $_name = [
        'authToken'   => 'auth_token',
        'pageSize'    => 'page_size',
        'currentPage' => 'current_page',
        'tenantUuid'  => 'tenant_uuid',
        'tenantName'  => 'tenant_name',
        'appName'     => 'app_name',
        'search'      => 'search',
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
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->search) {
            $res['search'] = $this->search;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTraasmetaApptagRequest
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
        if (isset($map['app_name'])) {
            $model->appName = $map['app_name'];
        }
        if (isset($map['search'])) {
            $model->search = $map['search'];
        }

        return $model;
    }
}
