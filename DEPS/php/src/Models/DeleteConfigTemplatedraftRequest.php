<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class DeleteConfigTemplatedraftRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tenant' => 'tenant',
        'tplId' => 'tpl_id',
    ];
    public function validate() {
        Model::validateRequired('tplId', $this->tplId, true);
    }
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tenant) {
            $res['tenant'] = $this->tenant;
        }
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DeleteConfigTemplatedraftRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['tenant'])){
            $model->tenant = $map['tenant'];
        }
        if(isset($map['tpl_id'])){
            $model->tplId = $map['tpl_id'];
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

    // 要删除的应用参数模板 id
    /**
     * @var string
     */
    public $tplId;

}
