<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDiskRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // current page
    /**
     * @var int
     */
    public $currentPage;

    // page size
    /**
     * @var int
     */
    public $pageSize;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // type
    /**
     * @var string
     */
    public $type;

    // computer_ids
    /**
     * @var string[]
     */
    public $computerIds;

    // devices
    /**
     * @var string[]
     */
    public $devices;

    // max_size
    /**
     * @var int
     */
    public $maxSize;

    // min_size
    /**
     * @var int
     */
    public $minSize;

    // workspace_ids
    /**
     * @var string[]
     */
    public $workspaceIds;

    // name
    /**
     * @var string
     */
    public $name;
    protected $_name = [
        'authToken'    => 'auth_token',
        'currentPage'  => 'current_page',
        'pageSize'     => 'page_size',
        'workspace'    => 'workspace',
        'statuses'     => 'statuses',
        'type'         => 'type',
        'computerIds'  => 'computer_ids',
        'devices'      => 'devices',
        'maxSize'      => 'max_size',
        'minSize'      => 'min_size',
        'workspaceIds' => 'workspace_ids',
        'name'         => 'name',
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
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->computerIds) {
            $res['computer_ids'] = $this->computerIds;
        }
        if (null !== $this->devices) {
            $res['devices'] = $this->devices;
        }
        if (null !== $this->maxSize) {
            $res['max_size'] = $this->maxSize;
        }
        if (null !== $this->minSize) {
            $res['min_size'] = $this->minSize;
        }
        if (null !== $this->workspaceIds) {
            $res['workspace_ids'] = $this->workspaceIds;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDiskRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['type'])) {
            $model->type = $map['type'];
        }
        if (isset($map['computer_ids'])) {
            if (!empty($map['computer_ids'])) {
                $model->computerIds = $map['computer_ids'];
            }
        }
        if (isset($map['devices'])) {
            if (!empty($map['devices'])) {
                $model->devices = $map['devices'];
            }
        }
        if (isset($map['max_size'])) {
            $model->maxSize = $map['max_size'];
        }
        if (isset($map['min_size'])) {
            $model->minSize = $map['min_size'];
        }
        if (isset($map['workspace_ids'])) {
            if (!empty($map['workspace_ids'])) {
                $model->workspaceIds = $map['workspace_ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }

        return $model;
    }
}
