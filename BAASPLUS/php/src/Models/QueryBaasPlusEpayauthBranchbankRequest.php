<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\BAASPLUS\Models;

use AlibabaCloud\Tea\Model;

class QueryBaasPlusEpayauthBranchbankRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'bankName' => 'bank_name',
        'districtCode' => 'district_code',
        'rootBankCode' => 'root_bank_code',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->bankName) {
            $res['bank_name'] = $this->bankName;
        }
        if (null !== $this->districtCode) {
            $res['district_code'] = $this->districtCode;
        }
        if (null !== $this->rootBankCode) {
            $res['root_bank_code'] = $this->rootBankCode;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryBaasPlusEpayauthBranchbankRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['bank_name'])){
            $model->bankName = $map['bank_name'];
        }
        if(isset($map['district_code'])){
            $model->districtCode = $map['district_code'];
        }
        if(isset($map['root_bank_code'])){
            $model->rootBankCode = $map['root_bank_code'];
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
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // 银行名称，支持全称，或部分名称
    // bank_name和district_code至少有一个不为空
    /**
     * @var string
     */
    public $bankName;

    // 行政地区编码
    // bank_name和district_code至少有一个不为空
    /**
     * @var string
     */
    public $districtCode;

    // 总行联行号
    /**
     * @var string
     */
    public $rootBankCode;

}
