<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DD\Models;

use AlibabaCloud\Tea\Model;

class QueryAntcloudInvoiceIntlconfigUserinfoResponse extends Model {
    protected $_name = [
        'reqMsgId' => 'req_msg_id',
        'resultCode' => 'result_code',
        'resultMsg' => 'result_msg',
        'tenantId' => 'tenant_id',
        'taxPayerQualification' => 'tax_payer_qualification',
        'name' => 'name',
        'country' => 'country',
        'countryCode' => 'country_code',
        'address' => 'address',
        'contactName' => 'contact_name',
        'contactEmail' => 'contact_email',
        'contactTel' => 'contact_tel',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->reqMsgId) {
            $res['req_msg_id'] = $this->reqMsgId;
        }
        if (null !== $this->resultCode) {
            $res['result_code'] = $this->resultCode;
        }
        if (null !== $this->resultMsg) {
            $res['result_msg'] = $this->resultMsg;
        }
        if (null !== $this->tenantId) {
            $res['tenant_id'] = $this->tenantId;
        }
        if (null !== $this->taxPayerQualification) {
            $res['tax_payer_qualification'] = $this->taxPayerQualification;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->country) {
            $res['country'] = $this->country;
        }
        if (null !== $this->countryCode) {
            $res['country_code'] = $this->countryCode;
        }
        if (null !== $this->address) {
            $res['address'] = $this->address;
        }
        if (null !== $this->contactName) {
            $res['contact_name'] = $this->contactName;
        }
        if (null !== $this->contactEmail) {
            $res['contact_email'] = $this->contactEmail;
        }
        if (null !== $this->contactTel) {
            $res['contact_tel'] = $this->contactTel;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return QueryAntcloudInvoiceIntlconfigUserinfoResponse
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['req_msg_id'])){
            $model->reqMsgId = $map['req_msg_id'];
        }
        if(isset($map['result_code'])){
            $model->resultCode = $map['result_code'];
        }
        if(isset($map['result_msg'])){
            $model->resultMsg = $map['result_msg'];
        }
        if(isset($map['tenant_id'])){
            $model->tenantId = $map['tenant_id'];
        }
        if(isset($map['tax_payer_qualification'])){
            $model->taxPayerQualification = $map['tax_payer_qualification'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['country'])){
            $model->country = $map['country'];
        }
        if(isset($map['country_code'])){
            $model->countryCode = $map['country_code'];
        }
        if(isset($map['address'])){
            $model->address = $map['address'];
        }
        if(isset($map['contact_name'])){
            $model->contactName = $map['contact_name'];
        }
        if(isset($map['contact_email'])){
            $model->contactEmail = $map['contact_email'];
        }
        if(isset($map['contact_tel'])){
            $model->contactTel = $map['contact_tel'];
        }
        return $model;
    }
    // 请求唯一ID，用于链路跟踪和问题排查
    /**
     * @var string
     */
    public $reqMsgId;

    // 结果码，一般OK表示调用成功
    /**
     * @var string
     */
    public $resultCode;

    // 异常信息的文本描述
    /**
     * @var string
     */
    public $resultMsg;

    // 租户ID
    /**
     * @var string
     */
    public $tenantId;

    // 纳税人类型，国际商户为03
    /**
     * @var string
     */
    public $taxPayerQualification;

    // 公司名称
    /**
     * @var string
     */
    public $name;

    // 国家地区
    /**
     * @var string
     */
    public $country;

    // 国家地区编号，如CN
    /**
     * @var string
     */
    public $countryCode;

    // 公司地址
    /**
     * @var string
     */
    public $address;

    // 联系人姓名
    /**
     * @var string
     */
    public $contactName;

    // 联系人邮箱
    /**
     * @var string
     */
    public $contactEmail;

    // 联系人电话
    /**
     * @var string
     */
    public $contactTel;

}
