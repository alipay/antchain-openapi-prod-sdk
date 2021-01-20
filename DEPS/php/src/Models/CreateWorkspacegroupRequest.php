<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class CreateWorkspacegroupRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'displayName' => 'display_name',
        'domainSuffix' => 'domain_suffix',
        'name' => 'name',
        'releaseMode' => 'release_mode',
        'workspaces' => 'workspaces',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->displayName) {
            $res['display_name'] = $this->displayName;
        }
        if (null !== $this->domainSuffix) {
            $res['domain_suffix'] = $this->domainSuffix;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->releaseMode) {
            $res['release_mode'] = $this->releaseMode;
        }
        if (null !== $this->workspaces) {
            $res['workspaces'] = $this->workspaces;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateWorkspacegroupRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['display_name'])){
            $model->displayName = $map['display_name'];
        }
        if(isset($map['domain_suffix'])){
            $model->domainSuffix = $map['domain_suffix'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['release_mode'])){
            $model->releaseMode = $map['release_mode'];
        }
        if(isset($map['workspaces'])){
            if(!empty($map['workspaces'])){
                $model->workspaces = $map['workspaces'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 工作空间组显示名称。
    /**
     * @var string
     */
    public $displayName;

    // 域名后缀。
    /**
     * @var string
     */
    public $domainSuffix;

    // 工作空间组唯一标识。
    /**
     * @var string
     */
    public $name;

    // 发布部署模式。
    /**
     * @var string
     */
    public $releaseMode;

    // 包含工作空间列表。
    /**
     * @var string[]
     */
    public $workspaces;

}
