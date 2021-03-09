<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryComputerImportRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // workspace name
    /**
     * @var string
     */
    public $workspace;

    // zone identity
    /**
     * @var string
     */
    public $zone;

    // page size
    /**
     * @var int
     */
    public $pageSize;

    // current page
    /**
     * @var int
     */
    public $currentPage;
    protected $_name = [
        'authToken'   => 'auth_token',
        'workspace'   => 'workspace',
        'zone'        => 'zone',
        'pageSize'    => 'page_size',
        'currentPage' => 'current_page',
    ];

    public function validate()
    {
        Model::validateRequired('workspace', $this->workspace, true);
        Model::validateRequired('pageSize', $this->pageSize, true);
        Model::validateRequired('currentPage', $this->currentPage, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        if (null !== $this->zone) {
            $res['zone'] = $this->zone;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryComputerImportRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }
        if (isset($map['zone'])) {
            $model->zone = $map['zone'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }

        return $model;
    }
}
