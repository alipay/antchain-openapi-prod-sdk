<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\RMS\Models;

use AlibabaCloud\Tea\Model;

class CallbackSpiCompletecommodityRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'data' => 'data',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->data) {
            $res['data'] = $this->data;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CallbackSpiCompletecommodityRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['data'])){
            $model->data = $map['data'];
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    // 南天门的请求体都是做成json字符串放在data字段里
    /**
     * @var string
     */
    public $data;

}
