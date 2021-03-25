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
    protected $_name = [
        'idNumber'       => 'id_number',
        'idType'         => 'id_type',
        'legalPerson'    => 'legal_person',
        'legalPersonId'  => 'legal_person_id',
        'name'           => 'name',
        'organizationId' => 'organization_id',
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

        return $model;
    }
}
