<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDatabaseImportRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // iaas_type
    /**
     * @var string
     */
    public $iaasType;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'   => 'auth_token',
        'currentPage' => 'current_page',
        'iaasType'    => 'iaas_type',
        'pageSize'    => 'page_size',
        'workspace'   => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('iaasType', $this->iaasType, true);
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
        if (null !== $this->iaasType) {
            $res['iaas_type'] = $this->iaasType;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatabaseImportRequest
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
        if (isset($map['iaas_type'])) {
            $model->iaasType = $map['iaas_type'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
