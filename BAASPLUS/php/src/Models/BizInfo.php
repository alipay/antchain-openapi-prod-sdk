<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class BizInfo extends Model {
    protected $_name = [
        'clientTenent' => 'client_tenent',
        'code' => 'code',
        'productCode' => 'product_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->clientTenent) {
            $res['client_tenent'] = $this->clientTenent;
        }
        if (null !== $this->code) {
            $res['code'] = $this->code;
        }
        if (null !== $this->productCode) {
            $res['product_code'] = $this->productCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return BizInfo
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['client_tenent'])){
            $model->clientTenent = $map['client_tenent'];
        }
        if(isset($map['code'])){
            $model->code = $map['code'];
        }
        if(isset($map['product_code'])){
            $model->productCode = $map['product_code'];
        }
        return $model;
    }
    // BPWZPFCN
    /**
     * @example 用户的金融科技租户id
     * @var string
     */
    public $clientTenent;

    // 业务代码
    /**
     * @example BAAS_ANTFIN|BAAS_ALICLOUD|MORSE|RECEIVABLE|TRACE|GLOBAL_PAYMENT|JUDICIAL|INVOICE
     * @var string
     */
    public $code;

    // 内部产品码
    /**
     * @example BAI
     * @var string
     */
    public $productCode;

}
