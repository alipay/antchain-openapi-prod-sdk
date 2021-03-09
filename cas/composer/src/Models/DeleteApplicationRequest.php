<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class DeleteApplicationRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // 欲删除的应用 id
    /**
     * @var string[]
     */
    public $applicationIds;

    // 是否删除绑定的代码库。默认为 false
    /**
     * @var bool
     */
    public $deleteCodeRepo;
    protected $_name = [
        'authToken'      => 'auth_token',
        'applicationIds' => 'application_ids',
        'deleteCodeRepo' => 'delete_code_repo',
    ];

    public function validate()
    {
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->applicationIds) {
            $res['application_ids'] = $this->applicationIds;
        }
        if (null !== $this->deleteCodeRepo) {
            $res['delete_code_repo'] = $this->deleteCodeRepo;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return DeleteApplicationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['application_ids'])) {
            if (!empty($map['application_ids'])) {
                $model->applicationIds = $map['application_ids'];
            }
        }
        if (isset($map['delete_code_repo'])) {
            $model->deleteCodeRepo = $map['delete_code_repo'];
        }

        return $model;
    }
}
