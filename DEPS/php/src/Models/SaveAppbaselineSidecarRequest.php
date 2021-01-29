<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarCondition;

class SaveAppbaselineSidecarRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'appName' => 'app_name',
        'category' => 'category',
        'conditions' => 'conditions',
        'enable' => 'enable',
        'sidecarVersion' => 'sidecar_version',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('conditions', $this->conditions, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('sidecarVersion', $this->sidecarVersion, true);
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
        if (null !== $this->conditions) {
            $res['conditions'] = [];
            if(null !== $this->conditions && is_array($this->conditions)){
                $n = 0;
                foreach($this->conditions as $item){
                    $res['conditions'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        if (null !== $this->enable) {
            $res['enable'] = $this->enable;
        }
        if (null !== $this->sidecarVersion) {
            $res['sidecar_version'] = $this->sidecarVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SaveAppbaselineSidecarRequest
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
        if(isset($map['conditions'])){
            if(!empty($map['conditions'])){
                $model->conditions = [];
                $n = 0;
                foreach($map['conditions'] as $item) {
                    $model->conditions[$n++] = null !== $item ? SidecarCondition::fromMap($item) : $item;
                }
            }
        }
        if(isset($map['enable'])){
            $model->enable = $map['enable'];
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

    // 应用基线适用条件，网商仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
    /**
     * @var SidecarCondition[]
     */
    public $conditions;

    // 是否开启sidecar
    /**
     * @var bool
     */
    public $enable;

    // sidecar版本号
    /**
     * @var string
     */
    public $sidecarVersion;

}
