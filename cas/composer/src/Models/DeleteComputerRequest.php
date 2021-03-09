<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteComputerRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // computer_sequences
    /**
     * @var string[]
     */
    public $computerSequences;

    // 后续这个字段必填
    /**
     * @var string
     */
    public $workspaceId;

    // 是否强制删除
    /**
     * @var bool
     */
    public $force;
    protected $_name = [
        'authToken'         => 'auth_token',
        'computerSequences' => 'computer_sequences',
        'workspaceId'       => 'workspace_id',
        'force'             => 'force',
    ];

    public function validate()
    {
        Model::validateRequired('computerSequences', $this->computerSequences, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->computerSequences) {
            $res['computer_sequences'] = $this->computerSequences;
        }
        if (null !== $this->workspaceId) {
            $res['workspace_id'] = $this->workspaceId;
        }
        if (null !== $this->force) {
            $res['force'] = $this->force;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteComputerRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['computer_sequences'])) {
            if (!empty($map['computer_sequences'])) {
                $model->computerSequences = $map['computer_sequences'];
            }
        }
        if (isset($map['workspace_id'])) {
            $model->workspaceId = $map['workspace_id'];
        }
        if (isset($map['force'])) {
            $model->force = $map['force'];
        }

        return $model;
    }
}
