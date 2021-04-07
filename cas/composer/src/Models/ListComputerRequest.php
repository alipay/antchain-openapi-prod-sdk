<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ListComputerRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // appserviceIds
    /**
     * @var string[]
     */
    public $appServiceIds;

    // current page
    /**
     * @var int
     */
    public $currentPage;

    // name
    /**
     * @var string
     */
    public $name;

    // current page
    /**
     * @var int
     */
    public $pageSize;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // CMP模式下使用的token，一般场景勿用
    /**
     * @var string
     */
    public $cloudManageToken;

    // vpc_iaas_id
    /**
     * @var string
     */
    public $vpcIaasId;
    protected $_name = [
        'authToken'        => 'auth_token',
        'appServiceIds'    => 'app_service_ids',
        'currentPage'      => 'current_page',
        'name'             => 'name',
        'pageSize'         => 'page_size',
        'workspace'        => 'workspace',
        'cloudManageToken' => 'cloud_manage_token',
        'vpcIaasId'        => 'vpc_iaas_id',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->appServiceIds) {
            $res['app_service_ids'] = $this->appServiceIds;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->cloudManageToken) {
            $res['cloud_manage_token'] = $this->cloudManageToken;
        }
        if (null !== $this->vpcIaasId) {
            $res['vpc_iaas_id'] = $this->vpcIaasId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ListComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['app_service_ids'])) {
            if (!empty($map['app_service_ids'])) {
                $model->appServiceIds = $map['app_service_ids'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['cloud_manage_token'])) {
            $model->cloudManageToken = $map['cloud_manage_token'];
        }
        if (isset($map['vpc_iaas_id'])) {
            $model->vpcIaasId = $map['vpc_iaas_id'];
        }

        return $model;
    }
}
