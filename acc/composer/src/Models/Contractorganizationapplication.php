<?php

// This file is auto-generated, don't edit it. Thanks.

namespace AntChain\ACC\Models;

use AlibabaCloud\Tea\Model;

class Contractorganizationapplication extends Model
{
    // 执照号码
    /**
     * @example 12330100470104939U
     *
     * @var string
     */
    public $idNumber;

    // 执照类型
    /**
     * @example CRED_ORG_USCC
     *
     * @var string
     */
    public $idType;

    // 法人名称
    /**
     * @example 测试法人
     *
     * @var string
     */
    public $legalPerson;

    // 法人证件号
    /**
     * @example 311111111111111111
     *
     * @var string
     */
    public $legalPersonId;

    // 企业名称
    /**
     * @example 测试企业
     *
     * @var string
     */
    public $name;

    // 组织id
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
        Model::validateRequired('legalPerson', $this->legalPerson, true);
        Model::validateRequired('legalPersonId', $this->legalPersonId, true);
        Model::validateRequired('name', $this->name, true);
        Model::validateRequired('organizationId', $this->organizationId, true);
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
     * @return Contractorganizationapplication
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
