<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class CreateTwcNotaryContractOrganizationRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'creator' => 'creator',
        'idNumber' => 'id_number',
        'idType' => 'id_type',
        'legalPerson' => 'legal_person',
        'legalPersonId' => 'legal_person_id',
        'name' => 'name',
        'userId' => 'user_id',
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
        if (null !== $this->creator) {
            $res['creator'] = $this->creator;
        }
        if (null !== $this->idNumber) {
            $res['id_number'] = $this->idNumber;
        }
        if (null !== $this->idType) {
            $res['id_type'] = $this->idType;
        }
        if (null !== $this->legalPerson) {
            $res['legal_person'] = $this->legalPerson;
        }
        if (null !== $this->legalPersonId) {
            $res['legal_person_id'] = $this->legalPersonId;
        }
        if (null !== $this->name) {
            $res['name'] = $this->name;
        }
        if (null !== $this->userId) {
            $res['user_id'] = $this->userId;
        }
        return $res;
    }
    /**
     * @param array $map
     * @return CreateTwcNotaryContractOrganizationRequest
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
        if(isset($map['creator'])){
            $model->creator = $map['creator'];
        }
        if(isset($map['id_number'])){
            $model->idNumber = $map['id_number'];
        }
        if(isset($map['id_type'])){
            $model->idType = $map['id_type'];
        }
        if(isset($map['legal_person'])){
            $model->legalPerson = $map['legal_person'];
        }
        if(isset($map['legal_person_id'])){
            $model->legalPersonId = $map['legal_person_id'];
        }
        if(isset($map['name'])){
            $model->name = $map['name'];
        }
        if(isset($map['user_id'])){
            $model->userId = $map['user_id'];
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

    // 创建人个人账号ID，也就是调用个人账号创建接口（twc.notary.contract.account.create
    // ）返回的accountId
    /**
     * @var string
     */
    public $creator;

    // 证件号
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
    /**
     * @var string
     */
    public $idType;

    // 企业法人名称
    /**
     * @var string
     */
    public $legalPerson;

    // 企业法人证件号
    /**
     * @var string
     */
    public $legalPersonId;

    // 机构名称
    /**
     * @var string
     */
    public $name;

    // 机构唯一标识，可传入第三方平台机构id、企业证件号、企业邮箱等如果设置则作为账号唯一性字段，相同id不可重复创建。（个人用户与机构的唯一标识不可重复）
    /**
     * @var string
     */
    public $userId;

}
