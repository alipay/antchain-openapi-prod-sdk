<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\TWC\Models;

use AlibabaCloud\Tea\Model;

class ContractOrganizationApplication extends Model
{
    // 证件号
    /**
     * @example 12330100470104939U
     *
     * @var string
     */
    public $idNumber;

    // 证件类型，默认CRED_ORG_USCC，详见机构证件类型说明 （https://tech.antfin.com/docs/2/155166）
    /**
     * @example CRED_ORG_USCC
     *
     * @var string
     */
    public $idType;

    // 企业法人名称
    /**
     * @example 测试法人
     *
     * @var string
     */
    public $legalPerson;

    // 企业法人证件号
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $legalPersonId;

    // 机构名称
    /**
     * @example 测试企业
     *
     * @var string
     */
    public $name;

    // 机构唯一标识，可传入第三方平台的机构用户id等
    /**
     * @example B002
     *
     * @var string
     */
    public $organizationId;

    // 机构子类型：ENTERPRISE（企业）、SELF-EMPLOYED（个体工商户）、SUBSIDIARY（分公司）、OTHERORG（其他机构）。若填入这些类型，将会进行相应参数校验，例如：企业类型要求进行企业四要素校验，企业证件号必须是91开头，并且企业类型在签署时会需要授权后才可进行签署；个体工商户要求证件号必须是92开头，其余类型无其他校验。不填入此参数不会进行校验。
    /**
     * @example ENTERPRISE
     *
     * @var string
     */
    public $orgType;
    protected $_name = [
        'idNumber'       => 'id_number',
        'idType'         => 'id_type',
        'legalPerson'    => 'legal_person',
        'legalPersonId'  => 'legal_person_id',
        'name'           => 'name',
        'organizationId' => 'organization_id',
        'orgType'        => 'org_type',
    ];

    public function validate()
    {
        Model::validateRequired('idNumber', $this->idNumber, true);
        Model::validateRequired('idType', $this->idType, true);
        Model::validateRequired('name', $this->name, true);
    }

    public function toMap()
    {
        $res = [];
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
        if (null !== $this->orgType) {
            $res['org_type'] = $this->orgType;
        }

        return $res;
    }

    /**
     * @param array $map
     *
     * @return ContractOrganizationApplication
     */
    public static function fromMap($map = [])
    {
        $model = new self();
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
        if (isset($map['org_type'])) {
            $model->orgType = $map['org_type'];
        }

        return $model;
    }
}
