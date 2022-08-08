<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\SaasTest6\Models;

use AlibabaCloud\Tea\Model;

class CreateAntcloudOpenapiApiserviceGroupRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 所属产品
    /**
     * @var string
     */
    public $providerName;

    // 套件版本
    /**
     * @var string
     */
    public $suiteVersion;

    // 分组描述
    /**
     * @var string
     */
    public $description;

    // 分组名称
    /**
     * @var string
     */
    public $groupName;

    // 分组类型
    /**
     * @var string
     */
    public $apiGroupType;
    protected $_name = [
        'authToken'    => 'auth_token',
        'providerName' => 'provider_name',
        'suiteVersion' => 'suite_version',
        'description'  => 'description',
        'groupName'    => 'group_name',
        'apiGroupType' => 'api_group_type',
    ];

    public function validate()
    {
        Model::validateRequired('providerName', $this->providerName, true);
        Model::validateRequired('suiteVersion', $this->suiteVersion, true);
        Model::validateRequired('description', $this->description, true);
        Model::validateRequired('groupName', $this->groupName, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->providerName) {
            $res['provider_name'] = $this->providerName;
        }
        if (null !== $this->suiteVersion) {
            $res['suite_version'] = $this->suiteVersion;
        }
        if (null !== $this->description) {
            $res['description'] = $this->description;
        }
        if (null !== $this->groupName) {
            $res['group_name'] = $this->groupName;
        }
        if (null !== $this->apiGroupType) {
            $res['api_group_type'] = $this->apiGroupType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateAntcloudOpenapiApiserviceGroupRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['provider_name'])) {
            $model->providerName = $map['provider_name'];
        }
        if (isset($map['suite_version'])) {
            $model->suiteVersion = $map['suite_version'];
        }
        if (isset($map['description'])) {
            $model->description = $map['description'];
        }
        if (isset($map['group_name'])) {
            $model->groupName = $map['group_name'];
        }
        if (isset($map['api_group_type'])) {
            $model->apiGroupType = $map['api_group_type'];
        }

        return $model;
    }
}
