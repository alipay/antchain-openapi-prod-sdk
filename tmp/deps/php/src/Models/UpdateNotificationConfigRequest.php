<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class UpdateNotificationConfigRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'cloudWebUrl' => 'cloud_web_url',
        'enabled' => 'enabled',
        'id' => 'id',
        'modifiedVersion' => 'modified_version',
        'receivers' => 'receivers',
        'type' => 'type',
        'workspace' => 'workspace',
    ];
    public function validate() {
        Model::validateRequired('cloudWebUrl', $this->cloudWebUrl, true);
        Model::validateRequired('id', $this->id, true);
        Model::validateRequired('modifiedVersion', $this->modifiedVersion, true);
        Model::validateRequired('workspace', $this->workspace, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->cloudWebUrl) {
            $res['cloud_web_url'] = $this->cloudWebUrl;
        }
        if (null !== $this->enabled) {
            $res['enabled'] = $this->enabled;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->modifiedVersion) {
            $res['modified_version'] = $this->modifiedVersion;
        }
        if (null !== $this->receivers) {
            $res['receivers'] = $this->receivers;
        }
        if (null !== $this->type) {
            $res['type'] = $this->type;
        }
        if (null !== $this->workspace) {
            $res['workspace'] = $this->workspace;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateNotificationConfigRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['cloud_web_url'])){
            $model->cloudWebUrl = $map['cloud_web_url'];
        }
        if(isset($map['enabled'])){
            $model->enabled = $map['enabled'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['modified_version'])){
            $model->modifiedVersion = $map['modified_version'];
        }
        if(isset($map['receivers'])){
            if(!empty($map['receivers'])){
                $model->receivers = $map['receivers'];
            }
        }
        if(isset($map['type'])){
            $model->type = $map['type'];
        }
        if(isset($map['workspace'])){
            $model->workspace = $map['workspace'];
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

    // cloud web url
    /**
     * @var string
     */
    public $cloudWebUrl;

    // 是否开启
    /**
     * @var bool
     */
    public $enabled;

    // id
    /**
     * @var string
     */
    public $id;

    // modified_version
    /**
     * @var int
     */
    public $modifiedVersion;

    // 接受者
    /**
     * @var string[]
     */
    public $receivers;

    // 类型
    /**
     * @var string
     */
    public $type;

    // workspace
    /**
     * @var string
     */
    public $workspace;

}
