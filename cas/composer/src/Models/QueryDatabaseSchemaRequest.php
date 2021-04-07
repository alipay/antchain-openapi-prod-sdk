<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class QueryDatabaseSchemaRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // char_sets
    /**
     * @var string[]
     */
    public $charSets;

    // current_page
    /**
     * @var int
     */
    public $currentPage;

    // database_id
    /**
     * @var string
     */
    public $databaseId;

    // iaas_ids
    /**
     * @var string[]
     */
    public $iaasIds;

    // ids
    /**
     * @var string[]
     */
    public $ids;

    // name
    /**
     * @var string
     */
    public $name;

    // page_size
    /**
     * @var int
     */
    public $pageSize;

    // statuses
    /**
     * @var string[]
     */
    public $statuses;

    // workspace
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'   => 'auth_token',
        'charSets'    => 'char_sets',
        'currentPage' => 'current_page',
        'databaseId'  => 'database_id',
        'iaasIds'     => 'iaas_ids',
        'ids'         => 'ids',
        'name'        => 'name',
        'pageSize'    => 'page_size',
        'statuses'    => 'statuses',
        'workspace'   => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('databaseId', $this->databaseId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->charSets) {
            $res['char_sets'] = $this->charSets;
        }
        if (null !== $this->currentPage) {
            $res['current_page'] = $this->currentPage;
        }
        if (null !== $this->databaseId) {
            $res['database_id'] = $this->databaseId;
        }
        if (null !== $this->iaasIds) {
            $res['iaas_ids'] = $this->iaasIds;
        }
        if (null !== $this->ids) {
            $res['ids'] = $this->ids;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->pageSize) {
            $res['page_size'] = $this->pageSize;
        }
        if (null !== $this->statuses) {
            $res['statuses'] = $this->statuses;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return QueryDatabaseSchemaRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['char_sets'])) {
            if (!empty($map['char_sets'])) {
                $model->charSets = $map['char_sets'];
            }
        }
        if (isset($map['current_page'])) {
            $model->currentPage = $map['current_page'];
        }
        if (isset($map['database_id'])) {
            $model->databaseId = $map['database_id'];
        }
        if (isset($map['iaas_ids'])) {
            if (!empty($map['iaas_ids'])) {
                $model->iaasIds = $map['iaas_ids'];
            }
        }
        if (isset($map['ids'])) {
            if (!empty($map['ids'])) {
                $model->ids = $map['ids'];
            }
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['page_size'])) {
            $model->pageSize = $map['page_size'];
        }
        if (isset($map['statuses'])) {
            if (!empty($map['statuses'])) {
                $model->statuses = $map['statuses'];
            }
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
