<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class PagequeryTraasmetaHostmachineRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // currentPage
    /**
     * @var int
     */
    public $currentPage;

    // workspace_name
    /**
     * @var string
     */
    public $workspaceName;

    // workspace_uuid
    /**
     * @var string
     */
    public $workspaceUuid;

    // hostname
    /**
     * @var string
     */
    public $hostname;

    // ip
    /**
     * @var string
     */
    public $ip;
    protected $_name = [
        'authToken'     => 'auth_token',
        'pageSize'      => 'page_size',
        'currentPage'   => 'current_page',
        'workspaceName' => 'workspace_name',
        'workspaceUuid' => 'workspace_uuid',
        'hostname'      => 'hostname',
        'ip'            => 'ip',
    ];

    public function validate()
    {
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
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
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        if (null !== $this->workspaceUuid) {
            $res['workspace_uuid'] = $this->workspaceUuid;
        }
        if (null !== $this->hostname) {
            $res['hostname'] = $this->hostname;
        }
        if (null !== $this->ip) {
            $res['ip'] = $this->ip;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return PagequeryTraasmetaHostmachineRequest
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
        if (isset($map['workspace_name'])) {
            $model->workspaceName = $map['workspace_name'];
        }
        if (isset($map['workspace_uuid'])) {
            $model->workspaceUuid = $map['workspace_uuid'];
        }
        if (isset($map['hostname'])) {
            $model->hostname = $map['hostname'];
        }
        if (isset($map['ip'])) {
            $model->ip = $map['ip'];
        }

        return $model;
    }
}
