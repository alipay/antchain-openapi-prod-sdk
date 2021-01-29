<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateSingleworkspaceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'displayName' => 'display_name',
        'networkType' => 'network_type',
        'region' => 'region',
        'zones' => 'zones',
        'name' => 'name',
    ];
    public function validate() {
        Model::validateRequired('name', $this->name, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
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
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateSingleworkspaceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['network_type'])){
            $model->networkType = $map['network_type'];
        }
        if(isset($map['region'])){
            $model->region = $map['region'];
        }
        if(isset($map['zones'])){
            if(!empty($map['zones'])){
                $model->zones = $map['zones'];
            }
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $tenant;

    // workspace 显示名称
    /**
     * @var string
     */
    public $displayName;

    // VPC ｜ Classic
    /**
     * @var string
     */
    public $networkType;

    // 地域id
    /**
     * @var string
     */
    public $region;

    // 可用区id列表
    /**
     * @var string[]
     */
    public $zones;

    // 环境唯一标识
    /**
     * @var string
     */
    public $name;

}
