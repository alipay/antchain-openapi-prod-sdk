<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\CAS\Models;

use AlibabaCloud\Tea\Model;

class CreateWorkspaceRequest extends Model
{
    /**
     * @var string
     */
    public $authToken;

    // workspace 显示名称
    /**
     * @var string
     */
    public $displayName;

    // workspace 唯一标识符。
    /**
     * @var string
     */
    public $name;

    // VPC ｜ Classic
    /**
     * @var string
     */
    public $networkType;

    // 地域
    /**
     * @var string
     */
    public $region;

    // 可用区
    /**
     * @var string[]
     */
    public $zones;
    protected $_name = [
        'authToken'   => 'auth_token',
        'displayName' => 'display_name',
        'name'        => 'name',
        'networkType' => 'network_type',
        'region'      => 'region',
        'zones'       => 'zones',
    ];

    public function validate()
    {
        Model::validateRequired('displayName', $this->displayName, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('networkType', $this->networkType, true);
        Model::validateRequired('region', $this->region, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->networkType) {
            $res['network_type'] = $this->networkType;
        }
        if (null !== $this->region) {
            $res['region'] = $this->region;
        }
        if (null !== $this->zones) {
            $res['zones'] = $this->zones;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return CreateWorkspaceRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['display_name'])) {
            $model->displayName = $map['display_name'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['network_type'])) {
            $model->networkType = $map['network_type'];
        }
        if (isset($map['region'])) {
            $model->region = $map['region'];
        }
        if (isset($map['zones'])) {
            if (!empty($map['zones'])) {
                $model->zones = $map['zones'];
            }
        }

        return $model;
    }
}
