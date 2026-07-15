<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\ENERGYTOOL\Models;

use AlibabaCloud\Tea\Model;

class QueryKmVersionRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'treeId' => 'tree_id',
    ];
    public function validate() {
        Model::validateRequired('treeId', $this->treeId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->treeId) {
            $res['tree_id'] = $this->treeId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryKmVersionRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tree_id'])){
            $model->treeId = $map['tree_id'];
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

}
