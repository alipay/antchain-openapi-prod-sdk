<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMOSDK\Models;

use AlibabaCloud\Tea\Model;

class DemosdkStructA extends Model {
    protected $_name = [
        'companyName' => 'company_name',
        'productMainClass' => 'product_main_class',
        'companyAddress' => 'company_address',
        'contactName' => 'contact_name',
        'contactMobile' => 'contact_mobile',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->companyName) {
            $res['company_name'] = $this->companyName;
        }
        if (null !== $this->productMainClass) {
            $res['product_main_class'] = $this->productMainClass;
        }
        if (null !== $this->companyAddress) {
            $res['company_address'] = $this->companyAddress;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactMobile) {
            $res['contact_mobile'] = $this->contactMobile;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return DemosdkStructA
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['company_name'])){
            $model->companyName = $map['company_name'];
        }
        if(isset($map['product_main_class'])){
            $model->productMainClass = $map['product_main_class'];
        }
        if(isset($map['company_address'])){
            $model->companyAddress = $map['company_address'];
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_mobile'])){
            $model->contactMobile = $map['contact_mobile'];
        }
        return $model;
    }
    // 【公司名称】
    /**
     * @example xx公司
     * @var string
     */
    public $companyName;

    // 【业务类型】
    /**
     * @example 运营
     * @var string
     */
    public $productMainClass;

    // 【公司地址】
    /**
     * @example xx市xx区
     * @var string
     */
    public $companyAddress;

    // 【联系人】
    /**
     * @example 张三
     * @var string
     */
    public $contactName;

    // 【联系人手机号】
    /**
     * @example 13688888888
     * @var string
     */
    public $contactMobile;

}
