<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarCondition;

class ListAppbaselineSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'category' => 'category',
        'condition' => 'condition',
        'sidecarVersion' => 'sidecar_version',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->appName) {
            $res['app_name'] = $this->appName;
        }
        if (null !== $this->category) {
            $res['category'] = $this->category;
        }
        if (null !== $this->condition) {
            $res['condition'] = null !== $this->condition ? $this->condition->toMap() : null;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return ListAppbaselineSidecarRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['app_name'])){
            $model->appName = $map['app_name'];
        }
        if(isset($map['category'])){
            $model->category = $map['category'];
        }
        if(isset($map['condition'])){
            $model->condition = SidecarCondition::fromMap($map['condition']);
        }
        if(isset($map['sidecar_version'])){
            $model->sidecarVersion = $map['sidecar_version'];
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

    // 应用名
    /**
     * @var string
     */
    public $appName;

    // sidecar类型
    /**
     * @var string
     */
    public $category;

    // 过滤条件，网商仅能指定workspaceGroups属性
    /**
     * @var SidecarCondition
     */
    public $condition;

    // sidecar版本号
    /**
     * @var string
     */
    public $sidecarVersion;

}
