<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryImageRequest extends Model
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

    // status
    /**
     * @var string
     */
    public $statuses;
    protected $_name = [
        'authToken'   => 'auth_token',
        'currentPage' => 'current_page',
        'pageSize'    => 'page_size',
        'workspace'   => 'workspace',
        'statuses'    => 'statuses',
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

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryImageRequest
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
            $model->statuses = $map['statuses'];
        }

        return $model;
    }
}
