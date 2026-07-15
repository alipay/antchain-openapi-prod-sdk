<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class SyncKmVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'treeId' => 'tree_id',
        'treeVersion' => 'tree_version',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
        Model::validateRequired('treeVersion', $this->treeVersion, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        if (null !== $this->treeVersion) {
            $res['tree_version'] = $this->treeVersion;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return SyncKmVersionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
        }
        if(isset($map['tree_version'])){
            $model->treeVersion = $map['tree_version'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 树ID
    /**
     * @var string
     */
    public $treeId;

    // 版本号
    /**
     * @var string
     */
    public $treeVersion;

}
