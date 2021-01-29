<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

use AntChain\Deps\Models\SidecarCondition;

class AppBaselineSidecarConfig extends Model {
    protected $_name = [
        'appName' => 'app_name',
        'category' => 'category',
        'conditions' => 'conditions',
        'enable' => 'enable',
        'sidecarVersion' => 'sidecar_version',
        'id' => 'id',
    ];
    public function validate() {
        Model::validateRequired('appName', $this->appName, true);
        Model::validateRequired('category', $this->category, true);
        Model::validateRequired('conditions', $this->conditions, true);
        Model::validateRequired('enable', $this->enable, true);
        Model::validateRequired('id', $this->id, true);
    }
    public function toMap() {
        $res = [];
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
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return AppBaselineSidecarConfig
     */
    public static function fromMap($map = []) {
        $model = new self();
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
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        return $model;
    }
    // 应用名
    /**
     * @example minitrans
     * @var string
     */
    public $appName;

    // sidecar类型
    /**
     * @example mosn
     * @var string
     */
    public $category;

    // 应用基线适用条件，金融云环境仅能指定workspaceGroups属性，并且只能指定一个workspaceGroup
    /**
     * @example workspaceGroups=dev
     * @var SidecarCondition[]
     */
    public $conditions;

    // 是否开启sidecar
    /**
     * @example true, false
     * @var bool
     */
    public $enable;

    // sidecar版本号，金融云环境必填
    /**
     * @example sidecar-mosn-wsg-dev-1213121
     * @var string
     */
    public $sidecarVersion;

    // 应用基线id
    /**
     * @example asdfsad-2e2-fsdsadfds
     * @var string
     */
    public $id;

}
