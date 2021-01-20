<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class SidecarScopeDetail extends Model {
    protected $_name = [
        'scope' => 'scope',
        'scopeIdentity' => 'scope_identity',
        'scopeIdentityDisplayName' => 'scope_identity_display_name',
        'scopeIdentityName' => 'scope_identity_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->scope) {
            $res['scope'] = $this->scope;
        }
        if (null !== $this->scopeIdentity) {
            $res['scope_identity'] = $this->scopeIdentity;
        }
        if (null !== $this->scopeIdentityDisplayName) {
            $res['scope_identity_display_name'] = $this->scopeIdentityDisplayName;
        }
        if (null !== $this->scopeIdentityName) {
            $res['scope_identity_name'] = $this->scopeIdentityName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SidecarScopeDetail
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['scope'])){
            $model->scope = $map['scope'];
        }
        if(isset($map['scope_identity'])){
            $model->scopeIdentity = $map['scope_identity'];
        }
        if(isset($map['scope_identity_display_name'])){
            $model->scopeIdentityDisplayName = $map['scope_identity_display_name'];
        }
        if(isset($map['scope_identity_name'])){
            $model->scopeIdentityName = $map['scope_identity_name'];
        }
        return $model;
    }
    // sidecar生效范围：workspace、workspace_group、region
    // 
    /**
     * @example region
     * @var string
     */
    public $scope;

    // scope对应的唯一id，例如workspace对应workspace id
    // 
    /**
     * @example 00012
     * @var string
     */
    public $scopeIdentity;

    // scope identity展示名称
    /**
     * @example 张家口
     * @var string
     */
    public $scopeIdentityDisplayName;

    // scope对应的唯一标识符
    /**
     * @example hz_nf
     * @var string
     */
    public $scopeIdentityName;

}
