<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CATRONUS\Models;

use AlibabaCloud\Tea\Model;

class DeleteImageRepoRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 镜像仓库ID
    /**
     * @var string
     */
    public $repoId;
    protected $_name = [
        'authToken' => 'auth_token',
        'repoId'    => 'repo_id',
    ];

    public function validate()
    {
        Model::validateRequired('repoId', $this->repoId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->repoId) {
            $res['repo_id'] = $this->repoId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteImageRepoRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['repo_id'])) {
            $model->repoId = $map['repo_id'];
        }

        return $model;
    }
}
