<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class UpdateFolderRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'id' => 'id',
        'name' => 'name',
        'workspaceName' => 'workspace_name',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->id) {
            $res['id'] = $this->id;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->workspaceName) {
            $res['workspace_name'] = $this->workspaceName;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return UpdateFolderRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['id'])){
            $model->id = $map['id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['workspace_name'])){
            $model->workspaceName = $map['workspace_name'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 文件夹id
    /**
     * @var int
     */
    public $id;

    // 文件夹新名称
    /**
     * @var string
     */
    public $name;

    // 工作空间
    /**
     * @var string
     */
    public $workspaceName;

}
