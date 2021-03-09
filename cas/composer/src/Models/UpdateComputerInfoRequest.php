<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class UpdateComputerInfoRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // name
    /**
     * @var string
     */
    public $name;

    // description
    /**
     * @var string
     */
    public $description;

    // workspace_id
    /**
     * @var string
     */
    public $workspaceId;

    // computer_id
    /**
     * @var string
     */
    public $computerId;
    protected $_name = [
        'authToken'   => 'auth_token',
        'name'        => 'name',
        'description' => 'description',
        'workspaceId' => 'workspace_id',
        'computerId'  => 'computer_id',
    ];

    public function validate()
    {
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspaceId', $this->workspaceId, true);
        Model::validateRequired('computerId', $this->computerId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->computerId) {
            $res['computer_id'] = $this->computerId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateComputerInfoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['computer_id'])) {
            $model->computerId = $map['computer_id'];
        }

        return $model;
    }
}
