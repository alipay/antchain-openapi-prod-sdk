<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class QueryWorkspaceRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'status' => 'status',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->status) {
            $res['status'] = $this->status;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryWorkspaceRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['status'])){
            if(!empty($map['status'])){
                $model->status = $map['status'];
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 工作空间状态。输入示例：status.1=CREATED
    /**
     * @var string[]
     */
    public $status;

}
