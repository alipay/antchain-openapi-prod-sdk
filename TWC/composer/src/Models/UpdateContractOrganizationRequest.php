<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class UpdateContractOrganizationRequest extends Model
{
    // OAuth模式下的授权token
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    // 证件号，该字段只有为空才允许修改
    /**
     * @var string
     */
    public $idNumber;

    // 证件类型 ，默认CRED_ORG_USCC
    /**
     * @var string
     */
    public $idType;

    // 企业法定代表人名称
    /**
     * @var string
     */
    public $legalPerson;

    // 企业法定代表人证件号
    /**
     * @var string
     */
    public $legalPersonId;

    // 机构名称
    /**
     * @var string
     */
    public $name;

    // 机构账号id，注册机构账户时返回的机构账号id
    /**
     * @var string
     */
    public $organizationId;
    protected $_name = [
        'authToken'         => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'idNumber'          => 'id_number',
        'idType'            => 'id_type',
        'legalPerson'       => 'legal_person',
        'legalPersonId'     => 'legal_person_id',
        'name'              => 'name',
        'organizationId'    => 'organization_id',
    ];

    public function validate()
    {
        Model::validateRequired('organizationId', $this->organizationId, true);
    }

    public function toMap()
    {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
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
        if (null !== $this->organizationId) {
            $res['organization_id'] = $this->organizationId;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return UpdateContractOrganizationRequest
     */
    public static function fromMap($map = [])
    {
        $model = new self();
        if (isset($map['auth_token'])) {
            $model->authToken = $map['auth_token'];
        }
        if (isset($map['product_instance_id'])) {
            $model->productInstanceId = $map['product_instance_id'];
        }
        if (isset($map['id_number'])) {
            $model->idNumber = $map['id_number'];
        }
        if (isset($map['id_type'])) {
            $model->idType = $map['id_type'];
        }
        if (isset($map['legal_person'])) {
            $model->legalPerson = $map['legal_person'];
        }
        if (isset($map['legal_person_id'])) {
            $model->legalPersonId = $map['legal_person_id'];
        }
        if (isset($map['name'])) {
            $model->name = $map['name'];
        }
        if (isset($map['organization_id'])) {
            $model->organizationId = $map['organization_id'];
        }

        return $model;
    }
}
