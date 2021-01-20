<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\Deps\Models;

use AlibabaCloud\Tea\Model;

class GetConfigTemplateRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'tplId' => 'tpl_id',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->tplId) {
            $res['tpl_id'] = $this->tplId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return GetConfigTemplateRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
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

    // 应用参数模板 id
    /**
     * @var string
     */
    public $tplId;

}
