<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class ImportSecuritygroupRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // sg-zm042uh9f8gb1lfcsng6 的 iaas 层 id
    /**
     * @var string
     */
    public $securitygroupId;

    // securityGroup 名称
    /**
     * @var string
     */
    public $name;

    // 工作空间
    /**
     * @var string
     */
    public $workspace;
    protected $_name = [
        'authToken'       => 'auth_token',
        'securitygroupId' => 'securitygroup_id',
        'name'            => 'name',
        'workspace'       => 'workspace',
    ];

    public function validate()
    {
        Model::validateRequired('securitygroupId', $this->securitygroupId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->securitygroupId) {
            $res['securitygroup_id'] = $this->securitygroupId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ImportSecuritygroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['securitygroup_id'])) {
            $model->securitygroupId = $map['securitygroup_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['workspace'])) {
            $model->workspace = $map['workspace'];
        }

        return $model;
    }
}
