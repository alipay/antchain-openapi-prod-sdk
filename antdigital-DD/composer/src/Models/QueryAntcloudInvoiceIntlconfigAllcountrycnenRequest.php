<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'keyword' => 'keyword',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->keyword) {
            $res['keyword'] = $this->keyword;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['keyword'])){
            $model->keyword = $map['keyword'];
        }
        return $model;
    }
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    // 国家英文名称
    /**
     * @var string
     */
    public $keyword;

}
